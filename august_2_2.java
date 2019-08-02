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
class august_2_2 {
	public static void main(String[] args){
        outer in = new outer();
        in.mef();
	}
}