import java.util.*;

public class MissingNumber {
    public static int missing(int[] a)
    {
        Arrays.sort(a);
        int res=0;
        for(int i=1;i<=a.length;i++)
        {
            if(a[i]!=i)
            {
                res=i;
                break;
            }
        }
        return res;
    }
     public static void main(String[] args) {
        int n;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=Sc.nextInt();
        }
        System.out.println(missing(arr));
     }
}