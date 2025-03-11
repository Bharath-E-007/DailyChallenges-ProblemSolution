import java.util.Scanner;

public class matrixStartWithvalue {
    import java.util.";


public static void main(String[] args) {

Scanner scenew Scanner(System.in);

int row=sc.nextInt(),col=sc.nextInt(); String mat[][]=new String[row][col];

for(int i=0;i<row; i++){

for(int j=0;j<col;j++)

mat[i][j]=sc.next();

}

int k=sc.nextInt();

String d=sc.next();

int sum=0; sum=0;

for(int i=0;i<=row-k;i++){

for(int j=0;j<=col-k;j++){

if(mat[i][j].startsWith(d)){ if(check(mat,i,j,k,d)){ for(int 11-0;11<kk;11++) }

sum+=Integer.parseInt(mat[i+(i1/k)][j+i1%k]); System.out.println(sum);

System.exit(0);

}

System.out.println(-1);

System.exit(0);

} public static boolean check (String str[][], int i,int j,int k

String d) {

for(int 11-1;11<i+k;i++){ for(int ji-jj1j+k;j++)

if(str[ii][j1].startsWith(d))

return false;

}

return true;

}
}
