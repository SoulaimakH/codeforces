import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();
		
		int [] tab =new int[n];
		int i=0;
		while(i<n) {
			tab[i]= scan.nextInt();
		i++;}
		
		Arrays.sort(tab);
		
int mx = Integer.MIN_VALUE;
        
        for( i=1; i<n; i++)
            mx = Math.max(mx, tab[i]-tab[i-1]);
        
        double ans = (double)mx/2.0;
        
        if(!(tab[0]==0)) ans = Math.max(ans, (double)tab[0]);
        if(!(tab[n-1]==l)) ans = Math.max(ans, (double)(l-tab[n-1]));
	
		System.out.println(ans);

	}

}
