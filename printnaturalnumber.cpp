#include<stdio.h>
void print_number(int n,int i)
{
	if(i<=n)
	{
		printf("%d ",i);
		print_number(n,i+1);
	}	
}
int main()
{
	int num,i;
	scanf("%d",&num);
	print_number(num,1);
}
