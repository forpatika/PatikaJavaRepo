import java.util.Scanner;
import java.lang.Math;

public class KuvvetBulma {
    public static void main(String[] args) {
    
      int number;
	    Scanner inp = new Scanner(System.in);
	      
	    System.out.print("Enter a Number: ");
	    number = inp.nextInt();
	    int counter = 0;
	    System.out.println();
	    for (int i = 1, j = 1; i <= number && j <= number; i *= 4, j *= 5) {
	      System.out.println("4^" + counter + ": " + i);
	      System.out.println("5^" + counter + ": " + j);
	      counter++;
	    }
      
    }
}