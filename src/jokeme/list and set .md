collection 中常用的列表














List 集合的常用子类<br><hr>
	[Vector] <br>数据结构是数组,长度可变(不断new新数组,并将元数组元素复制到新数组),线程同步,增删改查都比较慢,
	<hr>[ArrayList] <br>数组结构 长度可变.增删慢,查快
	<hr>[LinkedList] <br>链表结构 线程不同步,增删快,查询慢  

list:支持对集合的 " 增,删,改,查 "

list.add()

list.remove()

~~~
	remove 删除元素后会改变元素角标
	
	eg:
	list(23,34,45,45,56,78,58,345,98)
	remove(1);
	list(34,45,45,56,78,58,345,98)
	
	list第一个元素已经被移除,第一个元素23,被删除以后,list长度减一,如果使用角标for循环遍历元素可能会出错
	
	解决方法:
		建立一个临时容器
		遍历原容器和临时容器比较,是否有相同元素,没有就存进去 
~~~

list.set()

listIterator 是迭代器的子接口;具有增删改查的功能

list 集合

~~~
	list存入的东西都是object类型的,所以 取出东西也是object类,
	object类是所存入类型的父类,所以需要取出时需要向下转型
~~~

注意:

~~~
	list存入元素时,需要比较时,调用的是Object类自带的 equals()方法,
	我们可以根据实际情况,overwriite 该equals()方法
~~~

set 集合

	[hashset]不允许存储重复数据,不保证存入和取出顺序一致.
		[LinkedHashSet]hashset的衍生版,具有链表结构的特点
	[treeset] 二叉树数据结构,不同步的,
		排序方式:需要元素具备比较功能,元素需要实现Comparable接口,并且覆盖CompareTo方法
		

有时,存进TreeSet集合里的元素并不具备比较和排序的功能,这时我们就应该让集合具备比较的功能

~~~
	注:  所有的对象都具有equals()方法
	可以overwrite equals()方法来达到自己需要的比较方法
	
	contains 方法是调用equals 方法来进行比较的
	常见数据类型都具备 Comparable 接口的CompareTo功能
			eg : int string char byte boolen short long double ... ...
~~~


