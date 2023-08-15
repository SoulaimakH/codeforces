import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		
	    String c=scan.next();
	    int s=0;
	    for(int i=1;i<n;i++) {
	    	if(c.charAt(i)==c.charAt(i-1))
	    		s++;
	    }
	    System.out.print(s);

	}

}
