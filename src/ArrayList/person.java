package ArrayList;

public class person implements Comparable{
	private String name;
	private int age;
	
	
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return (name+age);
	}


	public int compareTo(Object heixo) { 
		person hello = (person)heixo;
//		if(this.age>hello.age)
//			return 1;
//		if(this.age<hello.age)
//			return -1;
//		return 0
//该方法,若年龄相同就会判为同一个人,不实际

//		return this.age-hello.age;
//这是上面方法的简写,this.age大于 hello.age 那return的也就是正数,小于就返回负数,等于就返回0
		System.out.println(" this.name: "+this.name+" ~~~hello.name: "+hello.name+" ~~~"+this.name.compareTo(hello.name));
//		上面这句可以不写
		int temp = this.age-hello.age;
		return temp==0?this.name.compareTo(hello.name):temp;
//大佬都这么写
		
	}
}
