        class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        int x;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            x=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                 int left=j;
                 int right=arr.length-1; 
                while(left<right)
                {
                    if((arr[left]+arr[right])==(target-x))
                    {
                        return true;
                    }
                    if((arr[left]+arr[right])>(target-x))
                    {
                        right--;
                    }
                    else if((arr[left]+arr[right])<(target-x))
                    {
                        left++;
                    }
                    
                }
            }
        }
        return false;
    }
}