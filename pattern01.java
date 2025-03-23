import java.util.Scanner;

public class pattern01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int total = row * col;
        int value = 0;

        for (int i = 1; i <=total; i++) {
            int v=value;
            for (int j =1; j <=total; j++) {
                System.out.print(v + " ");
                if (j%row == 0) {
                    v^= 1;
                }
            }
            if (i % row == 0) {
                value ^= 1;
            }
            System.out.println();
        }
        sc.close();
        System.exit(0);
    }
}
/*
 * 
2
5
0 0 1 1 0 0 1 1 0 0
0 0 1 1 0 0 1 1 0 0
1 1 0 0 1 1 0 0 1 1
1 1 0 0 1 1 0 0 1 1
0 0 1 1 0 0 1 1 0 0
0 0 1 1 0 0 1 1 0 0
1 1 0 0 1 1 0 0 1 1
1 1 0 0 1 1 0 0 1 1
0 0 1 1 0 0 1 1 0 0
0 0 1 1 0 0 1 1 0 0
 */
