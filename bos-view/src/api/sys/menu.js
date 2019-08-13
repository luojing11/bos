import request from '@/utils/request'

export function add(user) {
  return request({
    url: '/user/add',
    method: 'post',
    params: user
  })
}

export function deleteUser(id) {
  return request({
    url: '/user/deleteUser',
    method: 'get',
    params: { id }
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
    url: '/menu/list',
    method: 'post',
    prams: data
  })
}

export function listUtil(data) {
  return request({
    url: '/menu/listUtil',
    method: 'post',
    prams: data
  })
}
