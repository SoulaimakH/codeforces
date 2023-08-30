import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int somme=0;
		int[] tab = new int[n];
		int i=0;
		if(n<=1) System.out.println("NO");  // be careful here if n<2 kitahara can't divide apple between her 2 freinds equally 
		else {
			while(i<n) {
				tab[i]=scan.nextInt();
			i++;}
			
	       Arrays.sort(tab);
	       int s1=tab[n-1];
	       int s2=tab[n-2];
//	       System.out.println("1="+s1);
//	       System.out.println("2="+s2);
			for(int j=n-3;j>=0;j--) {
				if(s1>s2)s2+=tab[j];
				else if(s1<s2)s1+=tab[j];
				else s1+=tab[j];
				//System.out.println("2="+s2);
			}
			
			if(s1==s2) System.out.println("YES");else System.out.println("NO");
		}
		
	}

}
