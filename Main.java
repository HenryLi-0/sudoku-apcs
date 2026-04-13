import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[][] board = new int[9][9];

        fill(board);
        display(board); 
    }

    public static boolean fill(int[][] board) {
        for (int r=0; r<9; r++) {
            for (int c=0; c<9; c++) {
                if (board[r][c]==0) {
                    ArrayList<Integer> numbers = new ArrayList<>();
                    for (int i=1; i<=9; i++) {
                        numbers.add(i);
                    }
                    Collections.shuffle(numbers); // simplifies shuffling
                    for (int num:numbers) {
                        if (isValid(board, r, c, num)) {
                            board[r][c]=num;
                            if (fill(board)) {
                                return true;
                            } else {
                                board[r][c] = 0;
                            }
                        }
                    }
                    return false; // do backtrack
                }
            }
        }
        return true; // good
    }

    public static boolean isValid(int[][] board, int r, int c, int num) {
        for (int i=0; i<9; i++) {
            if (board[r][i] == num) {
                return false;
            }
        }

        for (int i=0; i<9; i++) {
            if (board[i][c]==num) {
                return false;
            }
        }

        for (int i=0; i<9; i++) {
            if (board[(r-r%3)+((i-i%3)/3)][(c-c%3)+(i%3)]==num) {
                return false;
            }
        }

        return true;
    }

    public static void display(int[][] board) {
        for (int r=0; r<9; r++) {
            if (r%3==0) {
                System.out.println("+-------+-------+-------+");
            }
            System.out.print("| ");
            for (int c=0; c<9; c++) {
                System.out.print(board[r][c]);
                System.out.print(c%3==2?" | ":" ");
            }
            System.out.println();
        }
        System.out.println("+-------+-------+-------+");
    }
}
