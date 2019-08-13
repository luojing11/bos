<template>
<div>
  <div class="filter-charts">
      <el-date-picker style="margin: 20px" v-model="date" value-format="yyyy-MM-dd" size="small" type="date" placeholder="选择日期"></el-date-picker>
      <el-switch v-model="typeBoolean" active-color="#00B5FF" inactive-color="#7ED321" active-text="bar" inactive-text="line"></el-switch>
      <el-button style="margin-left: 50px; margin-bottom: 20px" type="primary" @click="handleSure">确定</el-button>
    </div>
  <div class="two-charts">
    <div id="chartOne" class="chart"></div>
    <div id="chartTwo" class="chart"></div>
  </div>
</div>
</template>

<script>
import echarts from 'echarts'
export default {
  props:["dataOne","dataTwo","dataDay"],
  data () {
    return {
      myChartOne: null,
      myChartTwo: null,
      date: '',
      typeBoolean: true
    }
  },
  computed: {
    type: function () {
      return this.typeBoolean ? 'bar' : 'line'
    }
  },
  methods: {
    initCharts () {
      this.myChartOne = echarts.init(document.getElementById('chartOne'))
      this.myChartTwo = echarts.init(document.getElementById('chartTwo'))
      this.myChartOne.setOption({
        title: {text: this.date},
        legend: {
          data: ['one', 'two'],
          right: 10
        },
        grid: {
          top: 120
        },
        yAxis: [
          {
            name: '蓝色',
            type: 'value',
            axisLine: {
              show: false
            },
            axisTick: {
              show: false
            },
            axisLabel: {
              color: '#666',
              fontSize: 12
            }
          },
          {
            name: '绿色',
            type: 'value',
            axisLine: {
              show: false
            },
            axisTick: {
              show: false
            },
            axisLabel: {
              color: '#666',
              fontSize: 12
            }
          }
        ],
        xAxis: {
          axisTick: {
            show: false
          },
          axisLabel: {
            color: '#666',
            fontSize: 12,
            margin: 12
          },
          data:['一月','二月','三月','四月','五月']
        },
        series: [
          {
            name: 'one',
            yAxisIndex: 0,
            data: [],
            type: 'bar',
            color: '#00B5FF'
          },
          {
            name: 'two',
            yAxisIndex: 1,
            data: [],
            type: 'bar',
            color: '#7ED321'
          }
        ]
      })
      this.myChartTwo.setOption({
        title: {text: this.date},
        legend: {
          data: ['one', 'two'],
          right: 10
        },
        grid: {
          top: 120
        },
        yAxis: [
          {
            name: '蓝色',
            type: 'value',
            axisLine: {
              show: false
            },
            axisTick: {
              show: false
            },
            axisLabel: {
              color: '#666',
              fontSize: 12
            }
          },
          {
            name: '绿色',
            type: 'value',
            axisLine: {
              show: false
            },
            axisTick: {
              show: false
            },
            axisLabel: {
              color: '#666',
              fontSize: 12
            }
          }
        ],
        xAxis: {
          axisTick: {
            show: false
          },
          axisLabel: {
            color: '#666',
            fontSize: 12,
            margin: 12
          },
          data:['一月','二月','三月','四月','五月']
        },
        series: [
          {
            name: 'one',
            yAxisIndex: 0,
            data: [],
            type: 'bar',
            color: '#00B5FF'
          },
          {
            name: 'two',
            yAxisIndex: 1,
            data: [],
            type: 'bar',
            color: '#7ED321'
          }
        ]
      })
      this.myChartOne.showLoading()
      this.myChartTwo.showLoading()
    },
    handleSure () {
      if (this.date === '') return
      var newSeries = []
      if (this.typeBoolean) {
        newSeries = [
          {
            name: 'one',
            type: this.type,
            color: '#00B5FF'
          },
          {
            name: 'two',
            type: this.type,
            color: '#7ED321'
          }
        ]
      } else {
        newSeries = [
          {
            name: 'one',
            type: this.type,
            color: '#00B5FF',
            symbolSize: 6,
            lineStyle: {
              width: 4
            }
          },
          {
            name: 'two',
            type: this.type,
            color: '#7ED321',
            symbolSize: 6,
            lineStyle: {
              width: 4
            }
          }
        ]
      }
      this.myChartOne.setOption({
        title: {
          text: this.date
        },
        series: [{...newSeries[0], data: this.dataTwo}, {...newSeries[1], data: this.dataOne}]
      })
      this.myChartTwo.setOption({
        title: {
          text: this.date
        },
        series: [{...newSeries[0], data: this.dataTwo}, {...newSeries[1], data: this.dataOne}]
      })
    }
  },
  mounted () {
    this.initCharts()
    var $this = this
    setTimeout(function () {
      $this.myChartOne.setOption({
        series: [
          {
            name: 'one',
            data: $this.dataOne
          },
          {
            name: 'two',
            data: $this.dataTwo
          }
        ]
      })
      $this.myChartTwo.setOption({
        series: [
          {
            name: 'one',
            data: $this.dataTwo
          },
          {
            name: 'two',
            data: $this.dataOne
          }
        ]
      })
      $this.myChartOne.hideLoading()
      $this.myChartTwo.hideLoading()
    }, 1000)
  }
}
</script>

<style scoped lang="scss">

.filter-charts {
  border: 1px solid rgba(255, 255, 255, 0.2)
}
.two-charts {
  display: flex;
  display: -webkit-flex;
  flex-wrap: wrap;
  .chart {
    height: 300px;
    @media screen and (min-width:){
      height: 500px;
    }
    width: 50%;
    min-width: 300px;
    padding-top: 20px
  }
}
</style>
