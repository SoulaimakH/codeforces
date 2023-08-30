import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
static int [] x= {0,-1,0,1};
static int [] y= {-1,0,1,0};
static boolean allowed(int i,int j,int n,int m) {
//	System.out.println("m="+m);
//	System.out.println("i="+i+" j="+j+"  r="+(i<n && j<m && j>=0 && i>=0));
	if(i<n && j<m && j>=0 && i>=0) return true;
	else return false;
}
	public static void main(String[] args) {
		
		Set el = new HashSet();
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		char c=scan.next().charAt(0); 
//		int s=0;
//		int max=0;
        String[] tab = new String[n];
		for(int i=0;i<n;i++) {
			tab[i]=scan.next();
		}
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				if(tab[i].charAt(j)==c) {
//					System.out.println("d"+s);
//					System.out.println("//**********//");
					for(int k=0;k<4;k++) {
						int di=i+x[k];
						int dj=j+y[k];
						
						if (allowed(di,dj,n,m)) {
							//System.out.println(tab[di].charAt(dj));
							if(tab[di].charAt(dj)!='.' && tab[di].charAt(dj)!=c)el.add(tab[di].charAt(dj));
						//	System.out.println(s);
						}
						//if(tab[k].charAt(j)!='.')s++;
					}
					//System.out.println("f"+s);
//					max=Math.max(max,s);
//					s=0;
				}
			}
			
			
		}
        
     
        		
        System.out.println(el.size());
        
        
	}

}
