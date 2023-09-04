import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class main2 {

	public static void main(String[] args)throws IOException  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
        StringTokenizer tk;
        tk = new StringTokenizer(in.readLine());
		int n = parseInt(tk.nextToken());
	int m = parseInt(tk.nextToken());
	int k = parseInt(tk.nextToken());
	int t = parseInt(tk.nextToken());
	  TreeSet<cel> pile = new TreeSet<>();
	int j=0;

	while(j<k) {
		tk = new StringTokenizer(in.readLine());
		int c=parseInt(tk.nextToken());
		int r=parseInt(tk.nextToken());
		cel cell=new cel(c,r);
		pile.add(cell);
	j++;}

	System.out.println(pile);
	 int cnt=1;
     for(cel p : pile) 
         p.order = cnt++;
	
	j=0;
	while(j<t) {
		
		tk = new StringTokenizer(in.readLine());
		int c=parseInt(tk.nextToken());
		int r=parseInt(tk.nextToken());
		cel cell=pile.ceiling(new cel(c,r));
		
		if(cell==null) {
		   int taille=r+(m*(c-1))-k;
		   if(taille%3==0) System.out.println("Grapes");
           else if(taille%3==1) System.out.println("Carrots");
           else System.out.println("Kiwis");
		}
		else if(cell.compareTo(new cel(c,r))==0) {
			System.out.println("Waste");
		}
		else {
			int taille=r+(m*(c-1))-(cell.order-1);
			
			   if(taille%3==0) System.out.println("Grapes");
	           else if(taille%3==1) System.out.println("Carrots");
	           else System.out.println("Kiwis");
		}
		
	j++;}
	
	
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

