class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        if(a.length>b.length)
        {
            return medianOf2(b,a);
        }
        int begin=0;
        int end=a.length;
        double median=0;
        while(begin<=end)
        {
            int mid1=(begin+end)/2;
            int mid2=(a.length+b.length+1)/2-mid1;
            int max1=(mid1==0)?Integer.MIN_VALUE:a[mid1-1];
            int min1=(mid1==a.length)?Integer.MAX_VALUE:a[mid1];
            int max2=(mid2==0)?Integer.MIN_VALUE:b[mid2-1];
            int min2=(mid2==b.length)?Integer.MAX_VALUE:b[mid2];
            if(max2<=min1 && max1<=min2)
            {
                if((a.length+b.length)%2==0)
                {
                    int max=Math.max(max1,max2);
                    int min=Math.min(min1,min2);
                    median=(max+min)/2.0;
                    
                    
                }
                
                else
                {
                    median=Math.max(max1,max2);
                    
                }
                break;
            }
            else if(max1>min2)
            {
                end =mid1-1;
            }
            else
            {
                begin=mid1+1;
            }
        }
        return median;
        
        
    }
}