import java.util.*;

public class rotateFourCornerMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        char alpha[][] = new char[num][num];

        for (int i = 0; i < num * num; i++) {
            alpha[i / num][i % num] = sc.next().charAt(0);
        }

        int r1 = 0, c1 = 0, r2 = num - 1, c2 = 0;

        for (int i = 0; i < num / 2; i++) {
            char temp = alpha[r1 + i][c1 + i];
            alpha[r1 + i][c1 + i] = alpha[r2 - i][c1 + i];
            alpha[r2 - i][c1 + i] = alpha[r2 - i][r2 - i];
            alpha[r2 - i][r2 - i] = alpha[r1 + i][r2 - i];
            alpha[r1 + i][r2 - i] = temp;
        }

        for (char[] ch : alpha) {
            for (char val : ch) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
/*
 * The code reads a square matrix of characters from the input, rotates the four corners of the matrix in a clockwise direction, and prints the modified matrix. The rotation is done by swapping the characters at the corners in a specific order. The code uses a nested loop to iterate through the corners and perform the swaps. Finally, it prints the updated matrix to the console.
 * The time complexity of this code is O(n), where n is the number of elements in the matrix, as it processes each element once. The space complexity is O(1) since it uses a constant amount of extra space for the temporary variable used in the swapping process.
 * The code is efficient for small to medium-sized matrices, but for very large matrices, it may be necessary to consider more optimized approaches or data structures to handle the rotation and printing of the matrix.
 */