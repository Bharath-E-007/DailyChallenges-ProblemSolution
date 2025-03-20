import java.util.Scanner;

public class colorMixed {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        
        char color[][] = new char[row][col];
        
        for (int i = 0; i < row * col; i++) {
            color[i / col][i % col] = sc.next().charAt(0);
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2; j++) {
                System.out.print(colorFind(color[i][j], color[i][col - j - 1]) + " ");
            }
            System.out.println();
        }  
        sc.close();
        System.exit(0);
    }
    public static char colorFind(char color1, char color2) {
        if (color1 == color2) return color1;
        
        String mixed = "" + color1 + color2;
        
        if ("GB".equals(mixed) || "BG".equals(mixed)) return 'C';
        else if ("RB".equals(mixed) || "BR".equals(mixed)) return 'M';
        return 'Y'; 
    }
}
/*
 * The program must accept a character matrix of size R°C representing the primary colors (R, G.

B) as the input. The value of C is always even. The program must fold the given color matrix vertically and print the resulting colours based on the following conditions.

1) Red + Red = Red

2) Green + Green = Green

3) Blue + Blue = Blue

4) Green + Blue = Cyan

5) Red Blue = Magenta

6) Red + Green = Yellow

Notes

Cyan must be represented as C.

Magenta must be represented as M.

Yellow must be represented as Y.

Example Input/Output 1:

Input:

56

R G B B G B

B R B G R G

R G R R B R

R R G R G R

G R B R R G

Output:

M G B

C R C

R C R

R Y Y

G R M

Explanation:

1st row -> R+B=M, G+G=G, B+B=B.

2nd row -> B+G=C, R+R=R, B+G=C.

3rd row -> R+R=R, G+B=C, R+R=R.

4th row -> R+R=R, R+G=Y, G+R=Y.

5th row -> G+G=G, R+R=R, B+R=M.

Hence the output is

M G B

C R C

R C R

R Y Y

G R M
 */
