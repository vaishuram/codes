
import java.util.*;
class pow
{public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

if(n<=0) 
return false;
while(n>2){
int t = n>>1;
int c = t<<1;
if(n-c != 0)
return false;
n = n>>1;
}
return true;
}
