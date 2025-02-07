import java.util.Scanner;

public class BoundaryElement {
    public static void printBoundary(int[][]a)
    {
        if(a.length==1)
        {
            for(int i=0;i<a[0].length;i++)
            {
                System.out.print(a[0][i]+" ");
            }
        }
        if(a[0].length==1)
        {
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i][0]+" ");
            }
        }
       else
       {
           for(int i=0;i<a[0].length;i++)
           {
               System.out.print(a[0][i]+" ");
           }
           for(int i=1;i<a.length;i++)
           {
              System.out.print(a[i][a[0].length-1]+" ");
           }
           for(int i=a[0].length-2;i>=0;i--)
           {
              System.out.print(a[a.length-1][i]+" ");
           }
           for(int i=a.length-2;i>=1;i--)
           {
            System.out.println(a[i][0]+" ");
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
        printBoundary(arr);
    }
}