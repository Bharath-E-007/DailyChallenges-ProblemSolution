import java.util.Scanner;

public class DicePatternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");
        int val = sc.nextInt();

        printThePattern(str[5] + " ", val);

        for (int i = 0; i < val; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 1) {
                    System.out.print((str[3] + " ").repeat(val));
                } else {
                    System.out.print((str[i % str.length] + " ").repeat(val));
                }
            }
            System.out.println();
        }

        printThePattern(str[4] + " ", val);

        sc.close();
        System.exit(0);
    }

    public static void printThePattern(String val, int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 1) {
                    System.out.print(val.repeat(num));
                } else {
                    System.out.print("*".repeat(num));
                }
            }
            System.out.println();
        }
    }
}
/*
input:
a b c d e f
3

output

***f f f ******
***f f f ******
***f f f ******
a a a d d d a a a a a a
b b b d d d b b b b b b
c c c d d d c c c c c c
***e e e ******
***e e e ******
***e e e ******

input:

S E A R C H
6
output:

******H H H H H H ************
******H H H H H H ************
******H H H H H H ************
******H H H H H H ************
******H H H H H H ************
******H H H H H H ************
S S S S S S R R R R R R S S S S S S S S S S S S
E E E E E E R R R R R R E E E E E E E E E E E E
A A A A A A R R R R R R A A A A A A A A A A A A
R R R R R R R R R R R R R R R R R R R R R R R R
C C C C C C R R R R R R C C C C C C C C C C C C
H H H H H H R R R R R R H H H H H H H H H H H H
******C C C C C C ************
******C C C C C C ************
******C C C C C C ************
******C C C C C C ************
******C C C C C C ************
******C C C C C C ************

*/
