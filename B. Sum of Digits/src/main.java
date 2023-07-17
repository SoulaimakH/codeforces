import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int result=0;
	
		int somme=0;
		
		while(number>=10 ) {
			somme=0;
			while(number>0) {
				somme+=number%10;
				number=number/10;	
			}
			
			number=somme;
		
			result++;

	}
		 System.out.println(result);
	}

}
