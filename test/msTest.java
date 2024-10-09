package test;
import java.util.Random;

public class msTest {
    public static void main (String[] args){
        Random random = new Random();
        long start = System.nanoTime();

        int x = random.nextInt(6) + 1; // Roll die 1
        int y = random.nextInt(6) + 1; // Roll die 2
        int total = x + y;             // Calculate total
        
        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(total);
        System.out.println(duration + " ms");
    }

}