import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String chaine1 =scan.next().toLowerCase();
		String chaine2 =scan.next().toLowerCase();
		int c= chaine1.compareTo(chaine2);
		if(c>0) c=1; else if(c<0) c=-1;
			System.out.println(c);
	}

}
