import java.util.*;
public class concreteandglassbroken {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char ch[][]=new char[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ch[i][j]=sc.next().charAt(0);
            }
        }
        for(int i=0;i<c;i++){
            ch[0][i]='X';
            int j=1;
            while(j<r && ch[j][i]=='-'){
                ch[j++][i]='X';
            }
        }
        for(char[]arr:ch){
            for(char val:arr)
              System.out.print(val+" ");
            System.out.println();
        }
        sc.close();
        System.exit(0);
    }
}
/* Concrete and Glass Slabs

The program must accept a character matrix of size R*C containing "=" and "-" as the input. 
The character "=" represents a concrete slab and the character "-" represents a glass slab. 
If an iron ball falls on a glass slab, then it will break the glass and continue to fall. 
The iron ball stops falling when it falls on a concrete slab, but if the iron ball falls 
directly on a concrete slab without breaking any glass before, then the concrete slab will
 break and continue to fall till the next occurring concrete slab in that column. 
 If a slab is broken, the program must replace the corresponding character with the character 
 "x". Finally, the program must print the modified matrix representing the state of R*C slabs 
 as the output.
 
 */
