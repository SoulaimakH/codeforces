import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        for (int it = 1; it <= t; it++) {
        	
        	tk = new StringTokenizer(in.readLine());
            int e =  parseInt(tk.nextToken());
            
            
           // int[]  array=new int[e];
            int jk=1;
           int somme=0;
           tk = new StringTokenizer(in.readLine());
            while(jk<e) {
           	 
            	somme+=parseInt(tk.nextToken());
            	//array[jk]=parseInt(tk.nextToken());
           	
           jk++; }
            
            
           System.out.println(0-somme);
            
        }

	}
}
