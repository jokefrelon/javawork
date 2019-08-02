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
class august_1_2{
public static void main(String[] args) {
    

animal ddd = new cat();
ddd.eat();//      ✔  animal向下转型,就为多态
ddd.sleep();//    ❌  向上转型只能调用子类和父类的共有方法;
}
}

