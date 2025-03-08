import java.util.Scanner;

public class matrixStartWithvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        String[][] mat = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.next();
            }
        }

        int k = sc.nextInt();
        String d = sc.next();
        int sum = 0;

        for (int i = 0; i <= row - k; i++) {
            for (int j = 0; j <= col - k; j++) {
                if (mat[i][j].startsWith(d)) {
                    if (check(mat, i, j, k, d)) {
                        for (int l = 0; l < k * k; l++) {
                            sum += Integer.parseInt(mat[i + (l / k)][j + (l % k)]);
                        }
                        System.out.println(sum);
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(-1);
    }

    public static boolean check(String[][] mat, int i, int j, int k, String d) {
        for (int l = 0; l < k; l++) {
            for (int m = 0; m < k; m++) {
                if (!mat[i + l][j + m].startsWith(d)) {
                    return false;
                }
            }
        }
        return true;
    }
}
