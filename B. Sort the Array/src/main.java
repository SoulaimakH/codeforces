import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

public class main {

	public static void main(String[] args)  throws IOException {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      //  StringBuilder out = new StringBuilder();
	        StringTokenizer tk;
	        
		int n = parseInt(in.readLine());
		int[] tab = new int[n];
		int[] inverse = new int[n];
		int i=0;
		tk = new StringTokenizer(in.readLine());
		while(i<n) {
			tab[i]=parseInt(tk.nextToken());
			inverse[i]=tab[i];
		i++;}
		
		Arrays.sort(inverse);
		int d=0;
		int f=0;
		boolean a=false;
		boolean fin=false;
		i=0;
		
		while( i<n) {
//		for(i=0;i<n;i++) {
			if(!a && inverse[i]!=tab[i]) {
				d=i;
				a=true;
			}
			else if(fin && inverse[i]!=tab[i]) {
				//System.out.println("h");
				f=i;
				fin =false;
			}
			else if(!fin && a &&  inverse[i]==tab[i]) {
				f=i-1;
				fin =true;
			}
			
		i++;}
		if(!fin && a)f=n-1;
		
//		System.out.println(Arrays.toString(tab));
//		System.out.println(Arrays.toString(inverse));
//		System.out.println("d"+d);
//		System.out.println("f"+f);
//		int[] newt =new int[f+1-d];
		i=d;
		boolean possible=true;
		
		for(int j=f ;j>=d;j--) {
		//	System.out.println("j=" + tab[j]+ "i="+inverse[i]);
		if(tab[j]!=inverse[i]) {
			possible=false;
			break;
		}
		i++;
		}
		
		if(possible) {
			System.out.println("yes");
			System.out.println(d+1+" "+(f+1));
		}
		else
			System.out.println("no");
		
		
		
	}

}
