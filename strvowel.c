
#include<stdio.h>
#include<string.h>
int main(){
char str[20],s[20],str2[20];
int i,j=0;
printf("Enter any string");
scanf("%s",str2);
str=strrev(str2);
printf("The string is%s",str);
for(i=0;i<=strlen(str);i++) {  
if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u' ||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
str[i]=' ';
else 
s[j++]=str[i];
} 
s[j]='\0';
  printf("\nThe string without vowel is%s",s);
return 0;
}
}
