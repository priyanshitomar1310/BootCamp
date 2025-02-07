import java.util.Scanner;

public class ProductExceptSelf {
    public static void print(int[] b)
    {
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
    public static void exceptSelf(int[] a)
    {
        int p=1;
        int[] a2=new int[a.length];
        a2[0]=a[0];
        for(int i=1;i<a2.length;i++)
        {
            a2[i]=a2[i-1]*a[i];
        }
        p=1;
        for(int i=a.length-1;i>0;i--)
        {
            a2[i]=a2[i-1]*p;
            p*=a[i];
        }
        a2[0]=p;
        print(a2);
    }
    public static void main(String[] args) {
        int n;
        Scanner input =new Scanner(System.in);
        n=input.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        exceptSelf(arr);

    }
}