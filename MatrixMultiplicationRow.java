import java.util.Scanner;

public class MatrixMultiplicationRow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Fixed variable name and syntax

    int row = sc.nextInt(), col = sc.nextInt();

    int matrix[][] = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    int k1 = sc.nextInt(), k2 = sc.nextInt();

    for (int i = 0; i < col; i++) {
      System.out.print(matrix[k1 - 1][i] * matrix[k2 - 1][col - i - 1] + " "); // Fixed multiplication operator
    }

    sc.close(); // Close the scanner
  }
}
/*
 * Example Input/Output 11

Input:

46

115332

743768

995239

816937

24

Output:

49 12 27 42 6 64

Explanation:

Here X 2 and Y = 4.

The second row of the matrix contains 743 768.

The fourth row of the matrix contains 816937.

The product of the integers in the 2nd row (left to right) and 4th row (right to left) is given below. (7*7) (4°3) (39) (7°6) (6*1) (8*8) -49 12 27 42

6 64

Example Input/Output 2:

Input:

74

10 20 30 40

83 85 46 94

14 78 84 14

56 99 25 35

12 85 27 25

50 60 70 80

54 36 55 51

61

Output:

2000 1800 1400 800
 */