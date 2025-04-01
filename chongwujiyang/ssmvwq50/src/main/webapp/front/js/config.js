
var projectName = 'java宠物领养饲养交流管理平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
	name: '我的地址',
	url: '../shop-address/list.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '宠物领养',
	url: './pages/chongwulingyang/list.html'
}, 
{
	name: '饲料购买',
	url: './pages/siliaogoumai/list.html'
}, 

{
	name: '宠物论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '宠物资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmvwq50/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


cartFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"宠物领养","menuJump":"列表","tableName":"chongwulingyang"}],"menu":"宠物领养管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"宠物种类","menuJump":"列表","tableName":"chongwuzhonglei"}],"menu":"宠物种类管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"领养详情","menuJump":"列表","tableName":"lingyangxiangqing"}],"menu":"领养详情管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"饲料购买","menuJump":"列表","tableName":"siliaogoumai"}],"menu":"饲料购买管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"饲料种类","menuJump":"列表","tableName":"siliaozhonglei"}],"menu":"饲料种类管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"情况反馈","menuJump":"列表","tableName":"qingkuangfankui"}],"menu":"情况反馈管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"宠物论坛","tableName":"forum"}],"menu":"宠物论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"宠物资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看","修改","删除","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看","修改","删除"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["查看","修改","删除"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看","修改","删除"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看","修改","删除"],"menu":"未支付订单","tableName":"orders/未支付"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","领养"],"menu":"宠物领养列表","menuJump":"列表","tableName":"chongwulingyang"}],"menu":"宠物领养模块"},{"child":[{"buttons":["查看"],"menu":"饲料购买列表","menuJump":"列表","tableName":"siliaogoumai"}],"menu":"饲料购买模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","删除","修改","领养"],"menu":"宠物领养","menuJump":"列表","tableName":"chongwulingyang"}],"menu":"宠物领养管理"},{"child":[{"buttons":["查看","反馈"],"menu":"领养详情","menuJump":"列表","tableName":"lingyangxiangqing"}],"menu":"领养详情管理"},{"child":[{"buttons":["查看"],"menu":"情况反馈","menuJump":"列表","tableName":"qingkuangfankui"}],"menu":"情况反馈管理"},{"child":[{"buttons":["查看"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看","确认收货"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看"],"menu":"已退款订单","tableName":"orders/已退款"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看","领养"],"menu":"宠物领养列表","menuJump":"列表","tableName":"chongwulingyang"}],"menu":"宠物领养模块"},{"child":[{"buttons":["查看"],"menu":"饲料购买列表","menuJump":"列表","tableName":"siliaogoumai"}],"menu":"饲料购买模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
