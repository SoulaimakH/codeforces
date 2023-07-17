import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int Pylons = scan.nextInt();
		int[] heights = new int[Pylons+1];
		heights[0]=0;
		int i=1;
		
		while(i<=Pylons){
			heights[i]=scan.nextInt();
		i++;}
		int dollars=0;
		int energie=0;
		for(int j=0;j<Pylons;j++) {
			energie+=heights[j]-heights[j+1];
			if(energie<0) {
				dollars+=-energie;
				energie=0;
			}
				
			
		}
		
		System.out.println(dollars);
	}
}
