<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.username" placeholder="用户名" style="width: 200px;" class="filter-item"/>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
        添加
      </el-button>
    </div>
    <!--  数据表格
     @cell-mouse-enter="handleMouseEnter"
      @cell-mouse-leave="handleMouseOut"-->
    <el-table
      :key="tableKey"
      v-loading="listLoading"
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
          <span class="link-type">{{ row.username }}</span>
        </template>
      </el-table-column>
      <el-table-column label="创建人" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.createBy}}</span>
        </template>
      </el-table-column>
      <el-table-column label="创建时间" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.createTime | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="更新人" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.lastUpdateBy }}</span>
        </template>
      </el-table-column>
      <el-table-column label="更新时间" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.lastUpdateTime | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
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
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="70px" style="width: 300px; margin-left:50px;">
        <!--        数据校验要求prop值和temp.属性名一致-->
        <el-upload
          action="/mgr/common/imgUpload"
          list-type="picture-card"
          accept="image/*"
          :limit="imgLimit"
          :file-list="productImgs"
          :multiple="isMultiple"
          :on-preview="handlePictureCardPreview"
          :on-remove="handleRemove"
          :on-success="handleAvatarSuccess"
          :before-upload="beforeAvatarUpload"
          :on-exceed="handleExceed"
          :on-error="imgUploadError">
          <i class="el-icon-plus"></i>
        </el-upload>
        <el-dialog :visible.sync="dialogVisible">
          <img width="100%" :src="dialogImageUrl" alt="">
        </el-dialog>
        <el-form-item label="部门" prop="dept">
          <el-select v-model="temp.deptId" placeholder="请选择">
            <el-option-group
              v-for="group in deptList"
              :key="group.id"
              :label="group.name">
              <el-option-group
                v-for="items in group.items"
                :key="items.id"
                :label="items.name"
                :value="items.id">
                <el-option
                  v-for="item in items.items"
                  :key="item.id"
                  :label="item.name"
                  :value="item.id">
                </el-option>
              </el-option-group>
            </el-option-group>
          </el-select>
        </el-form-item>
        <!--        数据校验要求prop值和temp.属性名一致-->
        <el-form-item label="用户名" prop="username">
          <el-input v-model="temp.username" />
        </el-form-item>
        <el-form-item label="密码" prop="password">
          <el-input v-model="temp.password" show-password/>
        </el-form-item>
        <el-form-item label="邮箱" prop="email">
          <el-input v-model="temp.email" />
        </el-form-item>
        <el-form-item label="手机号码" prop="mobile">
          <el-input v-model="temp.mobile" />
        </el-form-item>
        <el-form-item label="个人简绍" prop="introduction">
          <el-input
            type="textarea"
            placeholder="请输入内容"
            v-model="temp.introduction"
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
  import { add, update, list, deleteUser } from '@/api/sys/user'
  import {groupDept} from "../../api/sys/dept";
  import waves from '@/directive/waves' // waves directive
  import Pagination from '@/components/Pagination' // 分页组件

  export default {
    name: 'userTable',
    components: { Pagination },
    directives: { waves },
    data() {
      const validatePassword = (rule, value, callback) => {
        if (value.length < 5) {
          callback(new Error('密码不能少于6位'))
        } else {
          callback()
        }
      }
      const validateEmail = (rule, value, callback) => {
        if (/^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/.test(value) || !value) {
          callback()
        } else {
          callback(new Error('请输入正确邮箱'))
        }
      }
      const validateDeptId = (rule, value, callback) => {
        if (value>=1) {
          callback()
        } else {
          callback(new Error('请选择部门'))
        }
      }
      // 设置手机号的验证规则
      const checkPhone = (rule, value, callback) => {
        if (!value) {
          callback(new Error('请输入联系方式'))
        } else {
          const reg = /^1[3|4|5|7|8][0-9]\d{8}$/
          if (reg.test(value)) {
            callback()
          } else {
            return callback(new Error('请输入正确的电话'))
          }
        }
      }
      return {
        imageUrl: '',
        avatar: '',
        dialogVisible: false,
        disabled: false,
        tableKey: 0,
        list: null, // 后台返回，给数据表格展示的数据
        total: 0, // 总记录数
        listLoading: true, // 是否使用动画
        listQuery: {
          page: 1, // 分页需要的当前页
          limit: 5, // 分页需要的每页显示多少条
          username: '',
          dept:1,
        },
        deptList: [],
        temp: { // 添加、修改时绑定的表单数据
          id: undefined,
          username: '',
          password:'',
          email:'',
          mobile:'',
          deptId: '',
          introduction:'',
          avatar: '',
        },
        title: '添加', // 对话框显示的提示 根据dialogStatus create
        dialogFormVisible: false, // 是否显示对话框
        dialogStatus: '', // 表示表单是添加还是修改的
        rules: {
          deptId: [{required: true, trigger: 'change , blur',validator:validateDeptId }],
          email: [{required: true, trigger: 'change',validator:validateEmail }],
          password: [{ required: true, trigger: 'blur', validator: validatePassword }],
          username: [{ required: true, message: '用户名必填', trigger: 'blur' }],
          mobile: [{ required: true, trigger: 'blur', validator:checkPhone }]
        }
      }
    },
    // 创建实例时的钩子函数
    created() {
      this.getList()
      this.getDept()
    },
    methods: {
      handleAvatarSuccess(res, file) {
        this.imageUrl = URL.createObjectURL(file.raw);
      },
      beforeAvatarUpload(file) {
        const isJPG = file.type === 'image/jpeg';
        const isLt2M = file.size / 1024 / 1024 < 2;

        if (!isJPG) {
          this.$message.error('上传头像图片只能是 JPG 格式!');
        }
        if (!isLt2M) {
          this.$message.error('上传头像图片大小不能超过 2MB!');
        }
        return isJPG && isLt2M;
      },
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
          // 转圈圈结束
          this.listLoading = false
        })


      },
      // 重置表单数据
      resetTemp() {
        this.temp = {
          id: undefined,
          username: '',
          password:'',
          email:'',
          mobile:'',
          deptId: '',
          introduction:'',
          avatar: '',
        }
      },
      // 显示添加的对话框
      handleCreate () {
        // 重置表单数据
        this.resetTemp()
        // 点击确定时，是执行添加操作
        this.dialogStatus = 'create'
        this.title="添加用户"
        // 显示对话框
        this.dialogFormVisible = true
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
              this.getList()
              // 关闭对话框
              this.dialogFormVisible = false
              // 显示一个通知
              this.$notify({
                title:response.data.title,
                message:response.data.message,
                type: 'success',
                duration: 2000
              })
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
        this.title = '修改用户'
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
        // // 先弹确认取消框
        // this.$confirm('确认删除【'+row.username+'】的信息吗?', '提示', {
        //   confirmButtonText: '确定',
        //   cancelButtonText: '取消',
        //   type: 'warning'
        // }).then(() => {
          // 调用ajax去后台删除
          deleteUser(row.id).then((response) => {
            // 刷新数据表格
            this.getList()
            // ajax去后台删除
            this.$notify({
              title: '成功',
              message: response.data.message,
              type: 'success',
              duration: 2000
            })
          })
        // }).catch(() => {
        //   this.$message({
        //     type: 'info',
        //     message: '已取消删除'
        //   });
        // });
      },
      // handleMouseEnter(){
      //   //alert(111)
      // }
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

