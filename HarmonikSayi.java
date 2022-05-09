import java.util.Scanner;
import java.lang.Math;

public class HarmonikSayi {
    public static void main(String[] args) {
    
      int number;
      double sum = 0;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Enter a nuMber: ");
      number = inp.nextInt();
      
      for(double i = 1; i <= number; i++) {
        sum += (1/i);
      }
      System.out.println("\nSum: " + sum);
      
    }
}