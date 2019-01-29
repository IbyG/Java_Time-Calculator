
import java.util.Scanner; //for keyboard
import java.text.DecimalFormat; // for the decimals

public class TimeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter and amount in seconds: "); //asking the question
		int theInput = kb.nextInt(); //getting the output
		
		while(theInput <= 0) { //keeps asking the question until there is a valid input
			System.out.println("this is an invalid number try again");
			
			System.out.println("Enter and amount in seconds: ");
			 theInput = kb.nextInt();
		}
		
		kb.close(); //closing keyboard
		
		//double calc = (double)theInput/60; //this calculates 
		
		 double calc = 0.0;
		
		String title = "" ; //this will change based on the IF statement 
		
		if(theInput < 60) { //determines the title and the answer
			title = "seconds";
		}
		else if(theInput < 3600) { //determines the title of the answer
			title = "minutes";
		    calc = (double)theInput/60.0; // > 61 turning into minutes by dividing 60 
			
		}else if(theInput < 86400) {
			title = "hour/s";
			calc = (double)theInput/60.0; //minutes  //these two lines can be put in a function 
			calc = calc/60; //hours
		}else {
			title = "day/s";
			calc = (double)theInput/60.0; //minutes
			calc = calc/60.0; //hours 
			calc = calc/24.0; //days
		}
		
		DecimalFormat df = new DecimalFormat("###.##"); // for the decimal places
		
		System.out.println(df.format(calc) + " " + title); // reference https://www.mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
		
		
		
		
	}

}
