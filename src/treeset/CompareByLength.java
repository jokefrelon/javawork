package treeset;

import java.util.Comparator;

public class CompareByLength implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String str1 = (String)arg0;
		String str2 = (String)arg1;
		int temp = str1.length()-str2.length();
		return temp==0?str1.compareTo(str2):temp;
	}

}
