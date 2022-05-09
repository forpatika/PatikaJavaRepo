import java.util.Scanner;
import java.lang.Math;

public class KucuktenBuyuge {
    public static void main(String[] args) {
      
      int a, b, c;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("ilk Sayı: ");
      a = inp.nextInt();
      
      System.out.print("İkinci Sayı: ");
      b = inp.nextInt();
      
      System.out.print("Üçüncü Sayı: ");
      c = inp.nextInt();
      
      if ((a < b) && (a < c)) {
        if (b < c)
          System.out.println("\na < b < c");
        else 
          System.out.println("\na < c < b");
      } else if ((b < a) && (b < c)) {
        if (a < c)
          System.out.println("\nb < a < c");
        else 
          System.out.println("\nb < c < a");
      } else if ((c < a) && (c < b)) {
        if (a < b)
          System.out.println("\nc < a < b");
        else 
          System.out.println("\nc < b < a");
      }
      
   
    }
}