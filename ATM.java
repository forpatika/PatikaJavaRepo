import java.util.Scanner;
import java.lang.Math;

public class ATM {
    public static void main(String[] args) {
    
      String definedUserName = "patika", definedPassword = "123456";
      String username, password;
      int select;
      int balance = 1500;
      Scanner inp = new Scanner(System.in);
      
      int counter = 0;
      while (counter < 3) {
        System.out.print("Enter Username: ");
        username = inp.nextLine();
      
        System.out.print("Enter Password: ");
        password = inp.nextLine();
        
        if (username.equals(definedUserName) && password.equals(definedPassword)) {
          
          do {
            System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
            System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            select = inp.nextInt();
            
            switch (select) {
              case 1:
                System.out.print("Para miktarı : ");
                int price = inp.nextInt();
                balance += price;
                break;
              case 2:
                System.out.print("Para miktarı : ");
                price = inp.nextInt();
                if (price > balance) {
                  System.out.println("Bakiye yetersiz.");
                } 
                else {
                  balance -= price;
                }
                break;
              case 3:
                System.out.println("Bakiyeniz : " + balance);
                break;
              case 4:
                System.out.println("Çıkış Yapılıyor");
                break;
              default:
                System.out.println("Hatalı Giriş");
                break;
            }
          } while (select != 4);
        } 
        else {
          System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
          counter++;
          if (counter == 3) {
            System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
          }
          else {
            System.out.println("Kalan Hakkınız : " + (3 - counter));
          }
        }
        
      }
      
      
    }
}