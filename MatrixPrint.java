import java.util.Scanner;

public class MatrixPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        char alpha[][] = new char[row][col];
        int columns[] = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                alpha[i][j] = sc.next().charAt(0);
                if (alpha[i][j] == 'B') {
                    columns[j]++;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (columns[j] > 0) {
                    System.out.print("-");
                } else {
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
        sc.close();
        System.exit(0);
    }
}