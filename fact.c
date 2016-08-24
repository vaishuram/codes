#include<stdio.h>
#include<conio.h>
void main()
{
int n,i,sum=1;
scanf("%d",&n);
for(i=n;i>0;i--)
{
sum=sum*i;
}
printf("factorial is%d",sum);
}
