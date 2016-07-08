# TestTrafficMonitor
这是一个测试系统流量统计类TrafficStats的程序，使用该类可以方便的实现APP流量监控；

##TrafficStats类使用总结：
1、该类直接提供方法：所有APP使用移动网络的流量和包的数量、所有APP使用网络的流量和包的数量、某个APP使用网络的流量和包的数量；

2、该类提供的数据是以手机开关机来累计的，关机重启后数据会重置为0；

3、通过该类无法直接获取某个APP使用移动网络和wifi网络的流量统计，如果需要区分网络类型进行统计流量的话，需要开启后台服务，并监听网络状态变化广播，根据网络状态变化自己记录并计算出不同网络类型下的流量统计；

4、该类提供的所有网络流量统计数据可能不仅仅包括移动网络和wifi网络，也可能包括APP间socket通信产生的流量；

##程序截图：
![image1](https://github.com/ZhangSir/TestTrafficMonitor/blob/master/Screenshot_2016-07-08-14-24-19.jpeg)
