import java.util.*;
class numrevs{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int sum=0,n=0;
while(r>0)
{
n=r%10;
sum=(sum*10)+r;
r=r/10;
}
System.out.print(sum);
}
}
