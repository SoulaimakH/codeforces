import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {

	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       
        StringTokenizer tk;
        tk = new StringTokenizer(in.readLine());
		int t = parseInt(tk.nextToken());
		
		while(t-->0) {
			tk = new StringTokenizer(in.readLine());
			int n = parseInt(tk.nextToken());
			tk = new StringTokenizer(in.readLine());
			String s=tk.nextToken();
			String st="";
			int nbr0=1;
			for(int i=0;i<n;i++) {
				if(s.charAt(i)=='0')  nbr0++;
				st+='0';
			}
			st+='0';
			for(int i=nbr0;i>=0;i--) {
				//int index=st
			}
		}

	}

}
