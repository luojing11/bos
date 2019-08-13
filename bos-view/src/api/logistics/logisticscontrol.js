import request from '@/utils/request'

export function add(data) {
  return request({
    url: '/logistics/addLogistics',
    method: 'post',
    params: data
  })
}

export function deleteLogistics(id) {
  return request({
    url: '/logistics/deleteLogistics',
    method: 'get',
    params:{id}
  })
}

export function update(data) {
  return request({
    url: '/logistics/updateLogistics',
    method: 'post',
    data : data
  })
}

export function list(data) {
  return request({
    url: '/logistics/listLogistics',
    method: 'post',
    params: data
  })
}
