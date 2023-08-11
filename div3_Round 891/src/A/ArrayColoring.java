package A;

import java.util.Scanner;

public class ArrayColoring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
       
        while (cases > 0) {
        	
        	int n = scan.nextInt();
        	int i =0;
        //	int[] tab = new int[n];
        	 int pair=0;
             int imp=0;
             
        	while(i<n) {
        		int e =scan.nextInt();
        		//tab[i]= e;
        		
        		if(e%2==0)pair++; else imp++;
        	i++;}
        	  if(imp%2>0)  System.out.println("NO"); else  System.out.println("YES");
        	cases --;}
	}

}
