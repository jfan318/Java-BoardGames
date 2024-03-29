public class Message {
    
    public static void welcome() {
        System.out.println("Welcome to the Board Game Center!");
    }

    public static void displayMenu() {
        System.out.println("Please enter the number of the game you want to play, or exit the program.\n");
        System.out.println("1. Tic-Tac-Toe");
        System.out.println("2. Coming soon...");
        System.out.println("3. Exit");
        System.out.println();
    }

    public static void playerChoice(Player player) {
        System.out.println("Player " + player.getMark() + " ENTER YOUR MOVE");
    }

    public static void congratulation(Player player) {
        System.out.println("Congratulations! Player " +  player.getMark() + " wins!\n");
    }

    public static void drawGame() {
        System.out.println("It's a tie!\n");
    }
    
}
