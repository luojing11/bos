import request from '@/utils/request'
export function echartsList(data) {
  return request({
    url: '/reportforms/reportformsList',
    method: 'post',
    data: data
  })
}
