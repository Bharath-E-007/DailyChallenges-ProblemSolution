import java.util.*;

public class PathExistMatrix {
    public static int getWeight(char c) {
        return Character.toLowerCase(c) - 'a' + 1;
    }

    public static int calculatePathSum(char[][] matrix, int x1, int y1, int x2, int y2) {
        int sum1 = 0, sum2 = 0;
        
        // Convert to 0-based index
        x1--; y1--; x2--; y2--;

        // Same row
        if (x1 == x2) {
            int start = Math.min(y1, y2);
            int end = Math.max(y1, y2);
            for (int j = start; j <= end; j++) {
                sum1 += getWeight(matrix[x1][j]);
            }
            return sum1;
        }

        // Same column
        if (y1 == y2) {
            int start = Math.min(x1, x2);
            int end = Math.max(x1, x2);
            for (int i = start; i <= end; i++) {
                sum1 += getWeight(matrix[i][y1]);
            }
            return sum1;
        }

        // L-shaped paths (2 options)
        int corner1 = getWeight(matrix[x1][y2]); // horizontal then vertical
        int corner2 = getWeight(matrix[x2][y1]); // vertical then horizontal

        // Path 1: (x1, y1) -> (x1, y2) -> (x2, y2)
        for (int j = Math.min(y1, y2); j <= Math.max(y1, y2); j++) {
            sum1 += getWeight(matrix[x1][j]);
        }
        for (int i = Math.min(x1, x2) + 1; i <= Math.max(x1, x2); i++) {
            sum1 += getWeight(matrix[i][y2]);
        }

        // Path 2: (x1, y1) -> (x2, y1) -> (x2, y2)
        for (int i = Math.min(x1, x2); i <= Math.max(x1, x2); i++) {
            sum2 += getWeight(matrix[i][y1]);
        }
        for (int j = Math.min(y1, y2) + 1; j <= Math.max(y1, y2); j++) {
            sum2 += getWeight(matrix[x2][j]);
        }

        return Math.min(sum1-corner1, sum2-corner2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] matrix = new char[R][C];
        sc.nextLine();

        for (int i = 0; i < R; i++) {
            String[] row = sc.nextLine().split(" ");
            for (int j = 0; j < C; j++) {
                matrix[i][j] = row[j].charAt(0);
            }
        }

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int result = calculatePathSum(matrix, x1, y1, x2, y2);
        System.out.println(result);
    }
}

/*
    * The code defines a class PathExistMatrix that calculates the minimum path sum between two points in a matrix.
    * The matrix is filled with characters, and each character has a weight based on its position in the alphabet.
    * The main method reads the matrix dimensions, the matrix itself, and the coordinates of the two points.
    * It then calculates the minimum path sum using the calculatePathSum method and prints the result.
 */