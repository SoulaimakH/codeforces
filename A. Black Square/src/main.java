import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int i=1;
		Scanner scan = new Scanner(System.in);
		int[] tabc=new int[5];
		while(i<5) {
			tabc[i]=scan.nextInt();
			//System.out.println(tabc[i]);
		i++;}
		
		String order =scan.next();
		int r=0;
	
		for(int j=0; j< order.length();j++) {
			//convert character to number
			
			int nb=Character.getNumericValue(order.charAt(j));

			r+=tabc[nb];
		}
		System.out.print(r);

	}

}
