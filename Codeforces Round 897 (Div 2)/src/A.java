import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       
        StringTokenizer tk;
        tk = new StringTokenizer(in.readLine());
		int t = parseInt(tk.nextToken());
		
		while(t-->0) {
			tk = new StringTokenizer(in.readLine());
			int n = parseInt(tk.nextToken());
			int i=0;
			//int [] tab = new int[n];
			List<cel> l= new ArrayList<cel>();
			tk = new StringTokenizer(in.readLine());
			while(i<n) {
				l.add(new cel(parseInt(tk.nextToken()),i));
				//tab[i]=
			i++;}
			//Arrays.sort(tab);
			Collections.sort(l);
							int [] result= new int[n];
//				for(i=0;i<n;i++) {
//					result[i]=i+1;
//				}
				 i=n;
				for(cel c : l) {
				//	System.out.println("i="+i+" "+c.a+" o="+c.order);
					result[c.order]=i;
					i--;}
				
				Arrays.stream(result).forEach(e ->System.out.print(e+" "));
				System.out.println();
			
			
			
		}
	}

}
class cel  implements Comparable<cel> {
	int a;
	int order;
	public cel(int a,int order) {
        this.a = a;
        this.order = order;
     
       
    }
	@Override
    public int compareTo(cel other) {
        return Integer.compare(this.a, other.a);
    }
	
}