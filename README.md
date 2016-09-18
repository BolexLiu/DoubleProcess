# DoubleProcess
实现双进程守护
##测试中：
>三星 5.0 可以在activity未被释放时宝货，双进程互相启动。但是activity结束后能被强行杀掉。
>华为 4.4 无效
>原生android 完全可以

------
##实现思路
 通过配置两个不同进程的service 用aidl进行连接监听，如果连接层出现异常情况，表示有一个service被杀掉。在异常处理处重启
 并绑定aidl。建立双向绑定。

##备选思路
 启动两个Service，同TCP做双向通讯