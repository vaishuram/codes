import java.util.Scanner;
class leap{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num%4==0)
System.out.println("leap year");
else
System.out.println("not leap year");
}
