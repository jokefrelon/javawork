<style>
div{
    background-color: #114848;
}
</style>pl

#泛型:


##介绍

	jdk1.4 时容器啥都可以存储,但在取出时需要向下转型,但是对象类型不一致,就会发生ClassCastException,为了解决这个问题,只能控制存入元素类型一致

	jdk1.5 时在定义集合时,就需要明确集合中存储元素具体类型 在编译时类型不通过,就编译失败,这种技术就是泛型技术
	  

##泛型的表现
###只要看到 类/接口 描述时,右边定义<>了,就需要泛型

~~~
其实就是容器在容器在不明确操作元素的情况下,对外提供一个参数<>,使用容器时,只需要将具体的类型实参传递给该参数即可,说白了就是传递类型参数.
~~~

泛型可以定义在类,方法,接口上

~~~
如果在类上定义泛型,那么整个类都必须是该泛型规定的类型,在某些情况下不是特别好
~~~

~~~
class way<SsR>{
	public void shaow(SsR se) {
		System.out.println("nihao"+" ~~ "+se);
	}
	public<S> void sha(S se) {
		System.out.println("n  i  h  a  o" + " ~~ " + se);
	}
}
~~~

注🐖:静态方法无法访问类上定义的泛型,如果静态方法需要定义泛型,泛型只能定义在方法上

~~~
class way<SsR>{
	public static <SsR>  void shaow( SsR se) {
		System.out.println("nihao"+" ~~ "+se);
	}
~~~


泛型通配符
在不具体明确类型的情况下,可以用通配符<font style="color: red">  ?  </font>来表示
eg:

~~~

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class sign {
	public static void main(String[] args) {
		List<pert> er = new ArrayList<pert>();
		er.add(new pert(12, "dayu"));
		er.add(new pert(13, "ace"));
		er.add(new pert(11, "sdikfjh"));
		er.add(new pert(15, "tryyu"));
		syso(er);
		System.out.println("~~~~~~~~~~");
		printany(er);
	}

	public static void syso(Collection<?> hetui) {
		for (Object jald : hetui)
			System.out.println(jald);
	}

	public static void printany(Collection<?> dayuma) {
		for (Iterator<?> dayt = dayuma.iterator(); dayt.hasNext();) {
			System.out.println(dayt.next());
			
		}
	}
}

~~~

泛型还可以通过 限定 某些支持的类型

~~~
	<? extends E>
	这就表示该不确定的类 是属于 E 或者其子类
	就限定了支持的类型

	<? super E>
	这种是支持E或者E的父类型
~~~

~~~
package fanxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class sign {
	public static void main(String[] args) {
		List<pert> er = new ArrayList<pert>();
		er.add(new pert(12, "dayu"));
		er.add(new pert(13, "ace"));
		er.add(new pert(11, "sdikfjh"));
		er.add(new pert(15, "tryyu"));
		System.out.println("~~~~~~~~~~");
		printany(er);

		Set<pert> wechat = new HashSet<pert>();
		wechat.add(new pert(12,"wert"));
		wechat.add(new pert(14,"gtyrt"));
		wechat.add(new pert(19,"forlert"));
		wechat.add(new pert(12,"wert"));
		System.out.println("~~~~~~~~~~");
		System.out.println("~~~~~~~~~~");
		printany(wechat);
	}

	public static void printany(Collection<? extends pert> dayuma) {
		for (Iterator<? extends pert> dayt = dayuma.iterator(); dayt.hasNext();) {
			System.out.println(dayt.next());

		}
	}
}

~~~

















































<font style:"color:red">
泛型方法一般是定义在 public 后面,
静态方法的泛型是定义在 static 后面的,
</font>
