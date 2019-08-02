class outer {
	private int num=4;
	class inner{
		void show(){
			System.out.println(num);
		}
	}
	public void mef(){
		inner dd = new inner();
		dd.show();
	}
}
class august_2_5 {
	public static void main(String[] args){
		outer ddu = new outer();
		ddu.mef();
	}
}