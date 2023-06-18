import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 String S1 = scan.nextLine();
         String S2 = scan.nextLine();
         S1=S1.toUpperCase();
         S2=S2.toUpperCase();
         int n=S1.compareTo(S2);
         if(n==0) {
        	 System.out.print(0);
         }
         else if(n<0)
        	 System.out.print(-1);
         else {
        	 System.out.print(1);
         }
	}

}
