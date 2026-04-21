public class uc1 {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (char[] board1 : board) {
            for (int j = 0; j < board1.length; j++) {
                board1[j] = '-';
            }
        }
        System.out.println("Tic-Tac-Toe Board:");

        for (char[] board1 : board) {
            for (int j = 0; j < board1.length; j++) {
                System.out.print(board1[j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}