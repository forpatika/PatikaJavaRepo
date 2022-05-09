import java.util.Scanner;
import java.lang.Math;

public class Alan {
    public static void main(String[] args) {

        int a, b, c;
        
        System.out.print("İlk kenar: ");
        Scanner inp = new Scanner(System.in);
        a = inp.nextInt();
        
        System.out.print("İkinci kenar: ");
        b = inp.nextInt();
        
        System.out.print("Üçüncü kenar: ");
        c = inp.nextInt();
        
        double u = (a + b + c) / 2.0;
        double cevre = 2 * u;
        double alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));
        
        System.out.println("\n" + alan);

        
    }
}