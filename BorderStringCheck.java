import java.util.Scanner;

public class BorderStringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the matrix dimensions
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Declare the character matrix
        char[][] mat = new char[r][c];

        // Read the matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.next().charAt(0);
            }
        }

        sc.nextLine(); // Consume the remaining newline
        String str = sc.nextLine(); // Read the target string

        // Check Top row
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c; i++) {
            sb.append(mat[0][i]);
        }
        if (sb.toString().contains(str) || sb.reverse().toString().contains(str)) {
            System.out.println("Top");
            return;
        }

        // Check Right column
        sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            sb.append(mat[i][c - 1]);
        }
        if (sb.toString().contains(str) || sb.reverse().toString().contains(str)) {
            System.out.println("Right");
            return;
        }

        // Check Bottom row
        sb = new StringBuilder();
        for (int i = 0; i < c; i++) {
            sb.append(mat[r - 1][i]);
        }
        if (sb.toString().contains(str) || sb.reverse().toString().contains(str)) {
            System.out.println("Bottom");
            return;
        }

        // Check Left column
        sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            sb.append(mat[i][0]);
        }
        if (sb.toString().contains(str) || sb.reverse().toString().contains(str)) {
            System.out.println("Left");
            return;
        }

        // If not found in any border
        System.out.println("-1");

        sc.close();
    }
}
/*Check The String Present in the border Matrix yes Print Left Right Top Bottom */
