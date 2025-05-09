import java.util.Scanner;

public class HorizontalOrVerticalPrintArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str[] = new String[1001];
        int i = 0;

        while (sc.hasNext()) {
            str[i++] = sc.nextLine();
        }

        if (i == 1) {
            // Split the single input line into an array
            String subArr[] = str[0].split(" ");
            int j = subArr.length - 1;

            // Print the array in reverse order
            while (j >= 0) {
                System.out.println(subArr[j--]);
            }
        } else {
            i--;

            // Print all input lines in reverse order, separated by spaces
            while (i >= 0) {
                System.out.print(str[i--] + " ");
            }
        }

        sc.close(); // Close the scanner
        System.exit(0);
    }
}

/*
    Toggle Format - List of Integers

The program must accept a list of integers as the input. The program must print the output based on the following conditions.

- If the given list of integers present horizontally, then the program must print the list of integers vertically in reverse order.

If the given list of integers present vertically, then the program must print the list of integers horizontally in reverse order.

Boundary Condition(s):

1 <= Number of integers in the list <= 1000

Input Format:

The first line contains a list of integers separated by a space. (or) The lines, each contains an integer.

Output Format:

The first line contains a list of integers separated by a space. (or) The lines, each contains an integer.

Example Input/Output 1:

Input

10 20 30 40 50

Output:

50

40

30

20

10

Explanation:

Here the given list of integers present horizontally as 10 20 30 40 50.

So the list of integers are printed vertically in reverse order.

Hence the output is

50

40

30

20

10

Example Input/Output 2:

Input:

100

200

300

400

500

600

Output:

600 500 400 300 200 100
 */