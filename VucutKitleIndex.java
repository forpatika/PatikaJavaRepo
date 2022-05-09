import java.util.Scanner;
import java.lang.Math;

public class VucutKitleIndex {
    public static void main(String[] args) {
      
      double boy, kilo;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
      boy = inp.nextDouble();
      System.out.print("Lütfen kilonuzu giriniz : ");
      kilo = inp.nextDouble();
      
      System.out.print("\nVücut Kitle İndeksiniz  : " + (kilo / (boy * boy)));
        
    }
}