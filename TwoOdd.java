import java.util.Scanner;

public class TwoOdd {
    public static void twoOdd(int[] a)
    {
        int res=0;
        int res1=0,res2=0;
        for(int i=0;i<a.length;i++)
        {
            res^=a[i];
        }
        res=res&(~(res-1));
        for(int i=0;i<a.length;i++)
        {
            if((res&a[i])==0)
            {
                res1^=a[i];
            }
            else{
                res2^=a[i];
            }
        }
        System.out.println(res1 +" "+ res2);

    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        twoOdd(nums);

    }
}