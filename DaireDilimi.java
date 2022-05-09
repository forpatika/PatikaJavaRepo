import java.util.Scanner;
import java.lang.Math;

public class DaireDilimi {
    public static void main(String[] args) {

        int r, a;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter r: ");
        r = inp.nextInt();
        
        System.out.print("Enter a: ");
        a = inp.nextInt();

        double alan = (pi * (r*r) * a) / 360;
        
        System.out.println("\nAlan: " + alan);
    }
}