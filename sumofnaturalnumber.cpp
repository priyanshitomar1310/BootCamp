#include<stdio.h>
int sum_natural(int num)
{
	if(num==1)
	{
		return 1;
	}
	return num+sum_natural(num-1);
}
int main()
{
   int n;
   scanf("%d",&n);
   printf("%d",sum_natural(n));	
}
