import java.util.Scanner;

public class PairSum {
    public static boolean pairSum(int[] a,int t)
    {
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            if((a[i]+a[j])==t)
            {
                return true;
            }
            if((a[i]+a[j])>t)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
     public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int t;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        t=sc.nextInt();
        System.out.println(pairSum(arr, t));
     }
}