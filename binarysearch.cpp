#include<stdio.h>
int find_target(int a[],int n,int s,int mid,int t)
{
	int e=n-1;
	if(a[mid]==t)
	{
		return mid;
	}
	if(t<a[mid])
	{
		s=0;
		mid=mid-1;
		find_target(a,n,s,mid,t);
	}
	 s=mid+1;
	 mid=(s+e)/2;
	 return find_target(a,n,s,mid,t);
	 
}
int main()
{
	int n,i,arr[100],target,mid;
	scanf("%d%d",&n,&target);
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	mid=n/2;
	printf("%d",find_target(arr,n,0,mid,target));
}
