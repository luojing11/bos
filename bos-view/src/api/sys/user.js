import request from '@/utils/request'

export function add(data) {
  return request({
    url: '/user/add',
    method: 'post',
    params: data
  })
}

export function deleteUser(id) {
  return request({
    url: '/user/deleteUser',
    method: 'get',
    params:{id}
  })
}

export function update(data) {
  return request({
    url: '/user/updateUser',
    method: 'post',
    params : data
  })
}

export function list(data) {
  return request({
    url: '/user/list',
    method: 'post',
    params: data
  })
}

