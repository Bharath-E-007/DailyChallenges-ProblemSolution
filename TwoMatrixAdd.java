import java.util.Scanner;

public class TwoMatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int mat[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int val = sc.nextInt();
                mat[i][col - j - 1] += val;
            }
        }

        for (int[] arr : mat) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
        System.exit(0);
    }
}
/*
 * Example Input/Output 1:

Input:

3 3

10 20 30

40 50 60

70 80 90

100 200 300

400 500 600

700 800 900

Output:

310 220 130

640 550 460

970 880 790

Explanation:

After flipping the matrix M2 horizontally, the matrix becomes

300 200 100

600 500 400

900 800 700

The sum of integers in two matrices M1 and M2 at the same positions is given bellow.

310 220 130

640 550 460

970 880 790
 */
