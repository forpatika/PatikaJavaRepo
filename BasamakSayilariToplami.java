import java.util.Scanner;
import java.lang.Math;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
    
      int number, digits = 0, tempNumber, sum = 0;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      number = inp.nextInt();
      
      tempNumber = number;
      while(tempNumber > 0) {
        tempNumber = tempNumber / 10;
        digits++;
      }
      
      tempNumber = number;
      for (int i = digits - 1; i >= 0; i--) {
        int temp = tempNumber / (int)Math.pow(10, i);
        if (temp == 0)
          continue;
        tempNumber %= (temp * (int)Math.pow(10, i));
        sum += temp;
      }
      
      System.out.println("\nBasamak Sayıları Toplamı: " + sum);
      
      
    }
}