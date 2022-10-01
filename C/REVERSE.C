#include<stdio.h>
#include<conio.h>
#define SIZE 10
char s[SIZE],top,str[20];
int i,top;
void push(char x)
{
	top++;
	s[top]=x;
}
char pop()
{
	ele=s[top];
	top--;
	return ele;
}
void main()
{
	clrscr();
	printf("Enter a string:");
	scanf("%s",&str);
	for(i=0;str[i]!='\o';i++)
	{
		push(str[i]);
	}
}