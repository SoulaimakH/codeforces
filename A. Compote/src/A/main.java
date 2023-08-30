package A;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int r=0;
		if(b%(2*a)==0 && c%(4*a)==0) r=7*a;
		else if(c<4 || b<2) r=0;
		else {
			int nb=Math.min(c/4,b/2);
			nb=Math.min(a, nb);
			//System.out.println(nb);
			r=nb*7;
		}
		System.out.println(r);
	}

}
