const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm62911/",
            name: "ssm62911",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm62911/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "校园快递服务系统"
        } 
    }
}
export default base
