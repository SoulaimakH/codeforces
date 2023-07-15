import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int a = scan.nextInt();
		int [] cities= new int[n];
		
		for(int j=0 ; j<n;j++)
		{
			cities[j]=scan.nextInt();
		}
		
		int counterl=0;
		int counterr=0;
		//int crimnals=0;
		
	    int crimnals=cities[a-1];
		a=a-1;
		while((a-counterl)>-1 || (a+counterr) <n ) {
			
			if(a-counterl>-1)
			counterl++;
			if(a+counterr<n)
			counterr++;
			//System.out.println(counterl==counterr);
			if(counterl==counterr && a-counterl>=0 && a+counterr<n) {
				//if()
				if(cities[a-counterl]==cities[a+counterr])
					crimnals+=2*cities[a+counterr];
			}
			else {
				//System.out.println("else");
			//	if(cities[counterl]>=0 || cities[counterr]<n) {
					if(a-counterl>=0) {
						crimnals+=cities[a-counterl];
					}
					if(a+counterr<n)
					{
						//System.out.println("aaa="+cities[a+counterr]);
						crimnals+=cities[a+counterr];	
					}
			//	}
			}
			
			//System.out.println((a-counterl)>-1 || (a+counterr) <n );
		/*	System.out.println("l="+(a-counterl));
			System.out.println("r="+(a+counterr));
			System.out.println(crimnals);
			*/
		}
		System.out.println(crimnals);
		
		
	
	
	}
}
