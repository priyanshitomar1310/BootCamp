#include<stdio.h>
int main()
{
	int n,i,j,count=0;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		count=65;
		for(j=0;j<=i;j++)
		{
			printf("%c",count);
			count++;
		}
		printf("\n");
	}
}