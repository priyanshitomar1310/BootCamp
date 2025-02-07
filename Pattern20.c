#include<stdio.h>
int main()
{
	int n,i,j,k;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		for(j=0;j<=i;j++)
		{
			printf("*");
		}
		printf("\n");
	}
	for(i=0;i<n;i++)
	{
		for(k=0;k<n;k++)
		{
			printf(" ");
		}
		for(j=0;j<=i;j++)
		{
			printf("*");
		}
		printf("\n");
	}
	for(i=0;i<n;i++)
	{
		for(k=0;k<2*n;k++)
		{
			printf(" ");
		}
		for(j=0;j<=i;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}