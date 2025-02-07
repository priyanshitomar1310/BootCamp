#include<stdio.h>
int main()
{
	int n,i,j;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		for(j=0;j<=i;j++)
		{
			printf(" ");
		}
		for(j=i;j<n;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}#include<stdio.h>
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
}