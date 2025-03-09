import java.util.HashMap;
import java.util.Scanner;

public class StringPrint {
    public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<>();

        for (String str1 : str) {
            int len = str1.length();
            map.put(len, map.getOrDefault(len, 0) + 1);
        }

        int k = -1, max = 0;
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (value >= key && k < value) {
                k = value;
                max = key;
            }
        }

        if (k == -1) {
            System.out.println(-1);
            System.exit(0);
        }

        int count = 0;
        for (String str1 : str) {
            if (str1.length() == max) {
                System.out.println(String.join(" ", str1.split("")));
                count++;
            }
            if (count == max) {
                break;
            }
        }
    }
}
/*Example Input/Output 1:

Input:

book planet MOON earth satellite stars rocket lava Aeroplane Fuel radar

Output:

book

MOON

lava

Fuel

Explanation:

The 4 letter words are book, MOON, lava and Fuel. These words can form a 4x4 square matrix.

The 5 letter words are earth, stars and radar. These words cannot form a square matrix.

The 6 letter words are planet and rocket. These words cannot form a square matrix.

The 9 letter words are satellite and Aeroplane. These words cannot form a square matrix.

Hence the output is

b o o k

M O O N

l a v a

F u e l

Example Input/Output 2:

Input:

an the were care one

Output:

-1

Example Input/Output 3:

Input

I like mangoes 

Output

I
*/
