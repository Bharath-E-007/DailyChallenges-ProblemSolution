import java.util.Scanner;

public class ExamSeatArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int num = sc.nextInt();

        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 1;
        int r1 = 0, c1 = 0;
        boolean in = true;
        int count = 0;
        int k = 0;

        int mat[][] = new int[row][col];

        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = start;
                if (count == arr[k]) {
                    start++;
                    count = 0;
                    k++;
                }
                count++;
            }
        }

        for (int[] m1 : mat) {
            for (int val : m1) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
        System.exit(0);
    }
}
/*
 * Example Input/Output 12

Input:

5 4 3

5 8 7

Output:

3 3 3 3

2 3 3 3

2 2 2 2

1 2 2 2

1 1 1 1

Explanation:

Here N 3, and the number of students in the 3 groups are 5, 8 and 7.

In the 1st row of the classroom, 4 students from the group 1 are seated.

In the 2at row of the classroom, 1 student from the group 1 and 3 students from the group 2 are seated.

In the 3rd row of the classroom, 4 students from the group 2 are seated.

In the 4th row of the classroom, 1 student from the group 2 and 3 students from the group 3 are seated.

In the 5th row of the classroom, 4 students from the group 3 are seated.

Hence the output is

3 3 3 3

2 3 3 3 

2 2 2 2

1 2 2 2

1 1 1 1

Example Input/Output 2:

Input:

6 7 6

12 7 4 8 5 6

Output:

5 6 6 6 6 6 6

4 4 4 5 5 5 5

3 3 4 4 4 4 4

2 2 2 2 2 3 3

1 1 1 1 1 2 2

1 1 1 1 1 1 1
 */
