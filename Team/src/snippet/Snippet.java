package snippet;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = 0;
        int t=0;
        int v=0;
        int R=0;
      for(int i=0;i<n;i++) {
    	  p = scan.nextInt(); 
    	  t = scan.nextInt(); 
    	  v = scan.nextInt(); 
    	  if(p!=0 && p==t)
    		  R++;
    	  else if(t!=0 && t==v)
    		  R++;
    	  else if(v!=0 && v==p)
    		  R++;
      }
        System.out.println(R);
	}
}

