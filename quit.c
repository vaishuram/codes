#include<stdio.h>
#include<conio.h>
int main()
{ char ch;
do
{
scanf("%c",&ch);
switch(ch)
{
case a:
printf("add");
break;
case s:
printf("sub");
break;
case m:
printf("mul");
break;
case d:
printf("div");
break;
case q:
break;
}
}
while(ch != 'Q' || ch !='q');
return 0;
}
