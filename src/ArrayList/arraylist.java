package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {
	public static void main(String[] args) {
		List si = new ArrayList();

		person p1 = new person("frelon", 12);
		si.add(p1);
		si.add(new person("dalian", 23));
		for (Iterator frelon = si.iterator(); frelon.hasNext();) {
			person pp = (person) frelon.next();
			System.out.println(pp.getAge());
		}
	}
	public void nomethod(List iop) {
		List temp = new ArrayList();
	}
}
