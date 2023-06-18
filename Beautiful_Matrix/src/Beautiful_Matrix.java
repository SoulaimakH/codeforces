import java.util.Scanner;

public class Beautiful_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i=0,j=0;
		
		for(int a=0;a<5;a++) {
			for(int b=0;b<5;b++)
			{
				int n = scan.nextInt();
				if(n==1)
				{
					j=b;
					i=a;
				}
			}
		scan.nextLine();
		}
			int R=Math.abs(j-2)+Math.abs(i-2);
		System.out.println(R);
	}
	
	
	

}
