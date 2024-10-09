package tests;
import java.util.Random;

public class diceReliability1000 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] sumFrequency = new int[13]; //for sums 2-12 and for doubles 1-6
        int[] doubleFrequency = new int[7];
        int totalRolls = 1000;

        // rolls die 1 and die 2, proceeds to calculate the total 
        for (int i = 0; i < 1000; i++) {
            int x = random.nextInt(6) + 1;
            int y = random.nextInt(6) + 1;
            int total = x + y; 
            
            //Update frequencies
            sumFrequency[total]++;
            if (x == y) doubleFrequency[x]++;
        }

        //Print sum of frequencies
        System.out.println("--- Sum Frequency ---");
        for (int i = 2; i <= 12; i++) {
            int count = sumFrequency[i];
            double percentage = (count * 100.0 / totalRolls);
            System.out.println("Sum " + i + ": " + count + " times (" + String.format("%.2f", percentage) + "%)");
        }

        // Print double of frequencies
        System.out.println("\n--- Double Value Frequency ---");
        for (int i = 1; i <= 6; i++) {
            int count = doubleFrequency[i];
            double percentage = (count * 100.0 / totalRolls);
            System.out.println("Double " + i + ": " + count + " times (" + String.format("%.2f", percentage) + "%)");
        }
    }
}