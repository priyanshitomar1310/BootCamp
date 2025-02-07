#include<stdio.h>
int main()
{
	int n,i,j,k,count=0;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		count=65;
		for(k=i;k<n;k++)
		{
			printf(" ");
		}
		for(j=0;j<=i;j++)
		{
			printf("%c",count);
			count++;
		}
		count--;
		for(j=i;j>=1;j--)
		{
				count--;
			printf("%c",count);
		}
		printf("\n");
	}
}