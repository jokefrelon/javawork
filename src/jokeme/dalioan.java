package jokeme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class dalioan {
//public static void main(String[] args) {
//	Collection cool = new ArrayList();
//	collect(cool);
//}
//public static void collect(Collection sel) {
//	sel.add("ojbk");
//	sel.add("ojbk");
//	sel.add("ojbk");
//	System.out.println(sel);
//	sel.remove("ojbk");
//	System.out.println(sel);
//	System.out.println(sel.contains("ojbk"));
//}
	public static void main(String[] args) {
		ercollect();
	}
	public static void ercollect() {
		Collection ps = new ArrayList();
		Collection pt = new ArrayList();
		ps.add("abc");
		ps.add("abc1");
		ps.add("abc2");
		pt.add("ssd");
		pt.add("ssd1");
		
		System.out.println(ps);
		System.out.println(pt);
		for(Iterator hasd = ps.iterator();hasd.hasNext();) {
			System.out.println(hasd.next());
		}
	}
	
}
