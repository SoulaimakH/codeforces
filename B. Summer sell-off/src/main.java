import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

public class main {
	public static void main(String[] args)throws IOException {
	
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder out = new StringBuilder();
	        StringTokenizer tk;
	        
	        tk = new StringTokenizer(in.readLine());
		int d = parseInt(tk.nextToken());
		int f = parseInt(tk.nextToken());

		List<Integer> added = new ArrayList();
	
		
		int i=0;
		long somme=0;
		
		while(i<d) {
			tk = new StringTokenizer(in.readLine());
			int p=parseInt(tk.nextToken());
			int c =parseInt(tk.nextToken());
			
			if(p<c && p!=0) {

				added.add(Math.min(p,c-p));

			}
			
				somme+=(long)Math.min(p,c);
			
		i++;}
		
		Collections.sort(added);

		int size=added.size();

		while(f>0 && size>0) {
			somme+=(long)added.get(size-1);
			size--;
		f--;}
	
		
		System.out.println(somme);
		}
}
