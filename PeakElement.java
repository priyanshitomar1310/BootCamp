import java.util.Scanner;

public class PeakElement {
    public static int peakElement(int[] a)
    {
        int i=0;
        int e=a.length-1;
        int mid=(i+e)/2;
        if(a.length==0)
        {
            return 0;
        }
        if(a.length==1)
        {
            return a[0];
        }
        if(a[mid]==a.length-1 && a[a.length-1] >a[a.length-2])
        {
            return a[a.length-1];
        }
        while(i<=e)
        {
            
            if((mid==0||a[mid-1]<a[mid])&&(mid==a.length-1 || a[mid]>a[mid+1]))
            {
                return a[mid];
            }
            if(a[mid]>a[mid+1]&& mid>=0)
            {
                i=mid-1;
            }
            else if(a[mid]<a[mid+1] && mid<a.length)
            {
                e=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println(peakElement(arr));
    }
}