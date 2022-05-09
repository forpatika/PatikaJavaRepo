import java.util.Scanner;
import java.lang.Math;

public class UsAlma {
    public static void main(String[] args) {
    
      int n, k, result = 1;
	    Scanner inp = new Scanner(System.in);
	      
	    System.out.print("Taban: ");
	    n = inp.nextInt();
	    
	    System.out.print("Üs: ");
	    k = inp.nextInt();
	    
	    for (int i = 1; i <=k; i++) {
	      result *= n;
	    }
	    
	    System.out.println("\n" + n + "^" + k + ": " + result);
      
    }
}