#include<stdio.h>
int main()
{
	int n,i,j,k,count=0;
	scanf("%d",&n);
	for(i=0;i<=n;i++)
	{
		count=65;
		for(j=i;j<=n;j++)
		{
		
			printf("%c",count);
		   	count++;
		}
		for(k=0;k<2*i-1;k++)
		{
			printf(" ");
		}
		for(j=n-i;j>=0;j--)
		{
			count--;
			if(i==0 && j==n-i)
			{
				continue;
			}
		   
			printf("%c",count);
			
			
		}
		printf("\n");
		
	}
}
