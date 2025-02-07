#include<stdio.h>
int main()
{
	int n,i,j,k;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		for(k=i;k<n;k++)
		{
			printf(" ");
		}
		for(j=0;j<2*i+1;j++)
		{
			if(j%2==0)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	}
	for(i=n-1;i>=0;i--)
	{
		for(k=i;k<n;k++)
		{
			printf(" ");
		}
		for(j=0;j<2*i+1;j++)
		{
			if(j%2==0)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	}
}