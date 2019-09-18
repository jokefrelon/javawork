package ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
	public static void main(String[] args) {
		Set der = new HashSet();
		der.add("wr1");
		der.add("wr1");
		der.add("wt2");
		der.add("wd3");
		der.add("wp4");
		for (Iterator didi = der.iterator(); didi.hasNext();) {
			System.out.println(didi.next());
		}

	}

}
