import java.util.Scanner;

public class UC3 {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        char[] board = createBoard();
        char UserLetter = chooseLetter1();
        char ComputerLetter;
        if (UserLetter == 'X') {
            ComputerLetter = '0'; // if user entered value x computerletter will be 0
        } else {
            ComputerLetter = 'X'; // if user entered value 0 computerletter will be x
        }
        System.out.println("Computer Letter is: " + ComputerLetter + " User Letter is:" + UserLetter); // printing statement
        showBoard(board);
    }

    public static char chooseLetter1() {
        char alphabet;
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter the Alphabet");
        alphabet = UserInput.next().toUpperCase().charAt(0);
        return alphabet;

    }

    public static void showBoard(char[] board) {
        System.out.println("\n" + board[1] + "|" + board[2] + " | " + board[3]);
        System.out.println("--------");
        System.out.println(board[4] + "|" + board[5] + " | " + board[6]);
        System.out.println("--------");
        System.out.println(board[7] + "|" + board[8] + " | " + board[9]);
        System.out.println("--------");

    }

    // created method to allow player to give input
    public static char chooseLetter() {
        char alphabet;
        Scanner UserInput = new Scanner(System.in);
        // taking input
        System.out.println("Enter the Alphabet");//Seeking input from user
        alphabet = UserInput.next().toUpperCase().charAt(0);
        return alphabet;

    }

    public static char[] createBoard() {
        // created matrix board
        char[] board = new char[10];
        for (int index = 0; index < board.length; index++) {
            board[index] = ' ';
        }
        return board; // return board
    }
}