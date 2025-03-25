import java.util.Scanner;

public class matrixsubSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        int matrix[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row - 2; i += 3) {
            for (int j = 0; j < col - 2; j += 3) {
                int arr[] = new int[10];
                for (int k = 0; k < 9; k++) {
                    arr[matrix[i + k / 3][j + k % 3]]++;
                }

                boolean found = true;
                for (int l = 1; l < 10; l++) {
                    if (arr[l] == 0 || arr[l] > 1) {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    for (int k = 0; k < 9; k++) {
                        matrix[i + k / 3][j + k % 3] = k + 1;
                    }
                }
            }
        }

        for (int[] arr : matrix) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.exit(0);
    }
}
/*
 * Sort Digits in Submatrices

The program must accept an integer matrix of size R°C as the input. The matrix contains only digits from 1 to 9. The values of R and C are always divisible by 3. The program must find the 3*3 submatrices having all the digits from 1 to 9. Then the program must sort the digits within those submatrices in ascending order. Finally, the program must print the modified matrix as the output.

Boundary Condition(s):

3<=RC <= 48

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integer values separated by a space.
 */
