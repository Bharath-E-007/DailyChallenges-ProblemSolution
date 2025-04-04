import java.util.Scanner;
import java.util.TreeMap;

public class ArrangeTheStringChar {
    public static void main(String[] args) {
        // Read input and split by "-"
        String[] str = new Scanner(System.in).nextLine().split("-");

        // Initialize TreeMap to store integer keys and character values
        TreeMap<Integer, Character> map = new TreeMap<>();

        // Iterate over each substring
        for (String s : str) {
            int len = s.length();

            // Check if the first character is alphabetic
            if (Character.isAlphabetic(s.charAt(0))) {
                // Add entries to the map
                map.put(Integer.parseInt(s.substring(1)), s.charAt(0));
                map.put(Integer.parseInt(s.substring(0, len - 1)), s.charAt(len - 1));
            }
        }

        // Print characters in the order of their keys
        for (Integer key : map.keySet()) {
            System.out.print(map.get(key));
        }

        System.exit(0);
    }
}
/*
 * Example Input/Output 1:

Input:

41-9k-R6-7a-k2-3i-S1-15-8c

Output: SkillRack

Explanation:

The encrypted string is 41-9k-R6-7a-k2-31-51-15-8c.

The position of I is 4.

The position of k is 9.

The position of R is 6.

The position of a is 7.

The position of k is 2.

The position of i is 3.

The position of S is 1.

The position of I is 5.

The position of c is 8.

After decrypting the given string, the original string is formed as SkillRack.

So Skill Rack is printed as the output.

Example Input/Output 2:

Input:

6n-4t-1C-o2-d10-11y-t3-8a-05-7C-n9

Output:

CottonCandy
 */