import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Layout */
import Layout from '@/layout'

/* Router Modules */
import componentsRouter from './modules/components'
import chartsRouter from './modules/charts'
import tableRouter from './modules/table'
import nestedRouter from './modules/nested'

/**
 * 注意: 子菜单只有在 route children.length >= 1 才出现
 * 详情参见: https://panjiachen.github.io/vue-element-admin-site/guide/essentials/router-and-nav.html
 *
 * hidden: true                   如果设置为true，项目将不会显示在侧栏中(默认为false)
 * alwaysShow: true               如果设置为true，将始终显示根菜单
 *                                如果不总是设置show，当项目有多个子路由时，
 *                                它将成为嵌套模式，否则不显示根菜单
 * redirect: noRedirect           如果设置noRedirect，则不会在面包屑中重定向
 * name:'router-name'             名称由<keep-alive>(必须设置!!)使用
 * meta : {
    roles: ['admin','editor']    控制页面角色(可以设置多个角色)
    title: 'title'               名称显示在侧边栏和面包屑(推荐设置)
    icon: 'svg-name'             图标显示在侧栏中
    noCache: true                如果设置为true，页面将不会被缓存(默认为false)
    affix: true                  如果设置为true，则标记将附加在标记视图中
    breadcrumb: false            如果设置为false，则该项将隐藏在breadcrumb中(默认为true)
    activeMenu: '/example/list'  如果设置路径，侧栏将突出显示您设置的路径
  }
 */

/**
 * constantRoutes
 * 不需要验证的全局视图
 * 所有的角色都可以查看
 */

export const constantRoutes = [
  {
    path: '/redirect',
    component: Layout,
    hidden: true,
    children: [
      {
        path: '/redirect/:path*',
        component: () => import('@/views/redirect/index')
      }
    ]
  },
  {
    path: '/login',
    component: () => import('@/views/login/index'),
    hidden: true
  },
  {
    path: '/404',
    component: () => import('@/views/error-page/404'),
    hidden: true
  },
  {
    path: '/401',
    component: () => import('@/views/error-page/401'),
    hidden: true
  },
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    children: [
      {
        path: 'dashboard',
        component: () => import('@/views/dashboard/index'),
        name: 'dashboard',
        meta: { title: '工作台', icon: 'dashboard', affix: true }
      }
    ]
  }
]

/**
 * asyncRoutes
 * the routes that need to be dynamically loaded based on user roles
 */
export const asyncRoutes = [
  {
    path: '/sys',
    component: Layout,
    redirect: '/sys/user',
    alwaysShow: true, // will always show the root menu
    name: 'sys',
    meta: {
      title: '系统管理',
      icon: 'example',
      roles: ['admin', 'editor'] // you can set roles in root nav
    },
    children: [
      {
        path: 'user',
        component: () => import('@/views/sys/user'),
        name: 'user',
        meta: { title: '用户管理',roles: ['admin','dev','test'] },
      },
      {
        path: 'role',
        component: () => import('@/views/sys/role'),
        name: 'role',
        meta: { title: '角色管理',roles: ['admin'] },
      },
      {
        path: 'menu',
        component: () => import('@/views/sys/menu'),
        name: 'menu',
        meta: { title: '菜单管理',roles: ['admin'] },
      },
      {
        path: 'dept',
        component: () => import('@/views/sys/dept'),
        name: 'dept',
        meta: { title: '部门管理',roles: ['admin'] },
      },
      {
        path: 'statement',
        component: () => import('@/views/sys/fromMenu'),
        name: 'statement',
        meta: { title: '报表',roles: ['admin'] },
      }
    ]
  },
  {
    path: '/logistics',
    component: Layout,
    redirect: '/logistics',
    alwaysShow: true, // will always show the root menu
    name: 'logistics',
    meta: {
      title: '大物流管理',
      icon: 'example',
      roles: ['admin'] // you can set roles in root nav
    },
    children: [
      {
        path: 'logistics',
        component: () => import('@/views/logistics/logisticscontrol'),
        name: 'logistics',
        meta: { title: '大物流发货对照表',roles: ['admin'] },
      },
      {
        path: 'pick',
        component: () => import('@/views/table/complex-table'),
        name: 'pick',
        meta: { title: '收派标准',roles: ['dev'] },
      },
      {
        path: 'bus',
        component: () => import('@/views/table/complex-table'),
        name: 'bus',
        meta: { title: '班车设置',roles: ['dev'] },
      }
    ]
  },
  // 404 page must be placed at the end !!!
  { path: '*', redirect: '/404', hidden: true }
]

const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter() {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default router
