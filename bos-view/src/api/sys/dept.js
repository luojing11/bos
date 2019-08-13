
import request from '@/utils/request'

export function groupDept() {
  return request({
    url: '/dept/groupDept',
    method: 'get',
  })
}

export function add(data) {
  return request({
    url: '/dept/deptAdd',
    method: 'post',
    params: data
  })
}

export function deleteDept(id) {
  return request({
    url: '/user/deleteDept',
    method: 'psot',
    params: { id }
  })
}

export function update(data) {
  return request({
    url: '/dept/deptUpdate',
    method: 'post',
    params : data
  })
}

export function list(data) {
  return request({
    url: '/dept/deptList',
    method: 'post',
    params: data
  })
}
