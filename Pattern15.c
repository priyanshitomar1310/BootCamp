#include<stdio.h>
int main()
{
	int n,i,j,k;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		for(j=i;j<n;j++)
		{
		   printf("*");
		}
		for(j=0;j<i;j++)
		{
			printf(" ");
		}
		for(j=0;j<i;j++)
		{
			printf(" ");
		}
		for(j=n-i;j>0;j--)
		{
			printf("*");
		}
		printf("\n");
		
	}
	for(i=n-2;i>=0;i--)
	{
		for(j=i;j<n;j++)
		{
		   printf("*");
		}
		for(j=0;j<i;j++)
		{
			printf(" ");
		}
		for(j=0;j<i;j++)
		{
			printf(" ");
		}
		for(j=n-i;j>0;j--)
		{
			printf("*");
		}
		printf("\n");
		
	}
	
}