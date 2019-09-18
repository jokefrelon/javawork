package treeset;

import java.util.Set;
import java.util.TreeSet;

public class sortString {
	public static void main(String[] args) {
		sortStringmethod();
	}

	public static void sortStringmethod() {
		Set dde = new TreeSet(new CompareByLength());
		dde.add("hehe");
		dde.add("zzw");
		dde.add("npsdf");
		dde.add("lbweasd");
		for (Object obj : dde) {
			System.out.println(obj);
		}
	}
}
