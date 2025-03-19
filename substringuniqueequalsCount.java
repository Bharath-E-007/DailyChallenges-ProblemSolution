import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class substringuniqueequalsCount {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            int c1 = countUniqueChars(str.substring(0, i + 1));
            int c2 = countUniqueChars(str.substring(i + 1));

            if (c1 == c2) {
                count++;
            }
        }

        System.out.print(count);
    }

    public static int countUniqueChars(String s1) {
        Set<Character> s = new HashSet<>();

        for (char c : s1.toCharArray()) {
            s.add(c);
        }

        return s.size();
    }
}
/*
 * Example Input/Output 1:

Input:

acaddabac

Output:

2

Explanation:

All possible ways to split the string acaddabac are given below.

a caddabac

ac addabac

aca ddabac

acad dabac

acadd abac -> Same number of unique characters

acadda bac -> Same number of unique characters

acaddab ac

acaddaba c

Hence the output is 2.

Example Input/Output 2:

Input:
SSSSSS

Output: 5
 */
