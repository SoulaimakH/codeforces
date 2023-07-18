import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		long v=0;
		long p=0;
		int s;

		
		int n =scan.nextInt();
		int [] array1= new int[100005];
		int i;
		for(i=0; i<n;i++) {
			
			array1[scan.nextInt()]=i+1;
		}
        
		int m =scan.nextInt();
		
		while(m>0) {
			s=scan.nextInt();
			
			v+=array1[s];
			p+=n-array1[s]+1;
			//System.out.println(p);
		m--;}
		
		System.out.println(v+" "+p);
	}
	
	


}
