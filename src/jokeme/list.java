package jokeme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list {
public static void main(String[] args) {
	List dalian = new ArrayList();
	listmethod(dalian);
}

	public static void listmethod(List star) {
		star.add("roco");
		star.add("lostload");
		star.add(0, "goodbye");
		star.remove(2);
		System.out.println(star.get(1));
		System.out.println(star);
		star.set(1, "w3c");
		System.out.println(star);
		star.add("roco");
		star.add("lostload");
		System.out.println(star);
		for (Iterator self = star.iterator(); self.hasNext();) {
			System.out.println("" + self.next());
		}

	}
}
