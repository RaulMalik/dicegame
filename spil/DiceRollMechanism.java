import java.util.Random;

public class DiceRollMechanism {
    public static DiceResult rollDice() {

        Random random = new Random();
        int x = random.nextInt(6) + 1; // Roll die 1
        int y = random.nextInt(6) + 1; // Roll die 2
        int total = x + y;             // Calculate total

        return new DiceResult(x, y, total); // Return die 1,die 2 and total value of die, in DiceResult object
    }
}
