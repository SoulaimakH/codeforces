import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word =scan.next();
		int lastp=0;
		int r=0;
		for(int i=0;i<word.length();i++) {
			int code =(int) word.charAt(i);
			code=code-97;
			int rt=Math.abs(code-lastp);
			if(rt>13)
				r+=26-rt;
			else r+=rt;
			
			lastp=code;
		}
		System.out.print(r);
		

	}

}
