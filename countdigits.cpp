#include<stdio.h>
count_digits(int n)
{
	if(n<=9)
	{
		return 1;
	}
	return 1+count_digits(n/10);
}
int main()
{
	int num;
	scanf("%d",&num);
	printf("%d",count_digits(num));
}
