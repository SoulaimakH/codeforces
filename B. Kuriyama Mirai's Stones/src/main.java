import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
 
public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.000000");
        StringTokenizer str;
        int n=Integer.parseInt(br.readLine());
        
   
        int i=1;
		long[] tabq1 = new long[n+1];
		Integer[] tabq2 = new Integer[n+1]; /// using long type cause memory exeption
		long[] newtq2=new long[n+1];
		
		tabq1[0]=0;
		tabq2[0]=0;
		str=new StringTokenizer(br.readLine());
		while(i<n+1) {
			tabq2[i]=Integer.parseInt(str.nextToken());
			tabq1[i]=tabq1[i-1]+tabq2[i];
			
			
		i++;}
		
		
Arrays.sort(tabq2);// sort the table that gonna be used i question2
		
		
		//newtq2[0]=tabq2[0];
		for(int k=1;k<n+1;k++) {
			newtq2[k]=tabq2[k]+newtq2[k-1];
		}
		//System.out.println(Arrays.toString(newtq2));
		int nbq=Integer.parseInt(br.readLine());
		int q;
		int l;
		int r;
		while(nbq>0) {
			str=new StringTokenizer(br.readLine());
			q=Integer.parseInt(str.nextToken());

			
			
			//l--;
			//r--;
			//long somme=0;
			l=Integer.parseInt(str.nextToken());

			r=Integer.parseInt(str.nextToken());
			
			if(q==1) {
				

				System.out.println(tabq1[r]-tabq1[l-1]);
			}
			else {
				

				System.out.println(newtq2[r]-newtq2[l-1]);
			}
			
			
			nbq--;}
		
		
       
        
    }
}