import java.util.Scanner;
import java.lang.Math;

public class SinifGecmeDurumu {
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
      
      System.out.print("Muzik Notu: ");
      muzik = inputer.nextInt();
      
      int counter = 5, toplam = (mat + fizik + kimya + turkce + muzik);
      if (mat < 0 || mat > 100) {
        toplam -= mat;
        counter--;
      }
      if (fizik < 0 || fizik > 100) {
        toplam -= fizik;
        counter--;
      }
      if (kimya < 0 || kimya > 100) {
        toplam -= kimya;
        counter--;
      }
      if (turkce < 0 || turkce > 100) {
        toplam -= turkce;
        counter--;
      }
      if (muzik < 0 || muzik > 100) {
        toplam -= muzik;
        counter--;
      }
      
      double ortalama = toplam / counter;
     
      if (ortalama <= 55) {
        System.out.println("\nSınıfta kaldınız");
        System.out.println(ortalama);
      } else {
        System.out.println("\nSınıfı geçtiniz");
        System.out.println(ortalama);
      }
      
   
    }
}