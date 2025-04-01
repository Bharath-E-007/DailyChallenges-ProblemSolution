import java.util.Scanner;

public class timemismatchedchecked {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String clock[][] = new String[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                clock[i][j] = sc.next();
            }
        }

        String hours = sc.next();
        String mins = sc.next();

        int hour = check(clock, hours);
        int min = check(clock, mins);

        System.out.printf("%d:%d", hour, min%60);

        sc.close();
        System.exit(0);
    }

    public static int check(String clock[][], String m) {
        if (clock[0][1].equals(m))
            return 11;

        if (clock[0][2].equals(m))
            return 12;

        if (clock[0][3].equals(m))
            return 1;

        if (clock[4][1].equals(m))
            return 7;

        if (clock[4][2].equals(m))
            return 6;

        for (int i = 1; i < 4; i++) {
            if (clock[i][0].equals(m))
                return 11 - i;
            else if (clock[i][4].equals(m))
                return i + 1;
        }

        return 5;
    }
}
/*Import favorites

For quick access, place your favorites here on the favorites bar.

Manage favorites.now

+

Example Input/Output 1:

Input:

*8911*

3***5

6***7

4***1

2*12*10

8 10

Output:

11:25

Explanation:

The number pointed by the hour handle is 8 and the number pointed by the minute handle is 10.

In the original clock, the values of HH and MM are given below.

HH = 11

MM = 25

So 11:25 is printed as the output.

Example Input/Output 2:

Input

491

12***6

7***5

8***10

32**11

6 7

Output:

02:45 */
