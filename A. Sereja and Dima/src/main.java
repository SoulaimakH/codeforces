import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] tab =new int[n];
				int i=0;
		while(i<n) {
			tab[i]=scan.nextInt();
			
		i++;}
		i=n-1;
		int j=0;
		int s = 0,d = 0;
		boolean ts,td;
		ts=true;
		while(n>0) {
         if(ts) {
        	 if(tab[j]>tab[i]) {
        		 s+=tab[j]; j++;
        	 }
        	 else {
        		 s+=tab[i]; i--;
        	 }
        	 ts=false;
        	 td=true;
        	 
         }
         else {
        	 
        	 if(tab[j]>tab[i]) {
        		 d+=tab[j]; j++;
        	 }
        	 else {
        		 d+=tab[i]; i--;
        	 }
        	 td=false;
        	 ts=true;
        	 
         }
		n--;}
		
		System.out.print(s+" "+d);

	}

}
