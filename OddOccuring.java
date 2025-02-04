import java.util.Scanner;

public class OddOccuring {
     public static int oddOccuring(int[]a)
     {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            count^=a[i];
        }
        return count;
     }
     public static void main(String[] args) {
        int n;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=Sc.nextInt();
        }
        System.out.println(oddOccuring(nums));
     }
}