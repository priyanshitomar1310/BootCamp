import java.util.*;

public class Minimum {
    public static int minDifference(int[] a,int m)
    {
         int  res=0;
         Arrays.sort(a);
        res=a[m-1]-a[0];
        for(int i=1;a.length>i+m-1;i++)
        {
             if((a[m+i-1]-a[i])<res)
             {
                  res=a[m+i-1]-a[i];
             }
            
        }
        return res;
          
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        m=sc.nextInt();
        System.out.println(minDifference(nums, m));
    }
}