#include<stdio.h>
int main()
{
	int n,i,j,k;
	scanf("%d",&n);
	for(i=n-1;i>=0;i--)
	{
		for(j=0;j<=i;j++)
		{
			printf(" ");
		}
		for(j=i;j<n;j++)
		{
			if(j==i || j==n-1|| i==0)
			{
				printf("* ");
			}
			else
			{
				printf("  ");
			}
		}
		printf("\n");
	}
}