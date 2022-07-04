import java.util.Scanner;

public class DecisionMakerApp {

	public static void main(String[] args) {
		
		/* 
		Use if/else statements to take different actions depending on user input.  
		Given an integer entered by a user, perform the following conditional actions:
		If the integer entered is odd, print the number entered and “Odd.”
		If the integer entered is even and in the inclusive range of 2 to 25, print “Even and less than 25.”
		If the integer entered is even and in the inclusive range of 26 to 60, print “Even.”
		If the integer entered is even and greater than 60, print the number entered and “Even.”
		If the integer entered is odd and greater than 60, print the number entered and “Odd and over 60.”
		*/
		
		String yesNo = "";
		String name = "";
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("What is you name? ");
		name = scan.next();
		
		
		do {			
			try {	
			  System.out.println("Hello " + name + " enter a number between 1 and 100");
			  	int num = scan.nextInt();
			  	
			  if(num <= 0 || num > 100) {
				  System.out.println("Great start" + name + ", but you must pick a number between 1 - 100 ");
				  
			  }	else if(num % 2 == 0 && num < 25) {
				  System.out.println(name + " " + num + " even and less than 25");
				  
			  }else	if(num % 2 != 0 && num < 60) {
				  System.out.println(name +" " +   num + " is odd");
				  
			    }else if(num % 2 == 0 && num >25 || num < 60) {
				  System.out.println(name + " " + num + " is even");
				  
			    }else if(num % 2 == 0 && num > 60) {
				  System.out.println(name + " "+ num + " is even");
				  
			    }else if(num % 2 != 0 && num > 60) {
				  System.out.println( name + " " + num + " is odd and over 60.");
			  }
			}catch(Exception e) {
				System.out.println("Not Valid. Please enter a number between 1 to 100");
			}
			  
			  System.out.println("Continue? (Y/N)");
		      yesNo = scan.next();
		         
		      if(yesNo.equalsIgnoreCase("N") ) {
		    	   System.out.println("Good Bye " + name + "!");
		       } 
		         
		}while(yesNo.equalsIgnoreCase("Y") );
		
		scan.close();

	}

}
