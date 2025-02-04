import java.util.Scanner;

public class LeadersinArray {
    public static void leadersArray(int[] a)
    {
        int count=1;
        for(int i=0;i<a.length;i++)
        {
            boolean isLeader=true;
            for(int j=i;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    isLeader=false;
                }
            }
            if(isLeader)
            {
                System.out.print(a[i]+" ");
            }
        }
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
        leadersArray(nums);
    }
}