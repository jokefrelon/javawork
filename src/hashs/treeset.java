package hashs;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import ArrayList.person;

public class treeset {
	public static void main(String[] args) {
	Set dde = new TreeSet(new treesetdome()); 
	dde.add(new person("dalian",23));
	dde.add(new person("xiaolian",23));
	dde.add(new person("lilian",43));
	dde.add(new person("jokelei",29));
	for (Iterator ddo = dde.iterator(); ddo.hasNext();) {
		person lg = (person)ddo.next();
		System.out.println(lg.getAge()+"::"+lg.getName());
		
	}
	}
}
