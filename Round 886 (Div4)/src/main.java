import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases =scan.nextInt();
		//int[] numbers=new int[3];
		int n1=0;
		int n2=0;
		int n3=0;
		while(cases>0) {
			
			n1=scan.nextInt();
			n2=scan.nextInt();
			n3=scan.nextInt();
			
			if(n1+n2>=10) {
				System.out.println("YES");
			}
			else if(n1+n3>=10) System.out.println("YES");
			else if(n3+n2>=10) System.out.println("YES");
			else System.out.println("NO");
			
			cases--;}
		
		

	}

}
