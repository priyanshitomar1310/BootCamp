import java.util.Scanner;

public class MaximumOddEven {
    public static int  oddEvenArray(int[] a)
    {
        int count=0;
        for(int i=0;i<a.length-1;i++)
        {
            if((a[i]%2!=0 && a[i+1]%2==0) ||( a[i]%2==0 && a[i+1]%2!=0))
            {
                count++;
            }
        }
        return count;
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
        System.out.println(oddEvenArray(nums));
    }
}