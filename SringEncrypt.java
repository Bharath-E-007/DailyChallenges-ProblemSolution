import java.util.Scanner;

public class  SringEncrypt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array for tracking letter positions
        int[][] alpha = new int[26][2];

        // Process the input strings
        for (int i = 0; i < 25; i++) {
            String str = sc.next();
            if (str.length() >= 2) {
                // Fill the first and third character positions
                fill(str.charAt(0), alpha, (i / 5 + 1), (i % 5 + 1));
                fill(str.charAt(2), alpha, (i / 5 + 1), (i % 5 + 1));
                continue;
            }
            // Fill only the first character
            fill(str.charAt(0), alpha, (i / 5 + 1), (i % 5 + 1));
        }

       
        sc.nextLine(); // Consume the leftover newline
        String str1 = sc.nextLine();
        System.out.println(str1);
        for (char char1 : str1.toCharArray()) {
            if (char1 == ' ') {
                System.out.print(char1);
                continue;
            }
            int ind = char1 - 'a';
            System.out.printf("%d%d", alpha[ind][0], alpha[ind][1]);
        }
        sc.close();
    }
    public static void fill(char c, int[][] mat, int row, int col) {
        int ind = c - 'a';
        mat[ind][0] = row;
        mat[ind][1] = col;
    }
}
/*
 Example Input/Output 1:

Input:

abcde

fghi/pj

klmno

qrstu

vwxyz

apple juice

Output:

1124243215 2545241315

Explanation:

Here the given string is apple juice.

The alphabets in the string S and their positions in the matrix are given below.

'a' -> (1,1)

'p'-> (2,4)

'p' -> (2,4)

'T-> (3,2)

'e'-> (1,5)

j-> (2,5)

'u'-> (4,5)

T-> (2,4)

'c' -> (1,3)

'e'-> (1,5)

Hence the output is

1124243215 2545241315 
 */
