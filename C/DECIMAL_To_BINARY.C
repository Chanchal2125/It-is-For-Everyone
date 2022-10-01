#include<stdio.h>
#include<conio.h>
#define SIZE 10
int s[SIZE],i,top,ele;
void push(int x)
{
	top++;
	s[top]=x;
}
int pop()
{
	ele=s[top];
	top--;
	return ele;
}
void main()
{
	clrscr();
	printf("Enter a decimal no:");
	scanf("%d",&ele);
	top=-1;
	while(ele>0)
	{
		push(ele%2);
		ele=ele/2;
	}
	printf("\nBinary Number:");
	for(i=top;i>=0;i--)
	{
		printf("%d",pop());
	}
	getch();
}
