import java.util.Scanner;

public class UC2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        char UserLetter = chooseLetter();
        char ComputerLetter;
        if (UserLetter == 'X') {
            ComputerLetter = '0'; // if user entered value x computerletter will be 0
        } else {
            ComputerLetter = 'X'; // if user entered value 0 computerletter will be x
        }
        System.out.println("Computer Letter is: " + ComputerLetter + " User Letter is:" + UserLetter); // printing statement
    }

    public static char chooseLetter() {
        char alphabet;
        Scanner UserInput = new Scanner(System.in);
        // taking input
        System.out.println("Enter the Alphabet");
        alphabet = UserInput.next().toUpperCase().charAt(0);
        return alphabet;

    }

    public static char[] createBoard() {
        char[] board = new char[10]; // creat board
        for (int index = 0; index < board.length; index++) {
            board[index] = ' ';
        }
        return board;
    }
}