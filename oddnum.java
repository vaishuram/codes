import java.util.Scanner;
class oddnum{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num2=sc.nextInt();
for(int i=num;i<=num2;i++)
{
if((i%2)!=0)
System.out.println(" "+i);
}
}
}
