import java.util.Scanner;

public class SnakePattern {
     public static void snakeMatrix(int[][] a)
     {
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<a[0].length;j++)
               {
                     System.out.print(a[i][j]+" ");
               }
               System.out.println();

            }
            else{
                for(int j=a[0].length-1;j>=0;j--)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            
        }
     }
     public static void main(String[] args) {
        int n,m;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        m=input.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=input.nextInt();
            }
        }
        snakeMatrix(arr);
     }
}