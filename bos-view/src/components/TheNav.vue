<template>
<el-aside style="min-height: 100%; background-color: #545c64; overflow: hidden">
  <el-menu class="el-menu-vertical-demo" :default-openeds="['1','2']" router default-active="/CarouselTable" @open="handleOpen" @close="handleClose"
    background-color="#545c64" text-color="#fff" active-text-color="#409EFF">
    <el-submenu index="1">
      <template slot="title">
        <i class="el-icon-document"></i>
        <span>导航一</span>
      </template>
      <el-menu-item-group>
        <el-menu-item index="/CarouselTable">轮播图和表格</el-menu-item>
        <el-menu-item index="/Echarts">图表(Echarts)</el-menu-item>
      </el-menu-item-group>
    </el-submenu>
    <el-submenu index="2">
      <template slot="title">
        <i class="el-icon-setting"></i>
        <span>导航二</span>
      </template>
      <el-menu-item-group>
        <el-menu-item index="/FormView">个人中心(表单)</el-menu-item>
      </el-menu-item-group>
    </el-submenu>
  </el-menu>
</el-aside>
</template>

<script>
export default {
  name: 'TheNav',
  methods: {
    handleOpen (key, keyPath) {
      console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      console.log(key, keyPath)
    }
  }
}
</script>

<style scoped lang="scss">
</style>
