import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Completely_Balanced {
	static Scanner scan = new Scanner(System.in);
	static long secMid;
	static long firstMid;
	static ArrayList<Long> tab = new ArrayList<>();
static long solve() {
	
	int n=scan.nextInt();
	long val=0;
	//int[] tab= new int[n];
	long sum=0;
//	long median=0;
	
	for(int i=0;i<n;i++) {
		val=scan.nextLong();
		sum+=val;
		tab.add(val);

	}
	
	
	 long ans =  200000000;
	Collections.sort(tab); // according to exemples tab must be sorted
		//System.out.println(tab.get( ((n+1)/2)-1));
	if(n==2) {
		return  tab.get((n-1) / 2)*(n+1)-sum ;
	}
	else if(n==1) {
		return  tab.get(0) ;
	}
	else {
		firstMid = tab.get(((n-1)/2)) ;//*(n + 1);
	    secMid = tab.get((n-1)/2-1) ;//*(n + 1);
	    
	    firstMid = (n + 1) * firstMid;
        if (firstMid - sum >= tab.get(((n-1)/2))) {
            ans = Math.min(ans, firstMid - sum);
        }
 
        secMid = (n + 1) * secMid;
        if (secMid - sum <= tab.get((n-1)/2-1)) {
            ans = Math.min(ans, secMid - sum);
        }
	    

	    if (sum % n == 0) {
	        if (sum / n >= (secMid / (n + 1)) && sum / n <= (firstMid / (n + 1))) {
	            ans = Math.min(ans, sum / n);
	        }
	    }
	}
	
	
return ans;}
	public static void main(String[] args) {
		
		int cases =scan.nextInt();
		
		while(cases>0) {
		     tab.clear();
			System.out.println(solve());
			cases--;}

	}

}
