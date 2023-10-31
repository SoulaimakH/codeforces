import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class B {
	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        
        int t = Integer.parseInt(in.readLine().trim());
        for (int it = 1; it <= t; it++) {
        	
        	tk = new StringTokenizer(in.readLine());
	            int e =  parseInt(tk.nextToken());
	            int p =  parseInt(tk.nextToken());
	            
            tk = new StringTokenizer(in.readLine());
	            point[]  array=new point[e];
	            int i=0;
	            
	            while(i<e) {
	            	int a=parseInt(tk.nextToken());
	            	point pt=new point(a,0);
	            	array[i]=pt;
	            i++;}
            
            tk = new StringTokenizer(in.readLine());
	             i=0;
	            while(i<e) {
	            	array[i].b=parseInt(tk.nextToken());
	            i++;}
	            Arrays.sort(array);
	            
	           int cost=0;
	           int tr=0;
	            	for(point pt : array) {
	            		if(pt.b>p ||tr==e-1)break;
	            		if(pt.a<(e-tr-1)) {
	            			cost+=pt.a*pt.b;
	            			tr+=pt.a;
	            		}
	            		else {
	            			cost+=pt.b*(e-tr-1);
	            			tr=e-1;break;
	            		}
	            		
	            	}
	            
            ///System.out.println(Arrays.toString(array));
            cost+=p*(e-tr);
            System.out.println(cost);
            
            
        	
        }
        }

}
class point  implements Comparable<point> {
	int a;
	int b;
	
	public point(int a,int b) {
        this.a = a;
        this.b = b;
      
       
    }
	   @Override
	    public int compareTo(point other) {
		   int r= Integer.compare(this.b, other.b);
		   if(r==0)r= Integer.compare(this.a, other.a);
		   return r;
	    }
	   
	   @Override
	    public String toString() {
	        return "Point("+a+","+b+")";
	    }
	   
	
}


