package word;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name =scan.next();
		int nbuppercase=0;
		  for (int i = 0; i < name.length(); i++) {
			    
	            if(Character.isUpperCase(name.charAt(i))){    
	            	nbuppercase++;
	            }
	            
	 }
		  
		  if(nbuppercase>(name.length())/2)System.out.print(name.toUpperCase());
		  else System.out.print(name.toLowerCase());

	}

}
