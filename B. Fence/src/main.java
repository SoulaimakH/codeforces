import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k=scan.nextInt();
        int[] tab=new int[n+1];
        tab[0]=0;
      //  str=new StringTokenizer(br.readLine());
        int i=1;
        
        while(i<n+1) {
        	tab[i]=scan.nextInt()+tab[i-1];
        i++;}
        
        long min=1000000000; //must most big possible (it cause exeption for me 
        long som=0;
        int idx=k;
        for(int j=k;j<n+1;j++) {
        	som=tab[j]-tab[j-k];
//        	System.out.println("j="+j);
//        	System.out.println(som);
        	if(som<min) {
        		min=som;
        		idx=j;
        	}
        	//System.out.println("min="+min);
        }
        System.out.println(idx-k+1);
        
	}
}
