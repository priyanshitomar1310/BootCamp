#include<stdio.h>
int power_two(int n,int P)
{
	if(P==0)
	{
		return 1;
	}
	if(P==1)
	{
		return n;
	}
    return n*power_two(n,P-1);
}
int main()
{
	int p;
	scanf("%d",&p);
	printf("%d",power_two(2,p));
}
