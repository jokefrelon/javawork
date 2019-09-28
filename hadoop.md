<h1 style="color:#ff1148">hadoop介绍</h1>
    
    NameNode(名字节点)
    DataNode(数据节点)
    Secondary NameNode(次名字节点)
    JobTracker(作业跟踪节点)
    TaskTracker(任务跟踪节点)

 1.hadoop版本介绍

    

~~~
Hadoop 1.0

    MapReduce
    ~~~~~~~~~
    HDFS
~~~

![pic](https://atts.w3cschool.cn/attachments/image/20170808/1502171952954287.jpg)
~~~
 Hadoop 2.0

    MapReduce + Others
    ~~~~~~~~~~~~~~~~~~
    YARN
    ~~~~~~~~~~~~~~~~~~
    HDFS
~~~

![pic](https://atts.w3cschool.cn/attachments/image/20170808/1502171959302407.jpg)
![pic](https://atts.w3cschool.cn/attachments/image/20170808/1502172142576437.jpg)

<hr>
<a href="https://chu888chu888.gitbooks.io/hadoopstudy/content/Content/3/chapter0302.html">Hadoop原理漫画图解</a>


<hr>

#MapReduce 简介
~~~
mapreduce 是一种编程模型,用于大规模的数据的并行运算.Map(映射) Redece(简化)
Hadoop上有唯一的 NameNode , 并且NameNode上还有一个负责主控的 JobTracker
Hadoop上有很多的 DataNode , 每个DataNode上还有一个负责执行任务的 TaskTracker
MapReduce的工作流程大概是: Client 发起请求 ---> NameNode 响应请求,并返回相应的 DataNode 给 Client ---> 多个 DataNode 响应 client 的请求,并存储数据 ---> NameNode 的 JobTracker 开始分配任务给 DataNode 的 TaskTracker ---> TaskTracker 获取输入数据的若干分块进行并行 Map 运算,再并行排序汇总,进行 Reduce 运算 
~~~


<hr>

#HBase 简介
~~~
HBase(Hadoop Database) 高可靠,高性能,面向列,可伸缩的分布式存储系统 
	个人拙见,HBase就是一个特大版的 专为Hadoop设计的数据库
HBase的接口支持也是相当的丰富,可以调用

native Java api 
c++ , Ruby , python 等
Pig , Hive 也可以操作 HBase

~~~

<hr>

#Zookeeper 简介

~~~
zookeeper就是用于维护Hadoop这样的大型分布式文件系统,提供配置维护,名字服务,分布式同步,组服务等.就是为了封装复杂容易出错的关键服务,将简单易容高效的接口和功能稳定的协同分布系统提供给用户

ZooKeeper提供的常见服务如下 :

        命名服务 - 按名称标识集群中的节点。它类似于DNS，但仅对于节点。

        配置管理 - 加入节点的最近的和最新的系统配置信息。

        集群管理 - 实时地在集群和节点状态中加入/离开节点。

        选举算法 - 选举一个节点作为协调目的的leader。

        锁定和同步服务 - 在修改数据的同时锁定数据。此机制可帮助你在连接其他分布式应用程序（如Apache HBase）时进行自动故障恢复。

        高度可靠的数据注册表 - 即使在一个或几个节点关闭时也可以获得数据。

以下是使用ZooKeeper的好处：
        
        可靠性

        有序的消息
        
        简单的分布式协调过程

        同步 - 服务器进程之间的相互排斥和协作。此过程有助于Apache HBase进行配置管理。

        序列化 - 根据特定规则对数据进行编码。确保应用程序运行一致。这种方法可以在MapReduce中用来协调队列以执行运行的线程。

        原子性 - 数据转移完全成功或完全失败，但没有事务是部分的。


~~~
<a href="https://blog.csdn.net/java_66666/article/details/81015302">zookeeper详解</a>

<hr>
#Hive 简介

~~~
 Hive 是基于 Hadoop 的数据库工具,可以讲结构化的数据文件映射为一张数据库表,并提供完整 SQL 查询功能,可以把 SQL 语句转化为 MapReduce 任务
~~~

<hr>
#Pig 简介

~~~
Apache Pig是MapReduce的一个抽象。它是一个工具/平台，用于分析较大的数据集，并将它们表示为数据流。Pig通常与 Hadoop 一起使用；我们可以使用Apache Pig在Hadoop中执行所有的数据处理操作。

要编写数据分析程序，Pig提供了一种称为 Pig Latin 的高级语言。该语言提供了各种操作符，程序员可以利用它们开发自己的用于读取，写入和处理数据的功能。

要使用 Apache Pig 分析数据，程序员需要使用Pig Latin语言编写脚本。所有这些脚本都在内部转换为Map和Reduce任务。Apache Pig有一个名为 Pig Engine 的组件，它接受Pig Latin脚本作为输入，并将这些脚本转换为MapReduce作业。
~~~

~~~
Apache Pig具有以下特点:

丰富的运算符集 - 它提供了许多运算符来执行诸如join，sort，filer等操作。

易于编程 - Pig Latin与SQL类似，如果你善于使用SQL，则很容易编写Pig脚本。

优化机会 - Apache Pig中的任务自动优化其执行，因此程序员只需要关注语言的语义。

可扩展性 - 使用现有的操作符，用户可以开发自己的功能来读取、处理和写入数据。

用户定义函数 - Pig提供了在其他编程语言（如Java）中创建用户定义函数的功能，并且可以调用或嵌入到Pig脚本中。

处理各种数据 - Apache Pig分析各种数据，无论是结构化还是非结构化，它将结果存储在HDFS中。
~~~

~~~

Apache Pig	                                                                MapReduce
--------------------------------------------------------------------------------------------------------------
Apache Pig是一种数据流语言。	                                      MapReduce是一种数据处理模式。
它是一种高级语言。	                                                  MapReduce是低级和刚性的。
在Apache Pig中执行Join操作非常简单。	                              在MapReduce中执行数据集之间的Join非常困难。
任何具备SQL基础知识的新手程序员都可以方便地使用Apache Pig工作。	         向Java公开是必须使用MapReduce。
Apache Pig使用多查询方法，在很大程度上减少代码的长度。	                MapReduce将需要20倍的行数来执行相同的任务。
没有编译。执行时操作符都在内部转换为MapReduce作业。	                    MapReduce作业具有很长的编译过程。

~~~

Pig 与 Hive 的关系

~~~

Apache Pig                                                                  	Hive
----------------------------------------------------------------------------------------------------------------
Apache Pig使用一种名为 Pig Latin 的语言（最初创建于 Yahoo ）。	        Hive使用一种名为 HiveQL 的语言
Pig Latin是一种数据流语言。	                                           HiveQL是一种查询处理语言。
Pig Latin是一个过程语言，它适合流水线范式。                         	HiveQL是一种声明性语言。
Apache Pig可以处理结构化，非结构化和半结构化数据。                  	Hive主要用于结构化数据。
~~~

#YARN 简介
~~~
    1.ResourceManager 
        负责全局的资源管理和任务调度,把整个集群当计算资源池，只关注分配，不管应用，且不负责容错 <hr>
    2.NodeManager 
        a.启动时向ResourceManager注册并定时发心跳消息，等待ResourceManager的指令  
        b.监控Container的运行，维护Container的生命周期，监控Container的资源使用情况  
        c.启动或停止Container，管理任务运行时的依赖包（根据ApplicationMaster的需要，启动Container之前将需要的程序及其依赖包、配置文件等拷贝到本地）  
    3.ApplicationMaster 
        单个作业的资源管理和任务监控 
            具体表现: 
             计算应用的资源需求，资源可以是静态或动态计算的，静态的一般是Client申请时就指定了，动态则需要ApplicationMaster根据应用的运行状态来决定
             根据数据来申请对应位置的资源（Data Locality）
             向ResourceManager申请资源，与NodeManager交互进行程序的运行和监控，监控申请的资源的使用情况，监控作业进度
             跟踪任务状态和进度，定时向ResourceManager发送心跳消息，报告资源的使用情况和应用的进度信息
             负责本作业内的任务的容错  
    4.Container 
         基本的资源单位（CPU、内存等） 
         Container可以加载任意程序，而且不限于Java 
         Node可以包含多个Container，也可以是一个大的Container 
         ApplicationMaster可以根据需要，动态申请和释放Container 
 
~~~

~~~

失败类型
    程序问题
    进程崩溃
    硬件问题

失败处理
    任务失败
        运行时异常或者JVM退出都会报告给ApplicationMaster
        通过心跳来检查挂住的任务(timeout)，会检查多次（可配置）才判断该任务是否失效
        一个作业的任务失败率超过配置，则认为该作业失败
        失败的任务或作业都会有ApplicationMaster重新运行

    ApplicationMaster失败
        ApplicationMaster定时发送心跳信号到ResourceManager，通常一旦ApplicationMaster失败，则认为失败，但也可以通过配置多次后才失败
        一旦ApplicationMaster失败，ResourceManager会启动一个新的ApplicationMaster
        新的ApplicationMaster负责恢复之前错误的ApplicationMaster的状态(yarn.app.mapreduce.am.job.recovery.enable=true)，这一步是通过将应用运行状态保存到共享的存储上来实现的，ResourceManager不会负责任务状态的保存和恢复
        Client也会定时向ApplicationMaster查询进度和状态，一旦发现其失败，则向ResouceManager询问新的ApplicationMaster

    NodeManager失败
        NodeManager定时发送心跳到ResourceManager，如果超过一段时间没有收到心跳消息，ResourceManager就会将其移除
        任何运行在该NodeManager上的#x7684;任务和ApplicationMaster都会在其他NodeManager上进行恢复
        如果某个NodeManager失败的次数太多，ApplicationMaster会将其加入黑名单（ResourceManager没有），任务调度时不在其上运行任务

    ResourceManager失败
        通过checkpoint机制，定时将其状态保存到磁盘，然后失败的时候，重新运行
        通过zookeeper同步状态和实现透明的HA
    
可以看出，一般的错误处理都是由当前模块的父模块进行监控（心跳）和恢复。而最顶端的模块则通过定时保存、同步状态和zookeeper来ֹ复现HA

~~~

~~~
YARN总结:

YARN就是将JobTracker的职责进行拆分，将资源管理和任务调度监控拆分成独立的进程：一个全局的资源管理和一个每个作业的管理（ApplicationMaster） ResourceManager和NodeManager提供了计算资源的分配和管理，而ApplicationMaster则完成应用程序的运行
ResourceManager: 全局资源管理和任务调度 
NodeManager: 单个节点的资源管理和监控 
ApplicationMaster: 单个作业的资源管理和任务监控 
Container: 资源申请的单位和任务运行的容器 
~~~

<hr>
Hadoop API被分成（divide into）如下几种主要的包（package）

~~~
org.apache.hadoop.conf     定义了系统参数的配置文件处理API。

org.apache.hadoop.fs          定义了抽象的文件系统API。

<span>org.apache.hadoop.io</span>         定义了通用的I/O API，用于针对网络，数据库，文件等数据对象做读写操作。

org.apache.hadoop.ipc       用于网络服务端和客户端的工具，封装了网络异步I/O的基础模块。

org.apache.hadoop.mapred         Hadoop分布式计算系统（MapReduce）模块的实现，包括任务的分发调度等。

org.apache.hadoop.metrics        定义了用于性能统计信息的API，主要用于mapred和dfs模块。

org.apache.hadoop.record        定义了针对记录的I/O API类以及一个记录描述语言翻译器，用于简化将记录序列化成语言中性的格式（language-neutral manner）。

org.apache.hadoop.tools             定义了一些通用的工具。

org.apache.hadoop.util       定义了一些公用的API。
~~~
<hr>
#hadoop的安装过程(Ubuntu)

##安装 Java JDK 和 Hadoop
    
###1.安装Java并配置环境变量

~~~
    
            安装略...
    
    sudo gedit /etc/profile

    增加下面两行:
    expert JAVA_HOME = /usr/jdk1.8.0
    expert PATH = $JAVA_HOME/bin:$PATH
~~~

###2.使环境变量立即生效

~~~
    source /etc/profile
~~~

###3.验证Java是否安装成功
    java -version

###4.安装Hadoop并配置环境变量
~~~
        安装略...
    
    sudo gedit /etc/profile
    
    增加下面两行:    
    expert HADOOP_HOME = /usr/hadoop-3.1.1
    expert PATH = $JAVA_HOME/bin:$HADOOP_HOME/bin:$HADOOP_HOME/sbin:$PATH
~~~
###5.使环境变量立即生效

~~~
    source /etc/profile
~~~

###6.验证Hadoop是否安装成功

~~~
    Hadoop -version
~~~

###7配置ssh免密登录(记得设置防火墙,放端口)
~~~
    hostA $:ssh-keygen
    hostA $:scp id_rsa.pub xxx@hostB:/home/xxx/.ssh/
    hostB $:cat id_rsa.pub >> authorized_keys
~~~

###8.Hadoop配置
~~~
    cd /usr/hadoop-3.1.1/etc/hadoop/
~~~
<br>
####vim core-site.xml

~~~
    <configuration>

    <property>
    <name>fs.defaultFS</name>
    <value>hdfs://localhost:9000</value>
    <description>设置NameNode的IP地址,以及默认的HDFS端口</description>
    </property>

    <property>
      <name>hadoop.tmp.dir</name>
      <value>/usr/local/hadoop/tmp</value>
      <description>hadoop临时目录用来存放临时文件,该目录必须预先手工创建不能删除</description>
    </property>

    </configuration>
~~~

<hr>
####vi hdfs-site.xml

~~~
    <configuration>
    
    <property>
    <name>dfs.replication</name>
    <value>1</value>
    <description>指定DataNode存储block的副本数量</description>
    </property>

    <property>
    <name>dfs.namenode.name.dir</name>
    <value>file:///root/BigData/hadoop-3.0.0/hdfs/name</value>
    <description>设置存放NameNode的文件路径</description>
    </property>

    <property>
    <name>dfs.datanode.data.dir</name>
    <value>file:///root/BigData/hadoop-3.0.0/hdfs/data</value>
    <description>设置存放DataNode的文件路径</description>
    </property>

    <!-- ns1下面有两个NameNode，分别是nn1，nn2 -->
    <property>
        <name>dfs.ha.namenodes.ns1</name>
        <value>nn1,nn2</value>
    </property>
    <!-- nn1的RPC通信地址 -->
    <property>
        <name>dfs.namenode.rpc-address.ns1.nn1</name>
        <value>hadoop01:9000</value>
    </property>
    <!-- nn1的http通信地址 -->
    <property>
        <name>dfs.namenode.http-address.ns1.nn1</name>
        <value>hadoop01:50070</value>
    </property>
    <!-- nn2的RPC通信地址 -->
    <property>
        <name>dfs.namenode.rpc-address.ns1.nn2</name>
        <value>hadoop02:9000</value>
    </property>
    <!-- nn2的http通信地址 -->
    <property>
        <name>dfs.namenode.http-address.ns1.nn2</name>
        <value>hadoop02:50070</value>
    </property>
    <!-- 指定NameNode的元数据在JournalNode上的存放位置 -->
    <property>
        <name>dfs.namenode.shared.edits.dir</name>
        <value>qjournal://hadoop04:8485;hadoop05:8485;hadoop06:8485/ns1</value>
    </property>
    <!-- 指定JournalNode在本地磁盘存放数据的位置 -->
    <property>
        <name>dfs.journalnode.edits.dir</name>
        <value>file:/home/hadoop/hadoop-2.7.3/journal</value>
    </property>
    <!-- 开启NameNode失败自动切换 -->
    <property>
        <name>dfs.ha.automatic-failover.enabled</name>
        <value>true</value>
    </property>
    <!-- 配置失败自动切换实现方式 -->
    <property>
        <name>dfs.client.failover.proxy.provider.ns1</name>
        <value>org.apache.hadoop.hdfs.server.namenode.ha.ConfiguredFailoverProxyProvider</value>
    </property>
    <!-- 配置隔离机制方法，多个机制用换行分割，每个机制占用一行-->
    <property>
        <name>dfs.ha.fencing.methods</name>
        <value>
            sshfence
            shell(/bin/true)
        </value>
    </property>
    <!-- 使用sshfence隔离机制时需要ssh免登陆 -->
    <property>
        <name>dfs.ha.fencing.ssh.private-key-files</name>
        <value>/home/hadoop/.ssh/id_rsa</value>
    </property>
    <!-- 配置sshfence隔离机制超时时间 -->
    <property>
        <name>dfs.ha.fencing.ssh.connect-timeout</name>
        <value>30000</value>
    </property>

    </configuration>
~~~

<hr>
####vi hadoop-env.sh

~~~
	JAVA_HOME=/usr/jdk1.8.0
~~~

<hr>

#安装Hadoop完成以后,需要配置的几个主要文件分别是:<span>core-site.xml,hdfs-site.xml,hadoop-env.sh</span>

~~~
1、hadoop-env.sh：

只需设置jdk的安装路径，如：export JAVA_HOME=/usr/local/jdk

2、core-site.xml：

(1)fs.defaultFS:hdfs://cluster1(域名)，这里的值指的是默认的HDFS路径

(2)hadoop.tmp.dir:/export/data/hadoop_tmp,这里的路径默认是NameNode、DataNode、JournalNode等存放数据的公共目录。用户也可以自己单独指定这三类节点的目录。

(3)ha.zookeeper.quorum:hadoop101:2181,hadoop102:2181,hadoop103:2181,这里是ZooKeeper集群的地址和端口。注意，数量一定是奇数，且不少于三个节点

(4)hadoop.proxyuser.erpmerge.hosts、hadoop.proxyuser.erpmerge.groups主要用来设置oozie的代理用户

3、hdfs-site.xml：

(1)dfs.replication:指定DataNode存储block的副本数量,不大于DataNode的个数就行

(2)dfs.nameservices：cluster1,cluster2，使用federation(HDFS联盟)时，如果使用了2个HDFS集群。这里抽象出两个NameService实际上就是给这2个HDFS集群起了个别名。名字可以随便起，相互不重复即可

(3)dfs.ha.namenodes.cluster1:hadoop101,hadoop102，指定NameService是cluster1时的namenode有哪些，这里的值也是逻辑名称，名字随便起，相互不重复即可

(4)dfs.namenode.rpc-address.cluster1.hadoop101:hadoop101:8020，指定hadoop101的RPC地址

(5)dfs.namenode.http-address.cluster1.hadoop101:hadoop101:50070,指定hadoop101的http地址

hadoop102设置同(4)、(5)

(6)dfs.namenode.shared.edits.dir:qjournal://hadoop101:8485;hadoop102:8485;hadoop103:8485/cluster1,指定cluster1的两个NameNode共享edits文件目录时，使用的JournalNode集群信息

(7)dfs.ha.automatic-failover.enabled.cluster1:true,指定cluster1是否启动自动故障恢复，即当NameNode出故障时，是否自动切换到另一台NameNode

(8)dfs.client.failover.proxy.provider.cluster1:org.apache.hadoop.hdfs.server.namenode.ha.ConfiguredFailoverProxyProvider,指定cluster1出故障时，哪个实现类负责执行故障切换

如果有cluster2集群，则设置如上

(9)dfs.journalnode.edits.dir:【指定JournalNode集群在对NameNode的目录进行共享时，自己存储数据的磁盘路径】

(10)dfs.ha.fencing.methods:sshfence,【一旦需要NameNode切换，使用ssh方式进行操作】

(11)dfs.ha.fencing.ssh.private-key-files:/root/.ssh/id_rsa,【如果使用ssh进行故障切换，使用ssh通信时用的密钥存储的位置】

4、mapred-site.xml:

(1)mapreduce.framework.name:yarn【指定运行mapreduce的环境是yarn，与hadoop1截然不同的地方】

(2)mapreduce.jobhistory.address:hadoop1:10020

(3)mapreduce.jobhistory.webapp.address:hadoop1:19888

(4)mapreduce.map.output.compress:false

(5)mapreduce.map.output.compress.codec:org.apache.hadoop.io.compress.GzipCodec

(6)yarn.app.mapreduce.am.staging-dir:/user

5、yarn-site.xml:

(1)yarn.resourcemanager.hostname:【自定ResourceManager的地址，还是单点，这是隐患】

(2)yarn.nodemanager.aux-services:mapreduce_shuffle

(3)yarn.nodemanager.aux-services.mapreduce.shuffle.class:org.apache.hadoop.mapred.ShuffleHandler

(4)yarn.resourcemanager.address:hadoop1:8032

(5)....

6、slaves文件：

【指定所有的DataNode节点列表，每行一个节点名称】
~~~