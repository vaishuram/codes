import java.util.Scanner;
class swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(a>b)
{
a=a+b;
b=a-b;
a=a-b;
}
system.out.print(""+a);
System.out.print(""+b);
else{
b=b+a;
a=b-a;
b=b-a;
}
system.out.print(""+a);
System.out.print(""+b);
}}
