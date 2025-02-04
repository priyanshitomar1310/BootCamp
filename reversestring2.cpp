#include<stdio.h>
#include<string.h>
void reverse_string(char s[],int N,int i,int j)
{
	char temp;
	if(i>=j)
	{
		return;
	}
		temp=s[i];
		s[i]=s[j];
		s[j]=temp;
		reverse_string(s,N,i+1,j-1);
}

int main()
{
	char string[100];
	int length=0;
	gets(string);
    length=strlen(string);
    printf("%d",length);
	reverse_string(string,length,0,length-1);
	printf("\n%s",string);
	
}
