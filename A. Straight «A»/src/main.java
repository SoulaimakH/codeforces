import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args)throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder out = new StringBuilder();
	        StringTokenizer tk;
	        tk = new StringTokenizer(in.readLine());
			int n = parseInt(tk.nextToken());
			double k = parseInt(tk.nextToken());
			
			int i=0;
			double somme=0;
			 tk = new StringTokenizer(in.readLine());
			 
			while(i<n) {
				somme+=parseInt(tk.nextToken());
			i++;}
		
			double div=somme/n;
			i=n;
			//double r=k-0.5;
			div=Math.round(somme/n);
			while(div<k) {
				somme+=k;
				i++;
				div=somme/i;
				div=Math.round(div);
						}
			
			i=i-n;
			System.out.println(i);

			
	}

}
