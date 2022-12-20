public class UC1 {
    public static void main(String[] args) {
        System.out.println("welcome to tik tak toe game");
        char[] board = createBoard();
    }

    public static char[] createBoard() {
        char[] board = new char[10];
        for (int index = 0; index < board.length; index++) {
            board[index] = ' ';

        }
 return board;

    }
}
