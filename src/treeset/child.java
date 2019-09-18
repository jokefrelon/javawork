package treeset;

public class child implements Comparable{
	private int age;
	private String name;
	
	public child(String cname,int cage) {
		this.age=cage;
		this.name=cname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
//	public int compareTo(Object o) {
//		child ufo = (child)o;
//		int temp = this.age-ufo.age;
//		System.out.println("temp: "+temp);
//		return temp;
//	}
	
	public int compareTo(Object ase) {
		child oldhuang = (child)ase;
		int temp = this.name.compareTo(oldhuang.name);
		return temp;
	}

}
