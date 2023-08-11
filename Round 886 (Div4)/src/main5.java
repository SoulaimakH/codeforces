import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main5 {
    static long removedelemnts( ArrayList<Integer> scores,long n ,long k){
    	//int j=0;
    	long result = 0;
    	long j=n;
    	//System.out.println("n="+i);
    	
    	
        int lastToRemove = 0;
        long mini = 200000000;
        for (int i = 0; i < n - 1; i++) { 
            if (scores.get(i + 1) - scores.get(i) > k) {
                System.out.println("i="+i);
                
                mini = Math.min(mini, lastToRemove + n - i - 1); // remove restant
                System.out.println("min="+mini);
                
                lastToRemove = i + 1;
                System.out.println("rm="+lastToRemove);
            }
        }
        mini = Math.min(mini, lastToRemove);
        result=mini;
    return result;}
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases =scan.nextInt();
		long i=0;
		long result=0;
		boolean ok=false;
		while(cases>0) {
			long n= scan.nextLong();
			long k=scan.nextLong();
			i=0;
			//int[] scores= new int[n];
			  ArrayList<Integer> scores = new ArrayList<>();
			
			while(i<n) {
				int a=scan.nextInt();
				scores.add(a);
				
			i++;}
			Collections.sort(scores); 
			
			i=n;
			int j=0;
			System.out.println(scores);
			 result=removedelemnts(scores,n,k);
		
			
			
			System.out.println(result);
			
			cases--;}

	}

}
