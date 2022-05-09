import java.util.Scanner;
import java.lang.Math;

public class DiamondwithStars {
    public static void main(String[] args) {
    
      int number;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Enter number: ");
      number = inp.nextInt();
      
      System.out.println();
      
      for (int i = 0; i < number; i++) {
        if (i < number / 2) {
          for (int j = 0; j < ((number/2) - i); j++)
            System.out.print(" ");
          for (int k = 1; k <= 2 * i + 1; k++)
            System.out.print("*");
        }
        else {
          for (int j = 0; j < (i - (number / 2)); j++)
            System.out.print(" ");
          for (int k = 1; k <= (number - i) * 2 - 1; k++)
            System.out.print("*");
        }
        System.out.print("\n");
      }
      
    }
}