import java.util.Scanner;

public class EquilibriumSum {
    

    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int[] prefixSum=new int[arr.length];
        int count=0;
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefixSum[i]=arr[i]+arr[count];
            count++;
        } 
        for(int i=1;i<arr.length-1;i++)
        {
             if(prefixSum[i-1]==prefixSum[i+1])
             {
                  return i;
             }
        }
        
       
        return -1;
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
    }
}