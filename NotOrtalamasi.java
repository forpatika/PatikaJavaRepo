import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        
        int mat, fizik, kimya, turkce, tarih, muzik;
        
        Scanner inputer = new Scanner(System.in);
        
        System.out.print("Matematik Notu: ");
        mat = inputer.nextInt();
        
        System.out.print("Fizik Notu: ");
        fizik = inputer.nextInt();
        
        System.out.print("Kimya Notu: ");
        kimya = inputer.nextInt();
        
        System.out.print("Turkce Notu: ");
        turkce = inputer.nextInt();
        
        System.out.print("Tarih Notu: ");
        tarih = inputer.nextInt();
        
        System.out.print("Muzik Notu: ");
        muzik = inputer.nextInt();
        
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        
        System.out.println(ortalama > 60 ? "\nSınıfı Geçti" : "\nSınıfta Kaldı");
        
        System.out.println(ortalama);
    }
}