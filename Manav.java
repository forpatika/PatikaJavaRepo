import java.util.Scanner;
import java.lang.Math;

public class Manav {
    public static void main(String[] args) {
      
      double Armut = 2.14;
      double Elma = 3.67;
      double Domates = 1.11;
      double Muz = 0.95;
      double Patlican = 5.00;
      double Toplam;
      int armut, elma, domates, muz, patlican;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Armut kilo: ");
      armut = inp.nextInt();
      
      System.out.print("Elma kilo: ");
      elma = inp.nextInt();
      
      System.out.print("Domates kilo: ");
      domates = inp.nextInt();
      
      System.out.print("Muz kilo: ");
      muz = inp.nextInt();
      
      System.out.print("Patlican kilo: ");
      patlican = inp.nextInt();
      
      Toplam = (Armut * armut) + (Elma * elma) + (Domates * domates) + (Muz * muz) + (Patlican * patlican);
        
      System.out.println("\n Toplam Tutar: " + Toplam);
    }
}