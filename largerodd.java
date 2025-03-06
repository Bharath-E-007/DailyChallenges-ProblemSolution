import java.util.*;

public class largerodd {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(str.charAt(i)) % 2 == 1) {
                System.out.println(str.substring(0, i + 1));
                System.exit(0);
            }
        }
        System.out.println(0);
    }
}
/*The program must accept a string $ and print the largest odd number & present in S. if there is no odd number in S, the program must print 0 as the output.

Boundary Condition(s): 1 Length of $ <= 100

Input Format: The first line contains S.

Output Format:

The first line contains L or 0 as per the given condition.

Example Input/Output 1:

Input:

123456

Output:

12345

Explanation:

Here S 123456, the odd integers present in the string 123456 are given below

1

123

12345

23

3

2345

345

45

5

The largest odd integer in the string is 12345. So 12345 is printed as the output */
