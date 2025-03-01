import java.util.*;
public class commonHCF {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int r1=sc.nextInt(),c1=sc.nextInt();
      int mat1[][]=new int[r1] [c1];
      for(int i=0;i<r1*c1;i++)
         mat1[i/c1][i%c1]=sc.nextInt();
      int r2=sc.nextInt(),c2=sc.nextInt();
      int mat2[][]=new int[r2][c2];
      for(int i=0;i<r2*c2;i++)
         mat2[i/c2][i%c2]=sc.nextInt();
      int r3=Math.min(r1,r2),c3=Math.min(c1,c2);
      for(int i=0;i<r3*c3;i++){
        System.out.print(HCF(mat1[i/c3][i%c3],mat2[i/c3][i%c3])+" ");
      if(i%c3==0)
        System.out.println();
     }
    sc.close();
   System.exit(0);
}
public static int HCF(int num1, int num2){
    if(num2==0)
      return num1; 
   return HCF (num2, num1%num2); 
    }
}
/* get The Two Matrix As Input Return The Common Part And Return HCF Of Two Number */
