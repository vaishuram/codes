import java.util.Scanner;


public class secmin {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);

int n=sc.nextInt();
int a[]=new int[n];
int temp;
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}

for (int i = 0; i < n; i++) 
{
    for (int j = i + 1; j < n; j++) 
    {
        if (a[i] > a[j]) 
        {
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }
}
for(int i=0;i<n;i++)
{
	System.out.println(" min array" +a[i]);
}
System.out.println("second min element"+a[1]);
	}
}

