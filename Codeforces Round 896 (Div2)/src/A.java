import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       
        StringTokenizer tk;
        tk = new StringTokenizer(in.readLine());
		int t = parseInt(tk.nextToken());
		
		while(t-->0) {
			 tk = new StringTokenizer(in.readLine());
				int n = parseInt(tk.nextToken());
				int[] tab = new int[n];
				int i=0;
				tk = new StringTokenizer(in.readLine());
				while(i<n) {
					tab[i]= parseInt(tk.nextToken());
					//if(tab[i]==0)
				i++;}
				int s=0;
				for(int k=0;k<2;k++) {
					for(i=0;i<n;i++) {
						s=s ^ tab[i];
					}
					for(i=0;i<n;i++) {
						tab[i]=s;
					}
				}
				
				if(n>1 && (tab[0]^tab[1])!=0) {
					for(i=0;i<n-1;i+=2) {
						s=tab[i]^ tab[i+1];
					}
					for(i=0;i<n;i++) {
						tab[i]=s;
					}
					
					System.out.println(1+n/2);
					System.out.println(1+" "+n);
					System.out.println(1+" "+n/2);
					System.out.println((n/2+1)+" "+n);
					System.out.println(1+" "+n);
					
					System.out.println(Arrays.toString(tab));
				}
				else {
					System.out.println(2);
					System.out.println(1+" "+n);
					System.out.println(1+" "+n);
				}
				
				
		}
		

	}

}
