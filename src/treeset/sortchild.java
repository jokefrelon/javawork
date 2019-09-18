package treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class sortchild {
	public static void main(String[] args) {
		Set dolar = new TreeSet();
		dolar.add(new child("dayuzhishui",12));
		dolar.add(new child("hefu",22));
		dolar.add(new child("eiefu",24));
		dolar.add(new child("eiefu",24));
//		for(Object obj:dolar) {
//			System.out.println(obj);
//		}
//		
		for (Iterator yt = dolar.iterator(); yt.hasNext();) {
			child object = (child) yt.next();
			System.out.println("name: "+object.getName()+"   age : "+object.getAge());
		}
	}
}
