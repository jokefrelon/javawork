package hashs;

import java.util.Comparator;

import ArrayList.person;

public class treesetdome implements Comparator {
	public int compare(Object we, Object ry) {
		person p1 = (person) we;
		person p2 = (person) ry;

		int temp = p1.getName().compareTo(p2.getName());

		return temp == 0 ? p1.getAge() - p2.getAge() : temp;
//		�÷����Ǹ�����������ĸ˳������,�������С�޹�
//		���� ��� ArrayList.person
	}
}
