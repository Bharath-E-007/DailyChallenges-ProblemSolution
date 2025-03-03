import java.util.*;

public class matrixunit {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in); 
int r=sc.nextInt(),c=sc.nextInt();

int mat[][]=new int[r][c];
for(int i=0;i<r;i++)

for(int j=0;j<c;j++)
 mat[i][j]=sc.nextInt();

int unit=sc.nextInt();

int row=-1,col=-1, max=0; 
for(int i=0;i<=r-3;i++)

for(int j=0;j<=c-3;j++)

if(mat[1+2][j+2]%10==unit){ 
    int sum=0;
for(int k=0;k<9;k++)

sum+=mat[i+(k/3)][j+(k%3)];

if(max<sum){

row=i;

col=j;

max=sum;

}

} 
if(max==0){

System.out.println(-1);

System.exit(0);

} for(int i=0;i<9;i++){

System.out.print(mat[row+i/3][col+i%3]+" ");

if(i!=0 && (i+1)%3==0)

System.out.println();

}

sc.close();

System.exit(0);

}

}
/*
 * Example Input/Output 1:

Input:

45

35 24 42 17 37

24 13 35 18 39

16 10 26 25 23

35 29 13 11 18

3

Output:

42 17 37

35 18 39

26 25 23

Explanation:

Here R4, C- 5 and D-3.

There are two 3*3 submatrices having 3 as the unit digit of the bottom-right corner element. The sum of the below 3°3 submatrix is 262.

42

17 37 35 18 39

26 25 23

The sum of the below 3°3 submatrix is 201.

24 13 35

16 10 26

35 29 13

The submatrix with the maximum sum is printed as the output.

Example Input/Output 2:

Input:

44

43 32 23 29

11 11 21 20

28 50 18 15

47 14 14 42

1

Output

-1
 */