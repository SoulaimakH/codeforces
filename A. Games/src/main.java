import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] tabhome =new int[n] ;
		int [] tabguest=new int[n];
		int i=0;
		int r=0;
		while(i<n) {
			tabhome[i]=scan.nextInt();
			tabguest[i]=scan.nextInt();
		i++;}
		for(i=0;i<n;i++) {
			
			for(int j=0;j<n;j++)
			if(tabhome[i]==tabguest[j]) r++;
		}
		 System.out.print(r);
		

	}

}
