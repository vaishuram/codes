public class vv {
	
	   public static void main(String[] args)
	   {
	   Scanner s=new Scanner(System.in);
	   String n1=s.next();
	   String n2=s.next();
	   if(Integer.parseInt(n1)<0||Integer.parseInt(n2)<0)
	   System.out.println("number is negative");
	   else
	   System.out.println(Integer.parseInt(n1)*Integer.parseInt(n2));
	   }
	}
