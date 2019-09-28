<h1 style="color:#ff1148">hadoop介绍</h1>
    
    NameNode(名字节点)
    DataNode(数据节点)
    Secondary NameNode(次名字节点)
    JobTracker(作业跟踪节点)
    TaskTracker(任务跟踪节点)

 1.hadoop版本介绍
 Hadoop 1.0

~~~
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
![pic](https://atts.w3cschool.cn/attachments/image/20170808/1502172142576437.jpg)
![pic](https://atts.w3cschool.cn/attachments/image/20170808/1502171959302407.jpg)
<hr>

<h2 style="color:#ff1148">YARN介绍</h2>
    1.ResourceManager<br>
        负责全局的资源管理和任务调度,把整个集群当计算资源池，只关注分配，不管应用，且不负责容错<br><hr>
    2.NodeManager<br>
        a.启动时向ResourceManager注册并定时发心跳消息，等待ResourceManager的指令<br><br>
        b.监控Container的运行，维护Container的生命周期，监控Container的资源使用情况<br><br>
        c.启动或停止Container，管理任务运行时的依赖包（根据ApplicationMaster的需要，启动Container之前将需要的程序及其依赖包、配置文件等拷贝到本地）<br><br>
    3.ApplicationMaster<br>
        单个作业的资源管理和任务监控<br>
            具体表现:<br>
            <br>计算应用的资源需求，资源可以是静态或动态计算的，静态的一般是Client申请时就指定了，动态则需要ApplicationMaster根据应用的运行状态来决定
            <br>根据数据来申请对应位置的资源（Data Locality）
            <br>向ResourceManager申请资源，与NodeManager交互进行程序的运行和监控，监控申请的资源的使用情况，监控作业进度
            <br>跟踪任务状态和进度，定时向ResourceManager发送心跳消息，报告资源的使用情况和应用的进度信息
            <br>负责本作业内的任务的容错<br><br>
    4.Container<br>
        <br>基本的资源单位（CPU、内存等）<br>
        <br>Container可以加载任意程序，而且不限于Java<br>
        <br>Node可以包含多个Container，也可以是一个大的Container<br>
        <br>ApplicationMaster可以根据需要，动态申请和释放Container<br>
<br>

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

<h3 style="color:#ff1148">YARN总结:</h3>
YARN就是将JobTracker的职责进行拆分，将资源管理和任务调度监控拆分成独立的进程：一个全局的资源管理和一个每个作业的管理（ApplicationMaster） ResourceManager和NodeManager提供了计算资源的分配和管理，而ApplicationMaster则完成应用程序的运行<br><hr>
ResourceManager: 全局资源管理和任务调度<br>
NodeManager: 单个节点的资源管理和监控<br>
ApplicationMaster: 单个作业的资源管理和任务监控<br>
Container: 资源申请的单位和任务运行的容器<br>

MapReduce
    一种分布式的计算方式指定一个Map（映射）函数，用来把一组键值对映射成一组新的键值对，指定并发的Reduce（归约）函数，用来保证所有映射的键值对中的每一个共享相同的键组










<a href="https://chu888chu888.gitbooks.io/hadoopstudy/content/Content/3/chapter0302.html">Hadoop原理漫画图解</a>




Hadoop API被分成（divide into）如下几种主要的包（package）
<hr>

org.apache.hadoop.conf     定义了系统参数的配置文件处理API。
<hr>


org.apache.hadoop.fs          定义了抽象的文件系统API。
<hr>


<span>org.apache.hadoop.io</span>         定义了通用的I/O API，用于针对网络，数据库，文件等数据对象做读写操作。
<hr>


org.apache.hadoop.ipc       用于网络服务端和客户端的工具，封装了网络异步I/O的基础模块。
<hr>


org.apache.hadoop.mapred         Hadoop分布式计算系统（MapReduce）模块的实现，包括任务的分发调度等。
<hr>


org.apache.hadoop.metrics        定义了用于性能统计信息的API，主要用于mapred和dfs模块。
<hr>


org.apache.hadoop.record        定义了针对记录的I/O API类以及一个记录描述语言翻译器，用于简化将记录序列化成语言中性的格式（language-neutral manner）。
<hr>


org.apache.hadoop.tools             定义了一些通用的工具。
<hr>


org.apache.hadoop.util       定义了一些公用的API。
<hr>


~~~

#hadoop的安装过程(Ubuntu)
##安装 Java JDK 和 Hadoop
~~~
    1.安装Java并配置环境变量
    
            安装略...
    
    sudo gedit /etc/profile

    增加下面两行:
    expert JAVA_HOME = /usr/jdk1.8.0
    expert PATH = $JAVA_HOME/bin:$PATH

    2.使环境变量立即生效
    source /etc/profile

    3.验证Java是否安装成功
    java -version

    4.安装Hadoop并配置环境变量
    
        安装略...
    
    sudo gedit /etc/profile
    
    增加下面两行:    
    expert HADOOP_HOME = /usr/hadoop-3.1.1
    expert PATH = $JAVA_HOME/bin:$HADOOP_HOME/bin:$HADOOP_HOME/sbin:$PATH

    5.使环境变量立即生效
    source /etc/profile

    6.验证Hadoop是否安装成功
    Hadoop -version

    7配置ssh免密登录(记得设置防火墙,放端口)
    hostA $:ssh-keygen
    hostA $:scp id_rsa.pub xxx@hostB:/home/xxx/.ssh/
    hostB $:cat id_rsa.pub >> authorized_keys

    8.Hadoop配置
    cd /usr/hadoop-3.1.1/etc/hadoop/
    vim core-site.xml

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

    vi hdfs-site.xml

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

    </configuration>







~~~