import java.util.Scanner;

public class Frequency {
    public static void countFrequency(int[] a)
    {
        
        int count=0;
        int res=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==res)
            {
                res=a[i];
                count++;
            }
            else
            {
                System.out.println("The Frequency of " + a[i-1] +" is " + (count));
                res=a[i];
                count=1;
            }
           
            
        }
        System.out.println("The Frequency of " + a[a.length-1] +" is " + (count));
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
        countFrequency(nums);
    }
}