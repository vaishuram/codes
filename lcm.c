#include<stdio.h>
#include<conio.h>

void lcm(int,int);

void main()
{
int a,b;
clrscr();
printf("Enter two numbers: ");
scanf("%d %d",&a,&b);
lcm(a,b);
getch();
}

void lcm(int a,int b)
{
int m,n;
m=a;
n=b;
while(m!=n)
{
if(m < n)
	{
	m=m+a;
	}
	else
	{
	    n=n+b;
	 }    }
printf("\nL.C.M of %d and %d is: %d",a,b,m);
}
