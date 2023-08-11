import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main4 {
    static long removedelemnts( ArrayList<Integer> scores,long n ,long k,int h){
    	int j=h;
    	long result = 0;
    	long result2=0;
    	long i=n-1;
    	//System.out.println("n="+i);
    	int r1=0;
    	int r2=0;
    	while(j<n-1 && i>0) {

    		if(Math.abs(scores.get((int) i)-scores.get((int) (i-1)))>k) {
    			//System.out.println("i="+i);
    			if(i==1) {
    				r2++;
    			//	System.out.println("n-1="+i);
    			}
    			else {
    				result2=n-i;
    				//System.out.println("i else="+n-i);
    			}
				//	System.out.println("="+result2);
//                i-=1;
    			
    			
    		}
            
    		//System.out.println("i="+j);
			//System.out.println(Math.abs(scores.get(j+1)-scores.get(j)));
			if(Math.abs(scores.get(j+1)-scores.get(j))>k)
			{
				if(j==n-1) {
					r1++;
					//System.out.println("="+result);
				}else {
					//System.out.println("="+(n-j+1));
					result=j+1;
				}
					
				/*else {
				
						scores.remove(j);
						
					
				}*/
					
				//i--;
				//System.out.println("j--="+j);
				//System.out.println(scores);
				//j+=j+1;
				//long r=removedelemnts(scores,i,k,j);
				//System.out.println("rm="+r);
				
				
			}
			//System.out.println("r="+result);
			//i=scores.size();
			j++;
			i--;
		}
    	result2+=r2;
    	result+=r1;
    	//System.out.println("r2="+result2);
    	//System.out.println("r="+result);
    return Math.min(result2,result);}
    
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
			 //ArrayList<Integer> scores2 = new ArrayList<>();
			while(i<n) {
				int a=scan.nextInt();
				scores.add(a);
				//scores2.add(a);
			i++;}
			Collections.sort(scores); 
			//System.out.println(scores);
			//Collections.sort(scores2); 
			i=n;
			int j=0;
			 result=removedelemnts(scores,n,k,0);
			//Collections.reverse(scores2);
			
			//long result2=removedelemnts(scores2,n,k,0);
			
			/*if(result2<result)
				result=result2;*/
			
			System.out.println(result);
			
			cases--;}

	}

}
