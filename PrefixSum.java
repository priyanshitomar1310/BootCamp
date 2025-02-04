import java.util.Scanner;

public class PrefixSum {
    public static void print(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
    }
    public static void prefixSum(int[] a)
    {
        int[] prefix=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            prefix[i]=prefix[i-1]+a[i];
        }
        print(prefix);
    }
  
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=input.nextInt();
        }
        prefixSum(nums);
    }
}