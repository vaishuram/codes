import java.util.*;
class palin{  
public static void main(String args[]){  
int r,sum=0,temp,fin;    
int num1=25,num2=45,num3=51;
temp=num1+num2+num3; 
fin=temp;
while((temp)>0){    
r=temp%10;
sum=(sum*10)+r;    
temp=temp/10;    
}    
if(fin==sum)    
 System.out.println("palindrome number ");    
else    
System.out.println("not palindrome");    
}  
}  
