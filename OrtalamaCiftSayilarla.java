import java.util.Scanner;
import java.lang.Math;

public class OrtalamaCiftSayilarla {
    public static void main(String[] args) {
    
      int number, sum = 0, counter = 0;
      Scanner inputer = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      number = inputer.nextInt();
      
      for (int i = 0; i <= number; i++) {
        if (i != 0 && i % 3 == 0 && i % 4 == 0)
        {
          sum += i;
          counter++;
        }
      }
      System.out.println("\nOrtalama: " + (double)(sum / counter));
   
    }
}