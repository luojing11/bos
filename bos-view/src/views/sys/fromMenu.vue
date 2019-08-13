<template>
  <div>
    <echart :dataOne ="dataOne" :dataTwo="dataTwo" :dataDay="dataDay" />
  </div>
</template>

<script>
 import Echart from '@/components/TwoEcharts'
 import {echartsList } from '@/api/reportforms/reportforms'
  export default {
    name: 'Charts',
      data () {
        return {
            dataOne: [],
            dataTwo: [],
            dataThree:[],
            dataDay:[],
            typeBoolean: true,
            date: ''
        }
      },
    created() {
      this.getList()
    },
    methods:{
      getList() {
        echartsList().then(response => {
          this.dataOne= response.data.dataOne
          this.dataTwo=response.data.dataTwo
          this.dataDay=response.data.dataDay
        })

      },
    },
    computed: {
      type: function () {
        return this.typeBoolean ? 'bar' : 'line'
      }
    },
    components: {
      Echart
    }
  }
</script>

<style scoped lang="scss">
  .filter-charts {
    border: 1px solid rgba(155, 155, 155, 0.2)
  }
</style>
