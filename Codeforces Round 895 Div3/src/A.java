import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       
        StringTokenizer tk;
        tk = new StringTokenizer(in.readLine());
		int n = parseInt(tk.nextToken());
		while(n-->0) {
			 tk = new StringTokenizer(in.readLine());
				int a = parseInt(tk.nextToken());
			    int b = parseInt(tk.nextToken());
			    int c = parseInt(tk.nextToken());
			    if(a!=b) {
			    	   double d=Math.abs(a-b);
					    
					    d=d/2;
					    //System.out.println(d);
					    
					    int r=1;
					    
					    while(d>c) {
					    	
					    	d-=c;
					    	r++;
					    	//System.out.println(d);
					    }
					    System.out.println(r);
			    }else System.out.println(0);
			 
			    
			    
			    
		}
       

	}

}
