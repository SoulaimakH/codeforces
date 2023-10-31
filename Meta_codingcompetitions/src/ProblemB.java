import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemB {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        for (int i = 1; i <= t; i++) {
            tk = new StringTokenizer(in.readLine());
            int r =  parseInt(tk.nextToken());
            int c =  parseInt(tk.nextToken());
			int a=  parseInt(tk.nextToken());
			int b=  parseInt(tk.nextToken());
			
			
			
			if(r>c) {
				System.out.println("Case #" + i + ": YES");
				
			}
			else{
				
				System.out.println("Case #" + i + ": NO");
			}
			
			

	}
        }

}
