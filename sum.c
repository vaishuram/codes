#include<stdio.h>
#include<conio.h>
void main()
{
int num=0,num1=0;
for(int i=1;i<=15;i++)
{
num=num+i;
}
printf("%d",num);
for(int j=15;j<45;j++)
{
if(j%2!=0)
{
num1=num1+j;
}
}
printf("%d",num1);
}
