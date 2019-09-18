package jokeme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listAndSet {
public static void main(String[] args) {
	List list = new ArrayList();
	list(list);
}

	public static <E> void list(List jiuo) {
		jiuo.add("we");
		jiuo.add("we");
		jiuo.add("we");
		System.out.println(jiuo);
		
		jiuo.add(2,"dalian");
		System.out.println(jiuo);
//		Ôö
		jiuo.remove(1);
		System.out.println(jiuo);
//		É¾
		jiuo.set(1,"23");
		System.out.println(jiuo);
//		¸Ä
		System.out.println(jiuo.get(0));
//		²é
//		for (Iterator da = jiuo.iterator();da.hasNext();) {
//			Object obk = da.next();
//			if(obk.equals("we")) {
//				System.out.println("Not we only u ");
//			}
//			
		for (ListIterator da = jiuo.listIterator();da.hasNext();) {
			Object obk = da.next();
			if(obk.equals("we")) {
				 da.add("hah");
			}
		}
		System.out.println(jiuo);
	}
}
