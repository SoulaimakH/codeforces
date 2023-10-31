import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ProblemA2 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        for (int i = 1; i <= t; i++) {
            tk = new StringTokenizer(in.readLine());
            long a =  Long.parseLong(tk.nextToken());
            long b =  Long.parseLong(tk.nextToken());
			long c=  Long.parseLong(tk.nextToken());
			long nbr=0;
			if(a*2<b) {
				nbr=c/a;
			}else {
				if(c>=b){
					
					nbr+=(c/b)*2;
					c=c-(c/b)*b;
					
					if(c<a)nbr--;
					
					
				}
				nbr+=c/a;
			}
				
				
			
            System.out.println("Case #" + i + ": " + nbr);
        }
    }
}
