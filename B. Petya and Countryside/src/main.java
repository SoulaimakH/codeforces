import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sections = scan.nextInt();
		int [] secrionsHeight = new int [sections];
		int maxsections=1;
		int somme=0;
		int r=0;
		int l=0;
		//boolean rigth=true;
		//boolean left=true;
		int i=0 ;
		for(int j=0 ; j<sections;j++)
		{
			secrionsHeight[j]=scan.nextInt();
		}
		
		if(sections>2)
	    
		while(i<sections) {
			somme=1;
			r=i;
		    l=i;
		    
		   
		    if(i>0) {
		    	if(secrionsHeight[i]==secrionsHeight[i-1]) {
			    	
			    	//i++;
			    	r=sections-1;
				    l=0;
				    
			    	//somme++;
			    }
		    	
		    	  // System.out.println("92="+secrionsHeight[i-1]);
		    	
	
		    }
		    
		    	
		  //  System.out.println(r<sections-1 || l>0);
			
		   // rigth=true;
			//left=true;
		    while(r<sections-1 || l>0)  {
		       
		    	//System.out.println("r="+r);
		    	//System.out.println("l="+l);
		    	if(r<sections-1) {
		    		if(secrionsHeight[r]>=secrionsHeight[r+1]) {
			    		somme++;
			    		r++;
			    	}
		    		else {
			    		r=sections-1;
			    	}
			    	
		    		// System.out.println(" sr="+somme);
		    		
		    	}
		    	
		    	
		    	if(l>0) {
		    		
		    		if(secrionsHeight[l]>=secrionsHeight[l-1]) {
			    		somme++;
			    		l--;
			    	}
		    		else {
			    		l=0;
			    	}
				    
		    	// System.out.println(" sl="+somme);
		    		
		    	}
		    		
		    	
		    }
		    if (somme>maxsections)
		    	maxsections=somme;
		    
		  // System.out.println("i="+i+" s="+somme);
		   i++;
		}
		else {
			maxsections=sections;
		}
		System.out.println(maxsections);
		
	}
	


}
