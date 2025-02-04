import java.util.Scanner;

public class CommonOfThree {
    public static void commonOfThree(int[] a,int[] b,int[] c)
    {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j] && a[i]==c[k])
            {
                System.out.print(a[i] +" ");
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j] && a[i]<c[k])
            {
                i++;
            }
            else if(b[j]<c[k])
            {
                j++;
            }
            else
            {
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int n,m,s;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        m=sc.nextInt();
        int[] arr=new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
        s=sc.nextInt();
        int [] array=new int[s];
        for(int i=0;i<s;i++)
        {
           array[i]=sc.nextInt();
        }
        commonOfThree(nums, arr, array);
    }
}