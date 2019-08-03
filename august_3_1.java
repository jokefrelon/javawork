class dayu extends Thread{
	int fork;
	dayu(int hetyu){
		this.fork=hetyu;
	}
	void stand(){
		for (int ed=1;ed<20;ed++ ) {
			System.out.println(fork+"--------"+ed);
		}
	}
	public void run(){
		stand();
	}
	// public void start(){
	// 	this.run();
	// }
}
class august_3_1{
	public static void main(String[] args) {
		dayu gcc = new dayu(211);
		dayu gc = new dayu(985);
		gcc.start();
		gc.start();
	}
}