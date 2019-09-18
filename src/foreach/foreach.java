package foreach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class foreach {
	public static void main(String[] args) {
		Collection cool = new ArrayList();
		cool.add("hello");
		cool.add("hell");
		cool.add("hel");

//		for (Iterator dai = cool.iterator(); dai.hasNext();) {
//			Object object = (Object) dai.next();
//			System.out.println(object);
//		这是传统的for循环

		for (Object very : cool) {
			System.out.println(very);
		}
//			增强for 只能用于遍历Collection容器或者数组
//			格式:for(元素类型 变量 : collection 容器/数组)	{ }

	}
}
