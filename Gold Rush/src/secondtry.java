
import java.util.ArrayList;
import java.util.Scanner;

public class secondtry {
	static ArrayList<Integer> listeNombres = new ArrayList<Integer>();
    
	public static boolean dfs(int m,int n) {

		boolean resulst=false;
		
		if(n==m)
			resulst= true;
		
		else
		{

			while(m>n && resulst==false) {
				if(m%3==0 ) {
	
					if(!listeNombres.contains(m/3)) {
						listeNombres.add(m/3);
						resulst=dfs(m/3,n);
						
					}
	
					
					if(resulst!=true)
						if(!listeNombres.contains(m/3*2)) {
							listeNombres.add(m/3*2);
							resulst=dfs(m/3*2,n);
							
						}
						
					m=m/3;
				
				}
				
				else 
					return false;
				}
			
		}
		return resulst;
			
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		while (cases>0) {
			listeNombres.clear();
			int m = scan.nextInt();
			int n = scan.nextInt();
		
			boolean r =dfs(m,n);
			if(r==true) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
			cases--;
		}
	}
}
