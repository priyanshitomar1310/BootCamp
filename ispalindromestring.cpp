#include<stdio.h>
#include<string.h>
int is_palindrome(char c[],int length,int i,int j)
{
	if(c[i]!=c[j])
	{
		return 1;
	}
	return 0;
	
}
int main()
{
	char string[100];
	int length=0;
	gets(string);
	length=strlen(string);
    if(	is_palindrome(string,length,0,length-1)==0)
    {
    	printf("Its a Palindrome");
	}
	else
	{
		printf("Its not a Palindrome");
	}
}
