import java.util.Scanner;
public class july_5_1 {
	    public static void main (String [] args){
		            Freeme allsalary = new Freeme();
			            Scanner usernextinput = new Scanner(System.in);
				            System.out.println("------------------------------------------------------------------");
					            System.out.println("Please input your late days");
						            allsalary.lateday=usernextinput.nextInt();
							            System.out.println("------------------------------------------------------------------");
								            System.out.println("Please input your perDay'PunishedMoney");
									            allsalary.permoney=usernextinput.nextInt();
										            usernextinput.close();
											            System.out.println("------------------------------------------------------------------");
												            allsalary.punish();
													            System.out.println("------------------------------------------------------------------");

														        }
}
