package hashs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ArrayList.person;

public class hashcode {
	public static void main(String[] args) {
		Set longlong = new HashSet();
		longlong.add(new person("dalian",23));
		longlong.add(new person("kele",22));
		longlong.add(new person("dawei",27));
		longlong.add(new person("dalian",23));
		for (Iterator didi = longlong.iterator(); didi.hasNext();) {
			person fre = (person)didi.next();
			System.out.println(fre.getAge()+fre.getName());
			
		}
	}
}
