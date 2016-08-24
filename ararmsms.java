 class arms{  
public static void main(String[] args)  {  
int sum=0,a,temp;  
int n=153;
temp=n;  
while(n>0)  
{  
a=n%10;  
n=n/10;  
sum=sum+(a*a*a);  
}  
if(temp==sum)  
System.out.println("armstrong number");   
else  
System.out.println("Not armstrong number");   
}  
}  
