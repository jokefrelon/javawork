import java.util.Scanner;
public class july_5 {
	    public static void main (String [] args){
		            Freeme allsalary = new Freeme();
			            Scanner userin = new Scanner(System.in);
				            System.out.println("Please enter your name: ");
					            allsalary.theFirstPerson=userin.nextLine();
						            System.out.println("Please enter your salary per day");
							            allsalary.salaryPerDay=userin.nextDouble();
								            System.out.println("Please enter your worked days");
									            allsalary.workedDays=userin.nextInt();
										            userin.close();
											            System.out.println("------------------------------------------------------------------");

												            System.out.println("Your name: "+allsalary.theFirstPerson);
													            System.out.println("Your salary per day: "+allsalary.salaryPerDay+"$");
														            System.out.println("You hava worked: "+allsalary.workedDays);
															            System.out.println("------------------------------------------------------------------");
																            allsalary.earnedMoney();
																	            System.out.println("------------------------------------------------------------------");

																		        }
}
