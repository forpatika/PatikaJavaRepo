import java.util.Scanner;

public class KDVHesap {
    public static void main(String[] args) {

        double kdvsizFiyat;

        double kdvliFiyat;
        
        System.out.print("Enter Price: ");
        Scanner inp = new Scanner(System.in);
        kdvsizFiyat = inp.nextDouble();
        
        double kdvOran = kdvsizFiyat > 1000 ? 0.08 : 0.18;
        
        double kdvTutar = kdvsizFiyat * kdvOran;
        
        kdvliFiyat = kdvsizFiyat + kdvTutar;
        
        System.out.println("\nKdv Oran: " + kdvOran);
        System.out.println("\nKdv Tutar: " + kdvTutar);
        System.out.println("\nKdvli Fiyat: " + kdvliFiyat);
    }
}