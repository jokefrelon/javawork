<!-- docker安装以后
vi /etc/docker/daemon.json
{
"registry-mirrors": ["http://hub-mirror.c.163.com"]
}
把docker的远程仓库地址改为国内的地址 -->



##构造函数:
<br>继承时,子类初始化时,有参构造函数和无参构造函数
都必须通过 super 访问父类中的 空参构造函数.也可以通过空参通过this访问本类中有参构造函数的super来访问父类的无参构造函数.
<br>
eg:
~~~
class father{
int x;
father(){
	x=4;
	    }
}

father(int de){
x=de;
	}


class son extends father{
son(){
	super(4);	//这里有一个默认的super(x);即使不写也存在
	this(4);//也可以用this(x)调用本类当中有参构造函数,因为有参当中有一个默认的super()
	System.out.println("son");
}

son(int er){
	//这里有一个默认的super();即使不写也存在
	System.out.println("son"+er);
	}
}

class xxx{
public static void main(String[] args){
son ddd = new son();

	}
}
~~~


##抽象类:
<br>必须有 继承,并且必须有子类对该类实例化,否则一直不能用
eg:

~~~
abstract class xxx{}  //抽象类
abstract void xxx (); //抽象方法
~~~

接口不能实例化,必须由子类实例化
接口的常见成员:1.全局变量 2.抽象方法
接口有固定的修饰符.其成员都是public修饰的

接口和抽象类很相似,需要被实现的类进行实例化以后才能被实例化

~~~
interface here {
    void trans();
}

class free implements here {
    public void trans() {
        System.out.println("haha");
    }
}
class july_30_2{
    public static void main(String[] args) {
        free fff = new free();
        fff.trans();
    }
}
~~~


另外接口和接口之间也可以有继承关系


	interfaceA extends interfaceB


类实现接口时 


	class xxx implements interfaceA

当一个接口 extends 另一个接口时,如果有类 implements 接口,必须实例化两个接口所有的抽象的方法


###多态的向上:
<br>父类的引用或者接口引用指向子类的对象

~~~
class animal{
	void eat(){
		System.out.println("eat something");
	};
}

class cat extends animal{
	void eat(){
		System.out.println("eat something");
	}
	void sleep(){
		System.out.println("sleep well");
	}
}
class xxx{
public static void main(String[] args) {
    

animal ddd = new cat();
ddd.eat();//      ✔  animal向下转型,就为多态
ddd.sleep();//    ❌  向上转型只能调用子类和父类的共有方法;
}
}


~~~


###多态的向下转型:

~~~
class animal{
	void eat();
}

class cat extends animal{
	void eat(){
		sysout("eat something")
	}
	void sleep(){
		System.out.println("sleep well")
	}
}
class dog extends animal{
	void lookhome(){
		System.out.println("look home")			
}
	void eat (){
		System.out.println('' eat meet'')
}

}
class xxx{
main {
animal ddd = new cat();
ddd.eat();
Dog d = (Dog)ddd;
d.eat();

~~~


向下转型的弊端:面对具体的子类,向下转型有风险.
容易发生classcastexception 只要转换类型和对象类型不匹配就发生

可以用  instanceof  来判断<br>
eg:ddd instanceof cat



###多态中的静态方法 
<br>eg:
~~~
class father{
static void smile(){
	System.out.println('😄')
}
}
class son extends father(){
static void smile(){
	System.out.println('😄')
}
}
main
father ddd = new son
ddd.smile();
~~~

静态方法调用的是父类的方法,和类无关,静态方法是单独在静态方法区产生的,父类和子类都有静态方法,谁调用,就用谁的静态方法,例子中是  father  类调用,所以就使用father的静态方法




###内部类:将类定义到另一个类的内部

~~~
class outer {
	private int num=4;
	class inner{
		void show(){
			System.out.println(num);
		}
	}
	public void mef(){
		inner dd = new inner();
		dd.show();
	}
}
class xxx {
	public static void main(String[] args){
		new 
	}
}
~~~

~~~
class outer {
    private int num = 4;

    class inner {
        void show() {
            System.out.println(num);
        }
    }

    public void mef() {
        inner dd = new inner();
        dd.show();
    }
}

class xxx {
    public static void main(String[] args) {
       outer.inner df = new outer().new inner();
       df.show();
    }
}
~~~

静态方法中调用和创建都和非静态方法不太一样
<br>new对象时<br><br>静态方法是	outer.inner uuid = new outer.inner();
<br>非静态方法是	    outer.inner df = new outer().new inner();
~~~
class outer {
    private static int num = 4;

    static class inner{
        void show() {
            System.out.println(num);
        }
    }

    public void mef() {
        inner dd = new inner();
        dd.show();
    }
}

class xxx {
    public static void main(String[] args) {
        outer.inner uuid = new outer.inner();
        uuid.show();
    }
}
~~~


~~~
class outer{
    int num = 100;
    class inner{
        int num = 200;
        void show(){
            int num = 300;
            System.out.println(outer.this.num);
			System.out.println(inner.this.num);
			System.out.println(this.num);
			System.out.println(num);
        }
    }
    void meth (){
        new inner().show();
    }
}
class xxx{
    public static void main(String[] args) {
        new outer().meth();
    }
}
~~~


~~~
class outer{
    int num = 100000000;
}

class inner{
    public void show() {
        System.out.println(new outer().num);
    }
}
class xxx{
    public static void main(String[] args) {
        new inner().show();
        
    }
}
~~~

~~~
class outer {
	private int num=4;
	class inner{
		void show(){
			System.out.println(num);
		}
	}
	public void mef(){
		inner dd = new inner();
		dd.show();
	}
}
class xxx {
	public static void main(String[] args){
		outer ddu = new outer();
		ddu.mef();
	}
}

如果内部类权限是非私有的,就可以在外部中的其他程序访问到,就可以通过外部类对象完成
~~~

<hr>
##Java 异常
###异常分类
Exceptio<br>
Error<br>


<hr>

##java 包
<br>

1.有了包以后,类的名称应该是:包名.类名
	package.damei xxx = new package.damei()
<br>继承的时候也需要加上包名,同包则不需要
<br><br>
2.java 设置classpath
set classpath ......
<br><br>
3.一个包中的class需要被另一个包访问,需要设置public class XXX

##权限修饰符
public
protected
private

##特征修饰符
final			<br>
static			<br>
abstract		<br>
native			<br>
transient		<br>
synchronized	<br>
volatile		<br>
<hr>


||同一个类|同一个包|不同包的子类|不同包的非子类|
|:-:|:-:|:-:|:-:|:-:|
|private|   yes | no  | no  | no | 
|Default|   yes | yes | no  | no | 
|Protected| yes | yes | yes | no | 
|Public|    yes | yes | yes | yes|


<br>
<hr>
##import导入第三方类<br>
导入第三方类以后可以简化书写<br>😄😄😄😄U•ェ•U😄😄😄😄<br>
eg:import package.*;
<br>导入package下的全部类<br>

^(￣(oo)￣)^<br><br>
如果不同包下有同名类文件,即使导入了该包,使用时也必须要明确该类的包名<br>

##进程:正在运行的程序<br>
##线程:是进程中负责程序执行单元,一个进程至少有一个线程负责该程序运行,

###java 如何运行多线程<br>
	一.使用thread方式

		1.继承Thread类
		2.覆盖run()方法
		3.创建子类对象就是创建线程对象
		4.调用thread类中的start()方法执行线程
		^(*￣(oo)￣)^自定义线程都是从run开始执行,由主方法main调用执行

示例代码:

~~~
class dayu extends Thread{
	int fork;
	dayu(int hetyu){
		this.fork=hetyu;
	}
	void stand(){
		for (int ed=1;ed<20;ed++ ) {
			System.out.println(fork+"--------"+ed);
		}
	}
	public void run(){
		stand();
	}
	// public void start(){
	// 	this.run();
	// }
}
class august_3_1{
	public static void main(String[] args) {
		dayu gcc = new dayu(211);
		dayu gc = new dayu(985);
		gcc.start();
		gc.start();
	}
}
~~~

	二.使用Runable接口

		1.定义一个类来实现Runable接口
		2.覆盖Runable接口里的run()方法
		3.通过Thread类来创建线程对象,并将Runable接口的对象作为Thread类中的构造函数的参数进行传递
		4.通过Thread类的start()方法开启线程

	三.Runable接口的好处:

		a.避免了继承Thread类接口的单一性
		b.Runable接口的出现更符合面向对象,将线程单独封装
		c.降低了耦合性

U•ェ•U<br>示例代码:

~~~
class ticket implements Runnable{
	int leftTickets = 100;
	public void sellTicket(){
		while(true){
			if (leftTickets>=1) {
				System.out.println(Thread.currentThread().getName()+" sell the ticket "+leftTickets--);
				
			}
		}
		
	}
	public void run(){
		sellTicket();
	}
}
class august_3_2{
public static void main(String[] args) {
	ticket person = new ticket();
	Thread person1 = new Thread (person);
	Thread person2 = new Thread (person);
	Thread person3 = new Thread (person);
	Thread person4 = new Thread (person);
	person1.start();
	person2.start();
	person3.start();
	person4.start();
	}
}
~~~
	四.多线程安全问题

a.原因
	1.线程任务有共享数据
	2.有多条线程对共享数据操作
b.解决方法:synchronized
synchronized(对象){
	需要同步处理的代码块
}
此方法的弊端是:效率低下;

示例代码:

~~~
class ticket implements Runnable{
	int leftTickets = 100;
	Object obj = new Object();
	public void sellTicket(){
		while(true){
			synchronized(obj){
				if (leftTickets>=1) {
				System.out.println(Thread.currentThread().getName()+" sell the ticket "+leftTickets--);
				}
			}
		}
		
	}
	public void run(){
		sellTicket();
	}
}
class august_3_2{
public static void main(String[] args) {
	ticket person = new ticket();
	Thread person1 = new Thread (person);
	Thread person2 = new Thread (person);
	Thread person3 = new Thread (person);
	Thread person4 = new Thread (person);
	person1.start();
	person2.start();
	person3.start();
	person4.start();
	}
}
~~~























