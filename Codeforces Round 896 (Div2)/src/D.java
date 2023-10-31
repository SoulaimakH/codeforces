import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class D {

	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      
     StringTokenizer tk;
     tk = new StringTokenizer(in.readLine());
		int t = parseInt(tk.nextToken());
		while(t-->0) {
			boolean s=false;
			 tk = new StringTokenizer(in.readLine());
			int n = parseInt(tk.nextToken());
			int i=0;
			long [] tab=new long[n];
			long av=0;
			tk = new StringTokenizer(in.readLine());
			while(i<n) {
				tab[i]=parseInt(tk.nextToken());
				av+=tab[i];
			i++;}
			
			//System.out.println(av);
			if(av%n==0) {
				av=av/n;
				Arrays.sort(tab);
				//if(tab[0])
				int p=0;
				//int [] tb2=new int[n];
				
				//System.out.println(Arrays.toString(tab));
				for(int j=0;j<n-1;j++) {
					//int min=tab[j]+(n-1);
					
					//System.out.println("tab de i="+tab[j]);
					if(tab[j]!=av) {
						long sort=Math.abs( tab[j]-av);
						 int x = (int) Math.round(Math.log(sort) / Math.log(2)) ;
						// System.out.println("x="+Math.pow(2, x));
						if(tab[j]>av) {
//							System.out.println(tab[j]);
//							System.out.println(tab[j+1]);
//							System.out.println("****");
							 tab[j]-=Math.pow(2, x);
							 tab[j+1]+=Math.pow(2, x);
//							 System.out.println(tab[j]);
//								System.out.println(tab[j+1]);
						}else {
							tab[j]+=Math.pow(2, x);
							 tab[j+1]-=Math.pow(2, x);
							 
//							 System.out.println(tab[j]);
//								System.out.println(tab[j+1]);
						}
						
					}
					
					
					if(tab[j]>av)tab[j+1]+=tab[j]-av;
				}
				
				
				
			}else {System.out.println("No");s=true;}
			
			//System.out.println(Arrays.toString(tab));
			if(!s)
			if(tab[n-1]==av)System.out.println("YES");else System.out.println("No");
			
		}
	}

}
