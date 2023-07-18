import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int v=0;
		int p=0;
		int s;
		int fv=0;
		int fp=0;
		
		int n =scan.nextInt();
		int [] array1= new int[n];
		int i;
		for(i=0; i<array1.length;i++) {
			array1[i]=scan.nextInt();
		}
		int m =scan.nextInt();
		int j=0,k=n-1;
		//int [] array2=new int[m];
		for(i=0;i<m;i++) {
			s=scan.nextInt();
			fv=0;
			fp=0;
			j=0;
			k=n-1;
			while((j<n || k>=0) && (fv<1 || fp<1)) {
				if(s==array1[j]) {
					fv=1;
					v++;
				}
				else if(fv<1) {
					v++;
				}
				if(s==array1[k]) {
					fp=1;
					p++;
				}
				else if(fp<1) 
				{
					p++;
				}
				
			j++;
			k--;	}
			
		}
		
		
		System.out.println(v+" "+p);

	}

}
