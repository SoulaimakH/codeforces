import java.util.Scanner;

public class main2 {

	public static int findMax(int[] array) {
         
		
        int index=0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index=i;
            }
        }

        return index;
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases =scan.nextInt();
		int nbr;
		int [] response = new int[51];
		int i=0;
		int l;
		int q;
		int max=0;
		int pos = 0;
		while(cases>0) {
			response=new int[51];
			 nbr=scan.nextInt();
			 i=0;
			 while(i<nbr) {
				 l=scan.nextInt();
				 q=scan.nextInt();
				 
				 if(l<=10) {
					 
					 response[i]=q;
				 }
					
						 
				 
			 i++;}
			
			
			 
			 System.out.println(findMax(response)+1);
			
			cases--;}

	}

}
