public class num {
	 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int n1=sc.nextInt();
	 int n2=sc.nextInt();
	 int count=0;
	 int c;
	 c=n1-n2;
	 while(c>=0)
	 {
		 n1=c;
		 c=n1-n2;
		 count++;
	 }
	 System.out.print(count+" ");	
	 }
	
}
