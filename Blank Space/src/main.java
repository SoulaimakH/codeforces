import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=0;
		int[] result=new int[n];
		while(i<n) {
			 int lengtharray = scan.nextInt();
		//	 System.out.println("l="+lengtharray);
			 int j=0;
			 int lenspace=0;
			 int nbr0=0;
		      while(j<lengtharray)
		      {   
		    	  
		    	  int e = scan.nextInt();
		    	// System.out.println("e="+e);
		    	  if(e==0) {
		    		  //System.out.println("if e="+e);
		    		  nbr0++;
		    		//  System.out.println("if nbr="+nbr0);
		    		  if(lenspace<nbr0)
		    			  lenspace=nbr0;
		    	  }
		    	  else {
		    		
		    		       nbr0=0;
		    	  }
		    	  j++;
		      }
		      result[i]=lenspace;
		      i++;

		}
		
		for (int j = 0; j < n; j++) {
		    System.out.println(result[j]);
		}

	}

}
