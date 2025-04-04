import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import qingkuangfankui from '@/views/modules/qingkuangfankui/list'
    import discusschongwulingyang from '@/views/modules/discusschongwulingyang/list'
    import siliaozhonglei from '@/views/modules/siliaozhonglei/list'
    import siliaogoumai from '@/views/modules/siliaogoumai/list'
    import discusssiliaogoumai from '@/views/modules/discusssiliaogoumai/list'
    import chongwuzhonglei from '@/views/modules/chongwuzhonglei/list'
    import forum from '@/views/modules/forum/list'
    import lingyangxiangqing from '@/views/modules/lingyangxiangqing/list'
    import chongwulingyang from '@/views/modules/chongwulingyang/list'
    import yonghu from '@/views/modules/yonghu/list'
    import orders from '@/views/modules/orders/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '宠物资讯',
        component: news
      }
          ,{
	path: '/qingkuangfankui',
        name: '情况反馈',
        component: qingkuangfankui
      }
          ,{
	path: '/discusschongwulingyang',
        name: '宠物领养评论',
        component: discusschongwulingyang
      }
          ,{
	path: '/siliaozhonglei',
        name: '饲料种类',
        component: siliaozhonglei
      }
          ,{
	path: '/siliaogoumai',
        name: '饲料购买',
        component: siliaogoumai
      }
          ,{
	path: '/discusssiliaogoumai',
        name: '饲料购买评论',
        component: discusssiliaogoumai
      }
          ,{
	path: '/chongwuzhonglei',
        name: '宠物种类',
        component: chongwuzhonglei
      }
          ,{
	path: '/forum',
        name: '宠物论坛',
        component: forum
      }
          ,{
	path: '/lingyangxiangqing',
        name: '领养详情',
        component: lingyangxiangqing
      }
          ,{
	path: '/chongwulingyang',
        name: '宠物领养',
        component: chongwulingyang
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
