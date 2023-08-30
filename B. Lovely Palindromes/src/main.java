import java.util.Scanner;

public class main {
	  static String reverseString(String input) {
	        StringBuilder reversed = new StringBuilder(input);
	        return reversed.reverse().toString();
	    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		
		String newn=reverseString(n);
		
		System.out.println(n+newn);
		

	}

}
