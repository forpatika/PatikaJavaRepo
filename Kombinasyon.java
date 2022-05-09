import java.util.Scanner;
import java.lang.Math;

public class Kombinasyon {
    public static void main(String[] args) {
    
      int n, r;
	    Scanner inp = new Scanner(System.in);
	      
	    System.out.print("Enter n: ");
	    n = inp.nextInt();
	    
	    System.out.print("Enter r: ");
	    r = inp.nextInt();
	    
	    int nfactoriyel = 1, rfactoriyel = 1, farkfactoriyel = 1;
	    
	    for (int i = 1; i <= n; i++) {
	      nfactoriyel *= i;
	      if (i <= r)
	        rfactoriyel *= i;
	      if (i <= (n - r))
	        farkfactoriyel *= i;
	    }
	    
	    double kombinasyon = ((double)nfactoriyel / (rfactoriyel * farkfactoriyel));
	    System.out.println("Kombinasyon: " + kombinasyon);
      
    }
}