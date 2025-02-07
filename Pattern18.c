#include<stdio.h>
int main()
{
	int n,i,j,k;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		for(k=0;k<i;k++)
		{
			printf("  ");
		}
		for(j=i;j<n;j++)
		{
			printf("*");
		}
		printf("\n");
	}
	for(i=n-2;i>=0;i--)
	{
		for(k=0;k<i;k++)
		{
			printf("  ");
		}
		for(j=i;j<=n-1;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}