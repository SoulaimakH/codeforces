import java.util.Scanner;

public class main {
public static int factoriel(int a) {
	if(a==0|| a==1)
	return 1;
	else return a+factoriel(a-1);
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
	
		
		int i=0;
		int level=0;
		boolean done=false;
		while(!done) {
			
			level+=factoriel(i+1);
			//System.out.println(level);
			if(level>a) break;
			else
				i++;
			//int next=level+factoriel(i+1);
			
			}
	
		System.out.println(i);
	}

}
