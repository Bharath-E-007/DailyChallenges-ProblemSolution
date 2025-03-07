import java.util.*;

public class MatrixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] mat = new int[row][row];

        for (int i = 0; i < row * row; i++) {
            mat[i / row][i % row] = sc.nextInt();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (((mat[0][i] == mat[j][0] && mat[row - 1][i] == mat[j][row - 1]) || 
                     (mat[0][i] == mat[j][row - 1] && mat[0][row - 1] == mat[j][row - 1])) && 
                     check(mat, i, j)) {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        System.out.println("NO");
    }

    public static boolean check(int[][] mat, int i, int j) {
        int row = mat.length;
        for (int k = 0; k < row; k++) {
            if (mat[k][i] != mat[j][k] && mat[k][i] != mat[j][row - k - 1]) {
                return false;
            }
        }
        return true;
    }
}
/*Output Format:

The first line contains YES or NO.

Example Input/Output 1:

Input:

4

2345

35 109

6 10 8 8

7921

Output:

YES

Explanation:

2nd row and 2nd column of the given matrix are identical.

2345

35 10 9

61088

7921

So YES is printed as the output.

Example Input/Output 2:

Input

3

453

133

451

Output

YES

Explanation:

2nd row and 3rd column(bottom to top) are identical

4 5 3

1 3 3

4 5 1

So YES is printed as the output. */