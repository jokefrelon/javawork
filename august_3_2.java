class ticket implements Runnable{
	int leftTickets = 100;
	Object obj = new Object();
	public void sellTicket(){
		while(true){
			synchronized(obj){
				if (leftTickets>=1) {
				System.out.println(Thread.currentThread().getName()+" sell the ticket "+leftTickets--);
				}
			}
		}
		
	}
	public void run(){
		sellTicket();
	}
}
class august_3_2{
public static void main(String[] args) {
	ticket person = new ticket();
	Thread person1 = new Thread (person);
	Thread person2 = new Thread (person);
	Thread person3 = new Thread (person);
	Thread person4 = new Thread (person);
	person1.start();
	person2.start();
	person3.start();
	person4.start();
	}
}