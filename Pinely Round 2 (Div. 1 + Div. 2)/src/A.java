import java.util.Scanner;
 
public class A {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		//boolean an=false;
		
		while(cases>0) {
			int n =scan.nextInt();
			int a =scan.nextInt();
			int q =scan.nextInt();
			String notif=scan.next();
			boolean an=false;
//		
			int p=0;
			int c=0;
			if(a==n)System.out.println("YES");
			else if(q<n-a)System.out.println("NO");
			else {
			for(int i=0;i<q;i++) {
				if(notif.charAt(i)=='+')
				{
					p++;
					c++;
					if((p+a)>=n)an=true;
				}
				else {
					p--;
				}
				}
			if(c+a>=n) {
				if(an)System.out.println("YES");
				else System.out.println("MAYBE");
			}
			else System.out.println("NO");
				//System.out.println(a+","+p+","+m+","+(a+p-m));
			}
			
			cases--;}
	}
	
	
 
 
}