import java.util.*; // Add necessary imports

public class MoveAppleandOrangein2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        char Fruits[][] = new char[row][col];

        int A = 0, O = 0; // Corrected variable initialization

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Fruits[i][j] = sc.next().charAt(0);
                if (i == row - 1) {
                    if (Fruits[i][j] == 'A') A++; // Count 'A' in the last row
                    else if (Fruits[i][j] == 'O') O++; // Count 'O' in the last row
                }
            }
        }

        int T = sc.nextInt(); // Corrected syntax for reading T
        while (T > 0) {
            int r1 = row - 1; // Last row index
            if (A >= O) {
                A = 0;
                O = 0;
                for (int i = 0; i < col; i++) {
                    if (Fruits[r1][i] == 'A') {
                        MoveOnePosition(Fruits, r1, i); // Move 'A'
                    }
                    if (Fruits[r1][i] == 'A') A++;
                    else if (Fruits[r1][i] == 'O') O++;
                }
            } else {
                A = 0;
                O = 0;
                for (int i = 0; i < col; i++) {
                    if (Fruits[r1][i] == 'O') {
                        MoveOnePosition(Fruits, r1, i); // Move 'O'
                    }
                    if (Fruits[r1][i] == 'A') A++;
                    else if (Fruits[r1][i] == 'O') O++;
                }
            }
            T--; // Decrement T
        }

        for (char[] arr : Fruits) {
            System.out.println(Arrays.toString(arr)); // Print the matrix
        }
    }

    public static void MoveOnePosition(char[][] arr, int i, int j) {
        while (i > 0) { // Move the element up until the top row
            arr[i][j] = arr[--i][j];
        }
        arr[i][j] = '*'; // Replace the topmost position with '.'
    }
}