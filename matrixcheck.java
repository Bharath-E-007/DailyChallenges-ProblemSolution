import java.util.*;

public class matrixcheck {
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