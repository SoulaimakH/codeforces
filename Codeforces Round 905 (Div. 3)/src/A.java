import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer tk;

	        int t = Integer.parseInt(in.readLine().trim());
	        String click="1234567890";
	        
	        for (int it = 1; it <= t; it++) {
	        	int r=0;
	        	tk = new StringTokenizer(in.readLine());
	        	String x =tk.nextToken();
	        	
	        	int pos=0;
	        	for(int n=0;n<x.length();n++) {
	        		if(click.charAt(pos)==x.charAt(n))r++;
	        		else {
	        			r+=Math.abs(pos-(click.indexOf(x.charAt(n))));
	        			pos=click.indexOf(x.charAt(n));
	        			r++;
	        		}
	        		
	        	  
	        	}
	        	System.out.println(r);
	        }
	        

	}

}
