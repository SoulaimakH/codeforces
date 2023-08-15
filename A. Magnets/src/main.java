import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		char lastc = '2';
		int g=1;
		int i=0;
		while(i<n) {
			String st=scan.next();
			
			if(st.charAt(0)==lastc)
				g++;
			
			lastc=st.charAt(1);
		i++;}
		System.out.print(g);

	}

}
