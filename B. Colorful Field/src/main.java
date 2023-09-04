import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;



public class main {

	static boolean containsPoint(List<point> d,point p0) {
		boolean r=false;
	    for (point p : d) {
	        if (p.a == p0.a && p.b == p0.b) {
	        	//p.s=re;
	           r=true; // Found a matching point
	        }
	    }
	    return r; // No matching point found
	}
	
	
	public static void main(String[] args)throws IOException {
	
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder out = new StringBuilder();
	        StringTokenizer tk;
	        tk = new StringTokenizer(in.readLine());
			int n = parseInt(tk.nextToken());
		int m = parseInt(tk.nextToken());
		int k = parseInt(tk.nextToken());
		int t = parseInt(tk.nextToken());
		List<point> d = new ArrayList<>();

	
		Set<point> pile = new HashSet<>();
		//int[][] matrice=new int[(n+1)][(m+1)];
		//String[][] matriceS=new String[(n+1)][(m+1)];
		List<point> matriceS = new ArrayList<>();
		
		int i=1;
		int j=1;
		int e=t+k+1;
		//System.out.println(e);
		while(i<e) {
			tk = new StringTokenizer(in.readLine());
			int c=parseInt(tk.nextToken());
			int r=parseInt(tk.nextToken());
		//	stack.add(new point(c,r,""));
			point p;
			if(i>k) {
			p=new point(c,r,"");
					d.add(p);
			
				
			}
			else {
				p=new point(c,r,"Waste");
				matriceS.add(p);
				
				
			}
			pile.add(p);
			
		i++;}

		 List<point> stack = new ArrayList<>(pile);
		// Collections.sort(d);
		
		 Collections.sort(stack);
		 //System.out.println(stack);
		 //System.out.println(matriceS);
		// System.out.println(stack.size());
		
		 
		 
		 int c=0;
		 int ki=0;
		 int g=0;
		 int taille=0;
		 int w=0;
		 for(point p :stack){
			 
			 if(matriceS.contains(p)) {
				w++;
				 p.s="Waste";
			 }else {
				 taille=p.b+(m*(p.a-1));
				 taille-=w;
				 //System.out.println(p+" taille "+taille);
				 if(taille%3==1 || taille<0 || taille==1)
					p.s="Carrots";
				 else if(taille%3==2 || taille==2) p.s="Kiwis";
				 else  p.s="Grapes";
					 //w=0;
			 }
			// System.out.println(p+" "+p.s);
			 
			
		 }
		 
		 //System.out.println("//");
		 for(point p :d) {
			 int index=stack.indexOf(p);
			 //if(index>=0)
			 System.out.println(stack.get(index).s);
		 }
		 
		 
		 
		 
//		 String re="Grapes";
//		 
//		 for (point p : d) {
//			 if(containsPoint(matriceS,p))
//				 System.out.println("Waste");
//			 else {
//				 
//				 if(re.equals("Grapes")) {
//						
//						
//						re="Carrots";
//					}
//					else if(re.equals("Carrots")) {
//						re="Kiwis";
//					}
//					else if(re.equals("Kiwis")) {
//				
//						re="Grapes";
//					}
//				 System.out.println(re);
//			 }
//			
//			 
//			
//		 }
	           
		 
	    
			
	}
	
}

class point  implements Comparable<point> {
	int a;
	int b;
	String s;
	public point(int a,int b,String s) {
        this.a = a;
        this.b = b;
        this.s=s;
       
    }
	
	   @Override
	    public int compareTo(point other) {
	        if (this.a != other.a) {
	            return Integer.compare(this.a, other.a);
	        } else {
	            return Integer.compare(this.b, other.b);
	        }
	    }
	   
	   @Override
	    public String toString() {
	        return "Point("+a+","+b+")";
	    }
	   @Override
	    public int hashCode() {
	        return Objects.hash(a, b);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this.toString() == obj.toString()) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        point point = (point) obj;
	        return (a == point.a && b==point.b) ;
	    }
	
}
