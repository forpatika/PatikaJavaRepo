import java.util.Scanner;
import java.lang.Math;

public class BurcProgram {
    public static void main(String[] args) {
      
      int month, day;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Month: ");
      month = inp.nextInt();
      
      System.out.print("Day: ");
      day = inp.nextInt();
      
      if (month == 1) {
        if (day >= 1 && day <= 31) {
          if (day < 22)
            System.out.println("Oğlak");
          else
           System.out.println("Kova");
        }else
          System.out.println("Geçersiz Gün");
      } 
      else if (month == 2) {
        if (day >= 1 && day <= 28) {
          if (day < 20)
            System.out.println("Kova");
          else
           System.out.println("Balık");
        }else
          System.out.println("Geçersiz Gün");
      }
      
   
    }
}