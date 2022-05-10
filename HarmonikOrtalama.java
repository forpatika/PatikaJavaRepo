public class HarmonikOrtalama {
    public static void main(String[] args) {

      int[] numbers = {1, 2, 3, 4, 5};
      double harmonikSum = 0;
      
      for (int i = 0; i < numbers.length; i++)
        harmonikSum += 1.0 / numbers[i];
      
      double ortalama = numbers.length / harmonikSum;
      System.out.println("Harmonik Ortalama: " + ortalama);

    }
}