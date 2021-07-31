# 华为云原生Kubernetes培训

## 简介

Master   

WorkNode 

Pod

## 组件

kube-apiserver 

kube-controller manager

etcd

kuber-scheduler　

kube-proxy

kubelet

kubectl 

Service





## 部署

kubeadm





## 管理

### 命令式   create

### 声明式清单  apply+yaml



![image-20210323144636376](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210323144636376.png)



## Pod



### Pod生命周期

![img](https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=4116193286,1562107281&fm=26&gp=0.jpg)





![image-20210324091848958](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324091848958.png)





### 生产环境必须配置探针

![image-20210324092527500](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324092527500.png)



Liveiness 状态不为OK会重启pod，但Readiness状态不为ok不会重启pod。Readiness影响的是Service能不能管理到Pod。

livez

readyz



LivenessProdw类型：exec/httpget/tcpsocket

## 标签：

- yaml里面定义：

labels ：

   K ：V

 --show-labels

- 命令行

  kubectl label pods  podname  K=V

  减少lable：kubectl label pods  podname  K-

### 标签选择器

- 命令行：
  - 一般的：-l   “K=V，k2=v2”   --show-labels
  - 基于集合：-l   “K in（v1，v2）”  --show-labels
  - 只用K来查找：-l   “K”  --show-labels
- yaml：
  - 使用selector：  K：V





## 容器重启策略

![image-20210324102324932](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324102324932.png)

![image-20210324102346952](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324102346952.png)





## Hook

**lifecycle：**

​	posStart：

​	preStop：





## 容器设计模式

![image-20210324103630478](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324103630478.png)

+ 边车Sidecar
+ 初始化容器
+ Adapter模式
+ 



单节点多容器模式

![image-20210324104511496](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324104511496.png)



## 容器规格



![image-20210324105542662](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324105542662.png)





**resources:**

​	requests

​		cpu: 

​		memory:

​	limits

​		cpu: 

​		memory:



# 存储



## 存储卷

![image-20210324111721173](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324111721173.png)

![image-20210324112411606](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324112411606.png)



### 使用存储卷 （前提：kuberlet要支持）

![image-20210324112916035](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324112916035.png)



**NFS需要下载 yum install nfs-utils**



## 存储类——PV/PVC



![image-20210324133632604](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324133632604.png)



![image-20210324134647221](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324134647221.png)

![image-20210324135131520](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324135131520.png)

![image-20210324135316917](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324135316917.png)



PV-集群级别

PVC -pod基别  PVC和Pod必须是同一namspace



![image-20210324140759005](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324140759005.png)



![image-20210324143814423](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324143814423.png)



## ConfigMap/Secret



![image-20210324143923675](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324143923675.png)



![image-20210324144138944](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324144138944.png)



secret使用base64编码



## Kube-proxy代理模式



![image-20210324155228530](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324155228530.png)





## Service ——>EndPoint



ClusterIP

nodePort

![image-20210324161153645](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324161153645.png)

![S](C:\Users\24193\AppData\Roaming\Typora\typora-user-images\image-20210324161201124.png)

![image-20210325094238628](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325094238628.png)

## 基于DNS服务发现

![image-20210325092014042](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325092014042.png)

![image-20210325093056437](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325093056437.png)





# Controller





deloyment——>RS

![image-20210325102158673](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325102158673.png)

![image-20210325104140097](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325104140097.png)

![image-20210325104528104](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325104528104.png)



### Deployment控制器

![image-20210325104927418](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325104927418.png)

![image-20210325105027511](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325105027511.png)

rollout

undo

![image-20210325112534616](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325112534616.png)





# Kubernetes的认证机制



![image-20210325144432847](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325144432847.png)

![image-20210325145132339](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325145132339.png)





![image-20210325163619925](%E5%8D%8E%E4%B8%BA%E4%BA%91%E5%8E%9F%E7%94%9FKubernetes%E5%9F%B9%E8%AE%AD.assets/image-20210325163619925.png)

# 资源限制



### 准入控制器

LimitRange

