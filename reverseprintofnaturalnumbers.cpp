#include<stdio.h>
void print_reverse_number(int n)
{
	if(n>0)
	{
		printf("%d ",n);
	}
	print_reverse_number(n-1);
}
int main()
{
	int num;
	scanf("%d",&num);
	print_reverse_number(num);
}
