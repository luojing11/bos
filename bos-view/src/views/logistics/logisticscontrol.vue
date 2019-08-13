<template>
  <div class="app-container">
    <div class="filter-container">
      工作单号:<el-input v-model="listQuery.worksheetno" placeholder="请输入工作单号" style="width: 200px;" class="filter-item"/>
      代理公司:<el-input v-model="listQuery.corporation" placeholder="请输入代理公司" style="width: 200px;" class="filter-item"/>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
        查询
      </el-button>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-refresh" @click="resetListQuery">
        重置
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-circle-plus-outline" @click="handleCreate">
        添加
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-more" @click="ok=!ok">
       更多
      </el-button>
    </div>
    <div v-show="!ok">
      起止时间:<el-date-picker style="width: 200px"
        v-model="listQuery.inputdate"
        type="date"
        size="small" value-format="yyyy-MM-dd"
        placeholder="选择日期">
      </el-date-picker>
      录入人:  <el-input v-model="listQuery.username" placeholder="请输入录入人" style="width: 200px;" class="filter-item"/>
    </div>

    <!--  数据表格
      @cell-mouse-leave="handleMouseOut"-->
    <el-table
      @cell-mouse-enter="handleMouseEnter"
      :key="tableKey"
      v-loading="listLoading"
      element-loading-text="拼命加载中"
      element-loading-spinner="el-icon-loading"
      :data="list"
      border
      fit
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column
        type="index"
        label="ID">
      </el-table-column>
      <!--      <el-table-column type="index" label="ID" prop="id" sortable="custom" align="center" width="80">-->
      <!--        <template slot-scope="scope">-->
      <!--          <span>{{ scope.row.id }}</span>-->
      <!--        </template>-->
      <!--      </el-table-column>-->
      <el-table-column label="用户名" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.worksheetno }}</span>
        </template>
      </el-table-column>
      <el-table-column label="代理公司" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.corporation }}</span>
        </template>
      </el-table-column>
      <el-table-column label="货票号" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.waybillid }}</span>
        </template>
      </el-table-column>
      <el-table-column label="备注" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.remarks }}</span>
        </template>
      </el-table-column>
      <el-table-column label="录入人" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.sysUser.username }}</span>
        </template>
      </el-table-column>
      <el-table-column label="录入时间" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.inputdate | parseTime('{y}-{m}-{d} {h}:{i}')  }}</span>
        </template>
      </el-table-column>
      <!--     自定义列-->
      <el-table-column label="操作" align="center" width="230" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">
            修改
          </el-button>
          <el-button size="mini" type="danger" @click="handleDelete(row)">
            删除
          </el-button>
        </template>
      </el-table-column>
    </el-table>
    <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />

    <!--  绑定了title，是一个数组里取的，表示是修改的标题还是添加的标题
      visible.sync 对话框是否显示
    -->
    <el-dialog :title="title" :visible.sync="dialogFormVisible">
      <!--
          rules:校验规则
          model:数据绑定
      -->
      <el-form ref="dataForm"  :inline="true" :rules="rules" :model="temp"  label-width="80px" size="mini">
        <el-form-item label="工作单号" prop="worksheetno">
          <el-input  :disabled="true" v-model="temp.worksheetno" placeholder="工作单号+作废标准必须唯一"/>
        </el-form-item>
<!--        <el-form-item label="类型" prop="ctype">-->
<!--          <el-input v-model="temp.ctype" placeholder="请输入类型"/>-->
<!--        </el-form-item>-->
        <el-form-item label="代理公司" prop="corporation">
          <el-input v-model="temp.corporation" placeholder="请输入单利公司"/>
        </el-form-item>
        <el-form-item label="货票号" prop="waybillid">
          <el-input  :disabled="true" v-model="temp.waybillid" placeholder="请输入货票号"/>
        </el-form-item>
        <el-form-item label="备注" prop="remarks">
          <el-input
            type="textarea"
            placeholder="请输入备注"
            v-model="temp.remarks"
            maxlength="30"
            show-word-limit
          >
          </el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">
          取消
        </el-button>
        <!--
          dialogStatus==='create'?createData():updateData()
          dialogStatus需要我们根据情况去改变
        -->
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">
          确认
        </el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
  //
  import { add, update, list, deleteLogistics } from '@/api/logistics/logisticscontrol'
  import {groupDept} from "../../api/sys/dept";
  import waves from '@/directive/waves' // waves directive
  import Pagination from '@/components/Pagination' // 分页组件

  export default {
    name: 'userTable',
    components: { Pagination },
    directives: { waves },
    data() {
      return {
        ok:true,
        tableKey: 0,
        list: null, // 后台返回，给数据表格展示的数据
        total: 0, // 总记录数
        listLoading: true, // 是否使用动画
        listQuery: {
          page: 1, // 分页需要的当前页
          limit: 5, // 分页需要的每页显示多少条
          worksheetno: '',
          corporation:'',
          inputdate:'',
          username:''
        },
        temp: { // 添加、修改时绑定的表单数据
          id: undefined,
          worksheetno: '',
          corporation:'',
          waybillid:'',
          remarks:'',
        },
        GZD:'',
        FP:'',
        title: '添加', // 对话框显示的提示 根据dialogStatus create
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 表示表单是添加还是修改的
        rules: {
          worksheetno: [{ required: true, message: '请输入工作单号', trigger: 'blur' }],
          // ctype: [{ required: true, message: '请输入类型', trigger: 'blur' }],
          corporation: [{ required: true, message: '请输入代理公司', trigger: 'blur' }],
          waybillid: [{ required: true, message: '请输入货票号货票号', trigger: 'blur' }],
          remarks: [{ required: true, message: '请输入备注', trigger: 'blur' }],
        }
      }
    },
    // 创建实例时的钩子函数
    created() {
      this.getList()
      this.getDept()
    },
    methods: {
      getDept() {
        groupDept().then( (response) => {
          this.deptList=response.data.deptList
        })
      },
      // 去后台取数据的
      getList() {
        this.listLoading = true
        list(this.listQuery).then(response => {
          this.list=response.data.items
          this.total = response.data.total
          this.FP=response.data.FP
          this.GZD=response.data.GZD
          // 转圈圈结束
          this.listLoading = false
        })


      },
      // 重置表单数据
      resetTemp() {
        this.temp = {
          id: undefined,
          worksheetno: '',
          corporation:'',
          waybillid:'',
          remarks:'',
        }
      },
      resetListQuery(){
        this.listQuery={
          worksheetno: '',
          corporation:'',
          inputdate:'',
          inputcompany:'',
        }
      },
      // 显示添加的对话框
      handleCreate () {
        // 重置表单数据
        this.resetTemp()
        // 点击确定时，是执行添加操作
        this.dialogStatus = 'create'
        this.title="添加物流"
        // 显示对话框
        this.dialogFormVisible = true
        this.temp.worksheetno=this.GZD
        this.temp.waybillid=this.FP
        this.$nextTick(() => {
          // 表单清除验证
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 添加对话框里，点击确定，执行添加操作
      createData() {
        // 表单校验
        this.$refs['dataForm'].validate((valid) => {
          // 所有的校验都通过
          if (valid) {
            console.debug(this.temp)
            // 调用api里的sys里的user.js的ajax方法
            add(this.temp).then((response) => {
              // 关闭对话框
              this.dialogFormVisible = false
              // 显示一个通知
              this.$notify({
                title:response.data.title,
                message:response.data.message,
                type: 'success',
                duration: 2000
              })
              this.getList()
            })
          }
        })
      },
      // 显示修改对话框
      handleUpdate(row) {
        // 将row里面与temp里属性相同的值，进行copy
        this.temp = Object.assign({}, row) // copy obj
        // 将对话框里的确定点击时，改为执行修改操作
        this.dialogStatus = 'update'
        // 修改标题
        this.title = '修改物流'
        // 显示修改对话框
        this.dialogFormVisible = true
        this.$nextTick(() => {
          // 清除校验
          this.$refs['dataForm'].clearValidate()
        })
      },
      // 执行修改操作
      updateData() {
        this.$refs['dataForm'].validate((valid) => {
          // 表单校验通过
          if (valid) {
            // 将temp拷贝到tempData
            const tempData = Object.assign({}, this.temp)
            // 进行ajax提交
            // console.debug(this.temp+'111111111111111')
            update(tempData).then((response) => {
              // 提交完毕，关闭对话框
              this.dialogFormVisible = false
              // 显示通知
              this.$notify({
                title: '成功',
                message:response.data.message,
                type: 'success',
                duration: 2000
              })
              this.getList()
            })
          }
        })
      },
      handleDelete(row) {
        //先弹确认取消框
        this.$confirm('确认删除【'+row.worksheetno+'】的信息吗?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
        //调用ajax去后台删除
        deleteLogistics(row.id).then((response) => {
          // 刷新数据表格
          this.getList()
          // ajax去后台删除
          this.$notify({
            title: response.data.title,
            message: response.data.message,
            type: 'success',
            duration: 2000
          })
        })
        }).catch(() => {
          this.$message({
            type: 'info',
            message: '已取消删除'
          });
        });
      },
    }
  }
</script>

<style>
  .avatar-uploader .el-upload {
    border: 1px dashed #d9d9d9;
    border-radius: 6px;
    cursor: pointer;
    position: relative;
    overflow: hidden;
  }
  .avatar-uploader .el-upload:hover {
    border-color: #409EFF;
  }
  .avatar-uploader-icon {
    font-size: 28px;
    color: #8c939d;
    width: 38px;
    height: 38px;
    line-height: 38px;
    text-align: center;
  }
  .avatar {
    width: 38px;
    height: 38px;
    display: block;
  }
</style>

