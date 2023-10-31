import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cheeseburger_Corollary1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       
        StringTokenizer tk;
        tk = new StringTokenizer(in.readLine());
		int t = parseInt(tk.nextToken());
		int i=1;
		while(i<=t) {
			tk = new StringTokenizer(in.readLine());
			int s = parseInt(tk.nextToken());
			int d = parseInt(tk.nextToken());
			int  k= parseInt(tk.nextToken());
			
			int b=2*s+d*2;
			int pc=s+2*d;
			
			
			int nbr=0;
			if (b-1>=pc)nbr=pc ; else nbr=b-1;
			
			if(nbr>=k)System.out.println("Case #"+i+": YES");
			else System.out.println("Case #"+i+": NO");
		i++;}

	}

}
