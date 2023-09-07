import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class main {

	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       
        StringTokenizer tk;
        tk = new StringTokenizer(in.readLine());
		int n = parseInt(tk.nextToken());
	    int m = parseInt(tk.nextToken());
	    int x = parseInt(tk.nextToken());
        //char[]  = new char[n+m];
        
        ArrayList<Character> tab = new ArrayList<>(); // Character note syntax
        
        TreeSet<cel> pile = new TreeSet<>();
        
        int i=0;
	    while(i<n) {
	    	tk = new StringTokenizer(in.readLine());
	    	String ch=tk.nextToken();
	    	for(int j=0;j<m;j++)
	    	{
	    		tab.add(ch.charAt(j));
	    		if(ch.charAt(j)=='S')
	    			pile.add(new cel(i,j));
	    	}
	    			i++;}
	    
	    System.out.println(pile);
		 int cnt=1;
	     for(cel p : pile) 
	         p.order = cnt++;
	     
	     System.out.println(pile);
	     
	    tk = new StringTokenizer(in.readLine());
	    int q = parseInt(tk.nextToken());
	    
	    tk = new StringTokenizer(in.readLine());
	    String t = tk.nextToken();
	    
	    int r=0;
	    
	    for(int k=0;k<q;k++) {
	    	char c=t.charAt(k);
	    	if(Character.isLowerCase(c)) {
	    		if(!tab.contains(t));
	    		r--;break;
	    	}
	    	else {
	    		
	    		if(!tab.contains(Character.toLowerCase(c)));
	    		r--;break;
	    		else {
	    			
	    		}
	    	}
	    }
	}

}
class cel  implements Comparable<cel> {
	int a;
	int b;
	int order;
	
	public cel(int a,int b) {
        this.a = a;
        this.b = b;
     
       
    }
	 @Override
	    public String toString() {
	        return "Point("+a+","+b+")";
	    }
	   @Override
	    public int compareTo(cel other) {
	        if (this.a != other.a) {
	            return Integer.compare(this.a, other.a);
	        } else {
	            return Integer.compare(this.b, other.b);
	        }
	    }
	   
	   
}


