import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class B2 {
	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        
        int t = Integer.parseInt(in.readLine().trim());
        for (int it = 1; it <= t; it++) {
        	
        	tk = new StringTokenizer(in.readLine());
	            int e =  parseInt(tk.nextToken());
	            int p =  parseInt(tk.nextToken());
	            
            tk = new StringTokenizer(in.readLine());
	            pointa[]  arraya=new pointa[e];
	            int i=0;
	            
	            while(i<e) {
	            	int a=parseInt(tk.nextToken());
	            	pointa pt=new pointa(a,0,i);
	            	arraya[i]=pt;
	            i++;}
            
            tk = new StringTokenizer(in.readLine());
            point[]  array=new point[e];
	             i=0;
	            while(i<e) {
	            	int b=parseInt(tk.nextToken());
	            	point pt=new point(b,arraya[i].a,i);
	            	array[i]=pt;
	            	
	            	arraya[i].b=array[i].b;
	            i++;}
	            Arrays.sort(array);
	            Arrays.sort(arraya);
	           
	           int cost=0;
	           
	            	for(pointa pt : arraya) {
	            		
	            		if(pt.b>=p) {
	            			if()
	            		}
	            		
	            		
	            	}
	            
            System.out.println(Arrays.toString(array));
            
            System.out.println(cost);
            
            
        	
        }
        }

}
class point  implements Comparable<point> {
	int a;
	int b;
	int i;
	
	public point(int a,int b,int i) {
        this.a = a;
        this.b = b;
      this.i=i;
       
    }
	   @Override
	    public int compareTo(point other) {
		   return Integer.compare(this.b, other.b);
	    }
	   
	   @Override
	    public String toString() {
	        return "Point("+a+","+b+")";
	    }
	   
	
}

class pointa  implements Comparable<point> {
	int a;
	int b;
	int i;
	public pointa(int a,int b,int i) {
        this.a = a;
        this.b = b;
      this.i=i;
       
    }
	   @Override
	    public int compareTo(point other) {
		   int r= Integer.compare(this.a, other.a);
		   if(r==0) {
			   r= Integer.compare(this.b, other.b);
		   }
		   return r;
	    }
	   
	   @Override
	    public String toString() {
	        return "Point("+a+","+b+")";
	    }
	   
	
}


