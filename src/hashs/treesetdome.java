package hashs;

import java.util.Comparator;

import ArrayList.person;

public class treesetdome implements Comparator {
	public int compare(Object we, Object ry) {
		person p1 = (person) we;
		person p2 = (person) ry;

		int temp = p1.getName().compareTo(p2.getName());

		return temp == 0 ? p1.getAge() - p2.getAge() : temp;
//		该方法是根据姓名的字母顺序排列,和年龄大小无关
//		区别 详见 ArrayList.person
	}
}
