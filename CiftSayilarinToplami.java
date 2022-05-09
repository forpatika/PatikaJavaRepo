import java.util.Scanner;
import java.lang.Math;

public class CiftSayilarinToplami {
    public static void main(String[] args) {
    
      int sum = 0, number;
	    Scanner inp = new Scanner(System.in);
	      
	    do {
	    	System.out.print("Enter a Number: ");
	    	number = inp.nextInt();
	        
	        if (number % 4 == 0)
	          sum += number;
	        
	        
	    }while(number % 2 == 0);
	   
	    System.out.println("\nToplam: " + sum); 
      
    }
}