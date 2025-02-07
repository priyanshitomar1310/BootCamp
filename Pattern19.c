#include<stdio.h>
int main()
{
	int n,i,j,k;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		for(k=i;k<n;k++)
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
		for(k=i;k<n;k++)
		{
			printf("  ");
		}
		for(j=i;j<n;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}