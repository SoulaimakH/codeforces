import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ProblemA {

	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        for (int it = 1; it <= t; it++) {
        	
            tk = new StringTokenizer(in.readLine());
            int e =  parseInt(tk.nextToken());
            
            tk = new StringTokenizer(in.readLine());
            List<Double> array=new ArrayList<Double>();
            int jk=0;
           
            while(jk<e) {
           	 
           	 array.add(Double.parseDouble(tk.nextToken()));
           	
           jk++; }
            Collections.sort(array);
            //Arrays.sort(array);
            if(e>4) {
            	int nbr=e-2;
            	int i=e-2;
            	
            	double d=(array.get(e-1)-array.get(e-2))/2;
//            	System.out.println((array[e-1]-array[i]));
//            	System.out.println(d);
            	double dist=array.get(i)+d;
                
//            	System.out.println(Arrays.toString(array));
//            	System.out.println("i="+i);
//            	System.out.println("d1="+dist);
            	
            	//System.out.println(i);
            	Double dist2=(array.get(0)+array.get(2))/2;
            	
            	if(i>3) {
            		dist2=(array.get(0)+array.get(1))/2;
            	}
                
            	
            	//System.out.println("d2="+dist2);
            	System.out.println("Case #" + it + ": "+(dist-dist2));
            	
            }
            else {
            	System.out.println("Case #" + it + ": "+( ((array.get(e-1)+array.get(e-2))/2)-((array.get(0)+array.get(1))/2)) );
            }
            
        }

	}

}
