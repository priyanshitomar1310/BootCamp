import java.util.Scanner;

public class XorLtoR {
    public static int xor(int[]a, int p)
    {
        int m=p%4;
        if(m==0)
        {
            return p;
        }
        else if(m==1)
        {
            return 1;
        }
        else if(m==2)
        {
            return p+1;
        }
        return 0;
    }
    public static int xorFromLtoR(int[]a,int l,int r)
    {
        return xor(a,l-1)^xor(a, r);
    }
    public static void main(String[] args) {
        int n,right;
        int left;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        left=sc.nextInt();
        right=sc.nextInt();
        System.out.println(xorFromLtoR(arr, left, right));

    }
}