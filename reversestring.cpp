#include<stdio.h>
#include<string.h>
//void reverse_string(char s[],int N,int i,int j)
//{
//	char temp;
//	if(i>=j)
//	{
//		return;
//	}
//		temp=s[i];
//		s[i]=s[j];
//		s[j]=temp;
//		reverse_string(s,N,i+1,j-1);
//	print(s,N);
//}

int main()
{
	char string[100];
	int n,i,length=0;
	gets(string);
    length=strlen(string);
    printf("%d",length);
//	reverse_string(string,n,0,n-1);
	
}
