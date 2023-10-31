import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        for (int it = 1; it <= t; it++) {
        	tk = new StringTokenizer(in.readLine());
            int n =  parseInt(tk.nextToken());
            int m =  parseInt(tk.nextToken());
            tk = new StringTokenizer(in.readLine());
            String x=tk.nextToken();
            tk = new StringTokenizer(in.readLine());
            String s=tk.nextToken();
            if(n>=m) {
            	if(x.contains(s))System.out.println(0);
            	else {
            		x+=x;
            		if(x.contains(s))System.out.println(1);
            		else System.out.println(-1);
            	}
            }
            else {
            	int r=0;
            	while(n<2*m && !x.contains(s)) {
            		x+=x;
            		n+=n;
            		
            	r++;}
            	
            	if(x.contains(s))System.out.println(r);
            	else System.out.println(-1);
            	
            }
            
        }

	}

}
