import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
			List<cel> tab=new ArrayList<cel>();
			
			int i=n;
			while(n-->0){
				tk = new StringTokenizer(in.readLine());
				int a=parseInt(tk.nextToken());
				int b=parseInt(tk.nextToken());
				cel c= new cel(a,b);
				tab.add(c);
			}
			int k=Integer.MAX_VALUE;
			for(cel c:tab) {
				int nbr=(c.b)/2;
				int v=0;
				if(c.b%2==1) 
				v=(c.a+nbr);
				else v=(c.a+nbr-1); // na9iss ka3ba bach to5rij
				k=Math.min(k,v);
			}
			System.out.println(k);
			
			
			
		}

	}

}

class cel  implements Comparable<cel> {
	int a;
	int b;
	boolean visited;
	
	public cel(int a,int b) {
        this.a = a;
        this.b = b;
        
    }
	
	@Override
    public String toString() {
        return "Point("+a+","+b+""+visited+")";
    }
	
	 @Override
	    public int compareTo(cel other) {
		 return Integer.compare(this.b, other.b);
	    }
	}