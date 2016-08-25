import java.util.*;
class fact{
public static void main(String args[])
{Scanner s=new Scanner(System.in);
int n=sc.nextInt();
int sum=1,i;
for(i=n;i>0;i--)
{
sum=sum*i;
}
System.out.print(" "+sum);
}
}
