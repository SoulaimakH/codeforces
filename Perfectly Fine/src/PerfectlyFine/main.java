package PerfectlyFine;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		int[] result=new int[cases];
		int i=0;
		while(i<cases) {
	
			int books_nbr = scan.nextInt();
			int skills0=-1;
			int skills1=-1;
			int both=-1;
			int totalm=-1;
			int totalm2=-1;
			while(books_nbr>0) {
				
				int m = scan.nextInt();
				String skills = scan.nextLine();
		
				if (skills.trim().equals("11")) {

				  if(both==-1) {
					  both=m;
				  }
					
				else
				 if(m<both)
				  both=m;
				  
				}
				
					if(skills.charAt(1)=='1') {
					    if(skills0==-1)
					    	skills0=m;
					    else
					  
						if(skills0>m )
							skills0=m;
					}
						
					
					if(skills.charAt(2)=='1')
					{
					 if(skills1==-1)
					    	skills1=m;
					    else
					  
						if(skills1>m )
							skills1=m;
					}
						
					
				
			
			
				
				books_nbr--;
			}
			
			if(skills1==-1 || skills0==-1 ) 
				System.out.println(-1);
			else
			{
			    totalm2=skills0+skills1;
			    if(both!=-1)
			    {
			        	if( totalm2<both){
			
						totalm=totalm2;
				}
				else
					totalm=both;
			    }
			    else
			    	totalm=totalm2;
				
				 System.out.println(totalm);
				
			}
				
			
			
			i++;
					}
		

	}

}
