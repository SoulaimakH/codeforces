import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name =scan.next();
		int nbr=0;
		
		for(int i=0 ; i<name.length();i++) {
			char c= name.charAt(i);
			if(i==name.lastIndexOf(c) && i==name.indexOf(c) || i==name.indexOf(c) )
				nbr++;
			//else if(i==name.indexOf(c))
			
		}
		if(nbr%2==0) {
			System.out.print("CHAT WITH HER!");
		}
		else {
			System.out.print("IGNORE HIM!");
		}

	}

}
