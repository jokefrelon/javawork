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
//�÷���,��������ͬ�ͻ���Ϊͬһ����,��ʵ��

//		return this.age-hello.age;
//�������淽���ļ�д,this.age���� hello.age ��return��Ҳ��������,С�ھͷ��ظ���,���ھͷ���0
		System.out.println(" this.name: "+this.name+" ~~~hello.name: "+hello.name+" ~~~"+this.name.compareTo(hello.name));
//		���������Բ�д
		int temp = this.age-hello.age;
		return temp==0?this.name.compareTo(hello.name):temp;
//���ж���ôд
		
	}
}
