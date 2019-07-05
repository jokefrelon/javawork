public class Freeme{
	    String theFirstPerson;
	        double salaryPerDay;
		    int workedDays;
		         
		        int lateday;
			    int permoney;
			        public void earnedMoney(){
					        if(workedDays>=2){
							            System.out.println("Dear "+theFirstPerson+" ! "+" You hava worked "+workedDays+" days "+" , and your salary is "+salaryPerDay*workedDays+"$");
								            }else{
										                System.out.println("Dear "+theFirstPerson+" ! "+" You hava worked "+workedDays+" day "+" , and your salary is "+salaryPerDay*workedDays+"$");
												        }
						    }
				    public void punish(){
					            if (lateday>=30){
							                System.out.println("Man! you are fired ! with no salary!");
									        }else{
											            System.out.println("Get up early! Do not be late next time ! and your hava to cost "+lateday*permoney+"$");
												            }

						        }
}
