import java.util.Scanner;

public class MatrixSortBasedOnTheAlpha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        String mat[][] = new String[row][col];
        char alpha[] = new char[row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.next();
                if (Character.isAlphabetic(mat[i][j].charAt(0))) {
                    alpha[i] = mat[i][j].charAt(0);
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < row; j++) {
                if (alpha[i] > alpha[j]) { // Corrected comparison logic
                    char temp = alpha[i];
                    alpha[i] = alpha[j];
                    alpha[j] = temp;
                    swap(mat, i, j); // Corrected method call
                }
            }
        }

        for (String[] arr : mat) {
            for (String s : arr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        sc.close(); // Close the scanner
    }

    public static void swap(String[][] str, int i, int j) {
        for (int k = 0; k < str[i].length; k++) {
            String temp = str[i][k]; // Corrected assignment operator
            str[i][k] = str[j][k];
            str[j][k] = temp;
        }
    }
}

/*
 * 
 * Input:
 * 3 3
 * a 1 2
 * b 3 4
 * 1 3 a
 * 
 * Sort Based On alpha in The Row 
 */
