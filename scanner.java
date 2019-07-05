import java.util.Scanner;

public class Scanner {
	    public static void main(String[] args) {
		            Scanner userimport = new Scanner(System.in);
			            System.out.println("Please go on import any character");
				            if (userimport.hasNextLine()) {
						                String str2 = userimport.nextLine();
								            System.out.println("" + str2);
									            }
					            userimport.close();
						        }
}
