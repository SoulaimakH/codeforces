package B;

import java.util.Scanner;

public class MaximumRounding {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
       
        while (cases > 0) {
        	String x=  scan.next();
        	//StringBuilder stringBuilder = new StringBuilder(x);
        	x='0'+x;
        	int l = x.length()-1;
        	
        	long max=Long.parseLong(x);
        	long xl=max;
        	//System.out.println(l);
        	int i=l;
        	while(i>0) {
        		int dj=0;
        		//if(i>0)
        		dj=x.charAt(i-1)- '0';
        		int dji=x.charAt(i)- '0';
        		//System.out.println(dj);
        		if(dj>=5) {
        			
        			if(dji==9) {
        				int j=i-1;
        				for(j=i-1;j>=0;j--) {
            				int djkp=x.charAt(j)-'0';
            				if(djkp<9) {
            					xl=(long) (xl+Math.pow(10,l-j));
            					i=j;
            				}
            				
            				
        			}
            		}
        			else {
        				xl=(long) (xl+Math.pow(10,l-i));
        				//System.out.println("else "+xl);
            			max=Math.max(max,xl);
            			
        			}
        			
        		}
        		
     
				xl=(long) (xl/Math.pow(10,l-i));
				xl=(long) (xl*Math.pow(10,l-i));
				
				
        		max=Math.max(max,xl);
        		x=xl+"";
        			
        			
        	i--;}
        	System.out.println(max);
        	cases--;}

	}

}
