import java.util.Scanner;

public class PairsSum {
    public static void pairSum(int[] a,int t)
    {
        int i=0;
        int j=a.length-1;
        int sum=0;
        while(i<j)
        {
            sum=a[i]+a[j];
            if(sum==t)
            {
                System.out.println("(" + i +","+j+")");
                i++;
                j--;
            }
            else if(sum>t)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int n,target;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        target=sc.nextInt();
        pairSum(nums, target);
    }
}