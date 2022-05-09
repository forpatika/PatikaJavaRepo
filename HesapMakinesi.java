import java.util.Scanner;
import java.lang.Math;

public class HesapMakinesi {
    public static void main(String[] args) {
      
      int a, b;
      char ch;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("İlk Sayı: ");
      a = inp.nextInt();
      
      System.out.print("İkinci Sayı: ");
      b = inp.nextInt();
      
      System.out.print("İşlem Karakteri: ");
      ch = inp.next().charAt(0);  // yazılan stringin ilk harfini alır.
      //ch = inp.next(".").charAt(0);  // yazılan stringi sadece bir harf girilmesi için zorlar.
      
      System.out.print(ch);
      
      switch (ch) {
        case '+':
          System.out.println("\nToplam: " + (a + b));
          break;
        case '-':
          System.out.println("\nÇıkarım: " + (a - b));
          break;
        case '*':
          System.out.println("\nÇarpım: " + (a * b));
          break;
        case '/':
          System.out.println("\nBölüm: " + (a / b));
          break;
        default:
          System.out.println("\nHatalı 4 işlem karakteri");
          break;
        
      }
    }
}