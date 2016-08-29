#include<stdio.h>
#include<conio.h>

void main()
{
char s[100];
int i,u[26]={0},total=0;
clrscr();
printf("\n Enter the String:\n");
gets(s);
for(i=0;s[i]!='\0';i++)
{   if('a'<=s[i] && s[i]<='z')
  {
  total+=!u[s[i]-'a'];
  u[s[i]-'a']=1;
  }
 else if('A'<=s[i] && s[i]<='Z')
  {
  total+=!u[s[i]-'A'];
  u[s[i]-'A']=1;
  }
 }
  
 if(total==26)
  {
  printf("\n The Entered String is a Pangram String.");
 }
 else
  {
 printf("\n The Entered String is not a Pangram String.");
  }
   getch();
}
