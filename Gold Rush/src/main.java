import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		while (cases>0) {
			
			int m0 = scan.nextInt();
			int m2 = scan.nextInt();
			int m1=m0;
			int m=0;
			if(m1-m2==m2/2 || m1-m2==m2*2)
				System.out.println("YES");
			else if(m1-m2<=2 || m2*2>=m1)
				System.out.println("NO");
			else {

				while (m1!=m2 && m1>2)
					
				{
					System.out.println(m1);
					
					 if(m1%3==0) {
						m=m1/3;
						if(m*2==m1-m) {
							
							m1=m*2;
							
							
						}
							
						else
						{
							m=m1-m2;
							
							if(m-m2==m2/2)
								m1=m2;
							else 
								m1=m1/2;
						}
						
					}
					
					else {
						m=m1-m2;
						if(m-m2==m2/2)
							m1=m2;
						else 
							m1=m1/2;
					}
					 
					 if((m1/2)-m2==m2*2 && m1%2==0) {
							m1=m2;
						}
							

				}
				
			
				if(m1==m2)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
				
		
			
		
			cases--;
		}

	}

}
