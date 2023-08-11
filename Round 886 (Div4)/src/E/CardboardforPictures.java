package E;

import java.util.Scanner;

public class CardboardforPictures {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases =scan.nextInt();
	
 
		
		while(cases>0) {
			double sum=0;
			double sumcarre=0;
			
			
			double n=scan.nextDouble();
			double c= scan.nextDouble();
			
			 for (double i = 0; i < n; i++) {
	                double nbr = scan.nextDouble();
	                sum += nbr;
	                sumcarre += Math.pow(nbr, 2);
	            }
	 
			
			 double result;
//		
			 double racine3=Math.sqrt(n);
			 result=(Math.sqrt(c-sumcarre)-(sum/racine3))/(racine3*2); // this was my first solution which gives wrong answer
			// System.out.println(result);
			 
			 sumcarre=c-sumcarre;
			 result= ((-4*sum+(Math.sqrt((16*sum*sum)+(sumcarre*(16*n)))))/(8*n)); // the good equation solution
			
			// System.out.println(result);
		
			 
			System.out.println((int) Math.round(result));
			cases--;}
 
	}
 
}