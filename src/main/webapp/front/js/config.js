
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
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '快递员',
	url: './pages/kuaidiyuan/list.html'
}, 
{
	name: '快递订单',
	url: './pages/kuaidixinxi/list.html'
}, 
{
	name: '快递收货',
	url: './pages/quhuoxinxi/list.html'
}, 
{
	name: '快递派送',
	url: './pages/jiedanxinxi/list.html'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.html'
}, 
{
	name: '新闻资讯',
	url: './pages/news/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm62911/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"快递员","menuJump":"列表","tableName":"kuaidiyuan"}],"menu":"快递员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["查看","修改","删除","派货安排"],"menu":"快递信息","menuJump":"列表","tableName":"kuaidixinxi"}],"menu":"快递信息管理"},{"child":[{"buttons":["查看","修改","删除","取货派发"],"menu":"取货信息","menuJump":"列表","tableName":"quhuoxinxi"}],"menu":"取货信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","快递信息"],"menu":"订单信息","menuJump":"列表","tableName":"dingdanxinxi"}],"menu":"订单信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"接单信息","menuJump":"列表","tableName":"jiedanxinxi"}],"menu":"接单信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"服务评论","menuJump":"列表","tableName":"fuwupingjia"}],"menu":"服务评论管理"},{"child":[{"buttons":["修改","删除","查看"],"menu":"订单投诉","menuJump":"列表","tableName":"dingdantousu"}],"menu":"订单投诉管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"快递员列表","menuJump":"列表","tableName":"kuaidiyuan"}],"menu":"快递员模块"},{"child":[{"buttons":["查看"],"menu":"快递信息列表","menuJump":"列表","tableName":"kuaidixinxi"}],"menu":"快递信息模块"},{"child":[{"buttons":["查看"],"menu":"取货信息列表","menuJump":"列表","tableName":"quhuoxinxi"}],"menu":"取货信息模块"},{"child":[{"buttons":["查看"],"menu":"接单信息列表","menuJump":"列表","tableName":"jiedanxinxi"}],"menu":"接单信息模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","取货派发"],"menu":"取货信息","menuJump":"列表","tableName":"quhuoxinxi"}],"menu":"取货信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"接单信息","menuJump":"列表","tableName":"jiedanxinxi"}],"menu":"接单信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"服务评论","menuJump":"列表","tableName":"fuwupingjia"}],"menu":"服务评论管理"},{"child":[{"buttons":["查看","审核"],"menu":"订单投诉","menuJump":"列表","tableName":"dingdantousu"}],"menu":"订单投诉管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"快递员列表","menuJump":"列表","tableName":"kuaidiyuan"}],"menu":"快递员模块"},{"child":[{"buttons":["查看"],"menu":"快递信息列表","menuJump":"列表","tableName":"kuaidixinxi"}],"menu":"快递信息模块"},{"child":[{"buttons":["查看"],"menu":"取货信息列表","menuJump":"列表","tableName":"quhuoxinxi"}],"menu":"取货信息模块"},{"child":[{"buttons":["查看"],"menu":"接单信息列表","menuJump":"列表","tableName":"jiedanxinxi"}],"menu":"接单信息模块"}],"roleName":"快递员","tableName":"kuaidiyuan"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"快递信息","menuJump":"列表","tableName":"kuaidixinxi"}],"menu":"快递信息管理"},{"child":[{"buttons":["查看"],"menu":"取货信息","menuJump":"列表","tableName":"quhuoxinxi"}],"menu":"取货信息管理"},{"child":[{"buttons":["查看","订单评论","订单投诉"],"menu":"接单信息","menuJump":"列表","tableName":"jiedanxinxi"}],"menu":"接单信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"服务评论","menuJump":"列表","tableName":"fuwupingjia"}],"menu":"服务评论管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"订单投诉","menuJump":"列表","tableName":"dingdantousu"}],"menu":"订单投诉管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"快递员列表","menuJump":"列表","tableName":"kuaidiyuan"}],"menu":"快递员模块"},{"child":[{"buttons":["查看"],"menu":"快递信息列表","menuJump":"列表","tableName":"kuaidixinxi"}],"menu":"快递信息模块"},{"child":[{"buttons":["查看"],"menu":"取货信息列表","menuJump":"列表","tableName":"quhuoxinxi"}],"menu":"取货信息模块"},{"child":[{"buttons":["查看"],"menu":"接单信息列表","menuJump":"列表","tableName":"jiedanxinxi"}],"menu":"接单信息模块"}],"roleName":"学生","tableName":"xuesheng"}]


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
