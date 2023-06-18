

import java.util.Arrays;
import java.util.Scanner;

public class Gravity_flip {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
          int c = scan.nextInt();
          int[] tab=new int[c];
           scan.nextLine();
           
           for(int i=0;i<c;i++) {
        	   int a = scan.nextInt();
        	 tab[i]=a;
           }
           Arrays.sort(tab);
           for (int number: tab) {
        	      System.out.print(number+" ");
        	    }
	}
}

