import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B {

	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        for (int it = 1; it <= t; it++) {
        	long [] tab=new long[3];
        	tk = new StringTokenizer(in.readLine());
            for(int i=0;i<3;i++)
            	tab[i]=  Long.parseLong(tk.nextToken());
            Arrays.sort(tab);
            
            int r=0;
            if(tab[1]%tab[0]==0) {
            	r+=tab[1]/tab[0]-1;
            	if(tab[2]%tab[0]==0) {
            		r+=tab[2]/tab[0]-1;
            		 if(r<=3) System.out.println("YES");
            		 else System.out.println("NO");
            	}
            	else
                {
                	System.out.println("NO");
                }
            }
            else
            {
            	System.out.println("NO");
            }
            
            
           
        }

	}

}
