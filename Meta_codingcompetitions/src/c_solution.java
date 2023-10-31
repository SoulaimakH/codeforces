import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class c_solution {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        
        for (int it = 1; it <= t; it++) {
        	 tk = new StringTokenizer(in.readLine());
             int n =  parseInt(tk.nextToken());
             int nb=n*2-1;
             tk = new StringTokenizer(in.readLine());
             int[] array=new int[nb];
             int jk=0;
             int sm=0;
             while(jk<nb) {
            	 
            	 array[jk]= parseInt(tk.nextToken());
            	sm+=array[jk];
            jk++; }
               //System.out.println(sm);

             Arrays.sort(array);
             
             if(nb>1) {}
             else {
            	 System.out.println("Case #" + it + ": "+1);
             }
        	
        }

	}

}
