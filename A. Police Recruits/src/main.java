import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int h = 0;
		int crimes = 0;
		int r=0;
		while(n>0) {
			int v= scan.nextInt();
			if(v>0) {
				h+=v;
				//r=h+crimes;
				
			}
			else {
				
				if(h+v<0)// be carefull here
				r+=h+v;
				//crimes=Math.min(0,h+crimes);
				h=Math.max(0,h+v);
				//crimes=0;
				//h=Math.max(0,h+crimes);
			}
			
			
		
		n--;}
		System.out.println(Math.abs(r));

	}

}
