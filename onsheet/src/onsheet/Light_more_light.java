package onsheet;

import java.util.Scanner;

 class Light_more_light {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i=0;
		int  ser=-1;
		String result;
		
		while(ser!=0) {
	        ser=scan.nextInt();
			if(ser!=0) {
				double sq=Math.sqrt(ser);	
				 result = (sq*sq ==ser) ? "yes" : "no";
				
				
				
				System.out.println(result);
			}
			
		}
	
			
		

	}

}
