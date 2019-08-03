class ud extends Thread{
	private String hello;
	ud(String hello){
		this.hello=hello;
	}
	public void kill(){
		for (int we=10;we<=20;we ++){
			System.out.println(hello+"--------"+ we); 
		}
	}
	public void run(){
		kill();
	}
}
class august_3{
	public static void main(String[] args) {
		ud iid = new ud("douyu");
		ud iic = new ud("huyatv");
		iid.start();
		iic.start();
	}
}