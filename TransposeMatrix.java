import java.util.Scanner;

public class TransposeMatrix {
    public static void print(int[][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][]a)
    {
         for(int i=0;i<a.length;i++)
         {
            for(int j=i+1;j<a[0].length;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
         }
         print(a);
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
        transpose(arr);
    }
}