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
//		���Ǵ�ͳ��forѭ��

		for (Object very : cool) {
			System.out.println(very);
		}
//			��ǿfor ֻ�����ڱ���Collection������������
//			��ʽ:for(Ԫ������ ���� : collection ����/����)	{ }

	}
}
