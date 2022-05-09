import java.util.Scanner;
import java.lang.Math;

public class EtkinlikOneri {
    public static void main(String[] args) {
      
      int heat;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Sıcaklık giriniz ");
      heat = inp.nextInt();
      
      if (heat < 5) 
        System.out.println("\nKayak Yapabilirsiniz");
      else if (heat > 25)
        System.out.println("\nYüzmeye gidebilirsiniz");
      else {
        if (heat <= 15)
          System.out.println("\nSinemaya gidebilirsin");
        if (heat >= 10)
          System.out.println("\nPikniğe gidebilirsin");
      }
      
   
    }
}