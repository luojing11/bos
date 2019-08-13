import request from '@/utils/request'

export function list(data) {
  return request({
    url: '/role/list',
    method: 'post',
    params :data
  })
}

export function add(data) {
  return request({
    url: '/role/roleAdd',
    method: 'post',
    params :data
  })
}

export function update(data) {
  return request({
    url: '/role/roleUpdate',
    method: 'post',
    params :data
  })
}


export function deleteRole(id) {
  return request({
    url: '/role/roleDelete',
    method: 'get',
    params: {id}
  })
}


