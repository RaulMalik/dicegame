public class GameInitialization {
    // Creates two static Player objects named player1 and player2. These objects are instances of the Player class.
    public static Player player1 = new Player();
    public static Player player2 = new Player();

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        System.out.print("Player 1's name: ");
        String player1Name = scanner.nextLine();
        player1.setPlayerName(player1Name);

        System.out.print("Player 2's name: ");
        String player2Name = scanner.nextLine();
        player2.setPlayerName(player2Name);

        System.out.println("Let the game begin!");

        do {
            // Player 1's turn
            var Start1 = "";
            do {
                System.out.println(player1.getPlayerName() + ", start by writing 'Roll'");
                Start1 = scanner.nextLine();

                if (!Start1.equalsIgnoreCase("Roll")) {

                }
            } while (!Start1.equalsIgnoreCase("Roll"));

            long start = System.nanoTime();
            DiceResult diceResult1 = DiceRollMechanism.rollDice(); // Now we return DiceResult
            int total1 = diceResult1.total; // Get total from DiceResult
            long duration = (System.nanoTime() - start) / 1000000;
            System.out.println(player1.getPlayerName() + " rolled " + diceResult1.die1 + " and " + diceResult1.die2 + " a total of " + total1);
            System.out.println(duration + " ms");
            player1.setPlayerScore(player1.getPlayerScore() + total1); // Update the score

            // Player 2's turn
            var Start2 = "";
            do {
                System.out.println(player2.getPlayerName() + ", start by writing 'Roll'");
                Start2 = scanner.nextLine();

                if (!Start2.equalsIgnoreCase("Roll")) {

                }
            } while (!Start2.equalsIgnoreCase("Roll"));

            DiceResult diceResult2 = DiceRollMechanism.rollDice(); // Return DiceResult for Player 2
            int total2 = diceResult2.total; // Get total from DiceResult
            System.out.println(player2.getPlayerName() + " rolled " + diceResult2.die1 + " and " + diceResult2.die2 + " a total of " +  total2);
            player2.setPlayerScore(player2.getPlayerScore() + total2);

            // Display both players' scores
            System.out.println(player1.getPlayerName() + " has a score of " + player1.getPlayerScore() +
                    " and " + player2.getPlayerName() + " has a score of " + player2.getPlayerScore());

        } while (player1.getPlayerScore() < 40 && player2.getPlayerScore() < 40);

        // Determine the winner
        if (player1.getPlayerScore() >= 40) {
            System.out.println(player1.getPlayerName() + " won!");
        } else if (player1.getPlayerScore() == player2.getPlayerScore()) {
            System.out.println("The game has ended in a Draw!");
        } else {
            System.out.println(player2.getPlayerName() + " won!");
        }
    }
}
