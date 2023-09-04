import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m =scan.nextInt();
		
		int nbrs=n+m;
		int point=n*m;

		//int w=0;
		boolean Malvika=true;
		boolean Akshat=false;
		//System.out.println("initial nbrs="+nbrs+" p= "+point);
		while(nbrs>0 && point>0) {
			//w++;
			nbrs-=2;
			point-=(n+m-1);
			n--;
			m--;
		//	System.out.println("nbrs="+nbrs+" p= "+point);
			if(Malvika) {
				Malvika=false;
				Akshat=true;
			}else
			{
				Malvika=true;
				Akshat=false;
			}
		}
		//System.out.println(w);
		//if(w%2!=0)System.out.println("Malvika");else System.out.println("Akshat");
		if(Malvika)System.out.println("Malvika");else System.out.println("Akshat");
	}

}
