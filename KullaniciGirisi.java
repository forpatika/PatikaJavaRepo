import java.util.Scanner;
import java.lang.Math;

public class KullaniciGirisi {
    public static void main(String[] args) {
      
      String username, password;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Username: ");
      username = inp.nextLine();
      
      System.out.print("Password: ");
      password = inp.nextLine();
      
      if (username.equals("Patika") && password.equals("123456")) {
        System.out.println("\nGiriş Yapıldı");
      }
      else if(!password.equals("123456")) {
        System.out.println("\nŞifre hatalı. Şifre sıfırlamak istiyor musunuz ? evet veya hayır yazın");
        String ans = inp.nextLine();
        switch(ans) {
          case "yes":
            System.out.print("Yeni Sifreniz: ");
            String yeniSifre = inp.nextLine();
            if (yeniSifre.equals("123456"))
              System.out.println("\nŞifre oluşturuldu");
            else 
              System.out.println("\nŞifre oluşturulamadı, lütfen başka şifre giriniz.");
            break;
          case "no":
            System.out.println("\nÇıkış yapılıyor.");
            break;
          default:
            System.out.println("\nGeçersiz İşlem");
            break;
        }
      }
      
      
      
    }
}