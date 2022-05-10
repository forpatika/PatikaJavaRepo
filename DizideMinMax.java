import java.util.Scanner;
import java.util.Arrays;

public class DizideMinMax {
    public static void main(String[] args) {

      int[] list = {15,12,788,1,-1,-778,2,0};
      Scanner inp = new Scanner(System.in);
      int number;
      
      System.out.print("Enter number: ");
      number = inp.nextInt();
      
      Arrays.sort(list);
      int min = -1, max = -1;

      for (int i = 0; i < list.length; i++) {
        if (list[i] < number)
          min = list[i];
        else {
          max = list[i];
          break;
        }
      }

        System.out.println("\nGirilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
        
        

    }
}