import java.util.StringTokenizer;
import java.util.Scanner;

public class reverse {
	public static void main(String args[])
{char c,d,e,f,g,h;
String str="Welcome To Wipro",i,k,output;
StringTokenizer st=new StringTokenizer(str," ");
String s1=st.nextToken();
String s2=st.nextToken();
String s3=st.nextToken();
String rev1=new StringBuffer(s1).reverse().toString();
String rev2=new StringBuffer(s2).reverse().toString();
String rev3=new StringBuffer(s3).reverse().toString();
	c=str.charAt(0);
if(Character.isUpperCase(c))
c=Character.toUpperCase(rev1.charAt(0));
else if(Character.isLowerCase(c))
c=Character.toLowerCase(rev1.charAt(0));
d=str.charAt(8);
	if(Character.isUpperCase(d))
	d=Character.toUpperCase(rev2.charAt(0));
	else if(Character.isLowerCase(d))
d=Character.toLowerCase(rev2.charAt(0));
e=str.charAt(11);
if(Character.isUpperCase(e))
e=Character.toUpperCase(rev3.charAt(0));
else if(Character.isLowerCase(e))
e=Character.toLowerCase(rev3.charAt(0));
f=str.charAt(6);
if(Character.isUpperCase(f))
f=Character.toUpperCase(rev1.charAt(6));
else if(Character.isLowerCase(f))
f=Character.toLowerCase(rev1.charAt(6));
	g=str.charAt(9);
if(Character.isUpperCase(g))
	g=Character.toUpperCase(rev2.charAt(1));
else if(Character.isLowerCase(g))
	g=Character.toLowerCase(rev2.charAt(1));
	h=str.charAt(15);
	if(Character.isUpperCase(h))
	h=Character.toUpperCase(rev3.charAt(4));
	else if(Character.isLowerCase(h))
	h=Character.toLowerCase(rev3.charAt(4));
i=rev1.substring(1,6);
	k=rev3.substring(1,4);
	output=c+i+f+" "+d+g+" "+e+k+h;
	int n=1;
	while(n!=0){
	Scanner in=new Scanner(System.in);
	System.out.println("enter ur choice");
	int choice;
	choice=in.nextInt();
	switch(choice)
{
case 1:
System.out.println(rev1+" "+rev2+" "+rev3);
break;

case 2:
System.out.println(output);
break;
default:
System.out.println("invalid choice");
}}
	
	}

}
