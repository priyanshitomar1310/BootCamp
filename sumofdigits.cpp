#include<stdio.h>
int sum_digits(int n)
{
	if(n==0||n==1)
	{
		return n;
	}
	return n%10+sum_digits(n/10);
}
int main()
{
	int num;
	scanf("%d",&num);
	printf("%d",sum_digits(num));
	
}
