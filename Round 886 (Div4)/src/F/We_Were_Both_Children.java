package F;

import java.util.ArrayList;
import java.util.Scanner;

public class We_Were_Both_Children {
	
	
	 
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        int cases = scan.nextInt();

	        while (cases > 0) {
	            int n = scan.nextInt();
	            int max = 0;
	            ArrayList<Integer> list = new ArrayList<>();
	            ArrayList<Boolean> booleanList = new ArrayList<>();
	            ArrayList<Integer> add = new ArrayList<>();
                for(int k=1;k<n+2;k++) {
                	 list.add(0);
                	 booleanList.add(false);
                	add.add(0);
                }
               
	            for (int i =1; i < n+1; i++) {
	                int a = scan.nextInt();
	                
	                
	               if(a<=n && booleanList.get(a)==false) {
                       add.set(a,1);
                       booleanList.set(a,true);
	               }
	               else if(a<=n){
	            	   int updatedValue = add.get(a) + 1;
                       add.set(a, updatedValue);
	               }
	               
	             }
	            
	            for(int k=1;k<n+1;k++) {
	            	   int j = k;
	            	   
	            	  if(add.get(j)>0)
	            	   while (j <= n) {
	                    	
	                    	
		                    int currentIndex = j;
		                  
		                        int updatedValue = list.get(currentIndex) + add.get(k);
		                       
		                        list.set(currentIndex, updatedValue);
		                    
		                       
		                    max = Math.max(max, list.get(currentIndex));
		                   
		                 //  System.out.println("k"+k);
		                    
		                    j += k;
		                    
		                    
		                  
	                }
	               }
	            
	           // max +=ex;
//	            System.out.println(add.get(2));
//	           System.out.println(add);
//	           System.out.println(list);
	            System.out.println(max);
	            cases--;
	        }
	}
}
