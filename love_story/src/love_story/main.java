package love_story;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] tab = new int[n];
		String code = "codeforces";
		int i=0;
		while(i<n) {
			 String chaine = scan.next();
			 System.out.println(chaine);
		    if (chaine.equals(code)) {
		        tab[i] = 0;
		    } else {
		        for (int c = 0; c < chaine.length(); c++) {
		            if (code.charAt(c) != chaine.charAt(c)) {
		                tab[i]++;
		            }
		        }
		    }
		    i++;
		}
		for (int j = 0; j < n; j++) {
		    System.out.println(tab[j]);
		}
 
	}

}
