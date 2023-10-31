import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class ProblemC {

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
               System.out.println(sm);

             Arrays.sort(array);
             System.out.println(Arrays.toString(array));
            int min=Integer.MAX_VALUE;
             
            if(nb>1) {
            	//case pos 0 howa eli bich itir
            	int h=nb-1;
            	int z=array[1]+array[h];
            	boolean t0=true;
            	for(int k=2;k<=nb/2;k++) {
            		h--;
            		if(z!=array[k]+array[h]) {
            			
            			t0=false;
            			break;
            		}
            	}
                 if(t0) min=Math.min(min,z-array[0]);
                 
            		// case p1 howa eli bich itir
            		 h=nb-1;
            		boolean t1=true;
            		z=array[0]+array[h];
            		for(int k=2;k<=nb/2;k++) {
                		h--;
                		if(z!=array[k]+array[h]) {
                			t1=false;
                			break;
                		}
                	}
            		
            		if(t1) min=Math.min(min,z-array[1]);
            		
            			// case p el wist howa eli bich itir
                		boolean td=true;
                		 h=nb-1;
                		z=array[0]+array[h];
                		
                		for(int k=1;k<nb/2;k++) {
                    		h--;
                    		if(z!=array[k]+array[h]) {
                    		//System.out.println(k);
                    		//System.out.println(array[k]+array[h]);
                    			td=false;
                    			break;
                    		}
                		}
                		
                		if(td) min=Math.min(min,z-array[nb/2]);
                		
            	if(!(t0||t1||td)) {
            		System.out.println(("Case #" + it + ": "+(-1)));
            	}
            	else {
            		System.out.println(("Case #" + it + ": "+min));
            	}
            	
            	
            }else {
            	System.out.println("Case #" + it + ": "+1);
            }
            
            
        }

	}

}
