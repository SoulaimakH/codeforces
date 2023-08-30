import java.util.Scanner;

public class main {
/*
 * it's better to use :
 *  StringBuilder out=new StringBuilder(); 
 *  for playing with Strings
 *  word=word.substring(0, m) + word.substring(m+1); //delete caracter m index 
 *  out.append(x.charAt(0));
 *   out.append(x.charAt(i)); // insert in the right
 *    out.insert(0,x.charAt(i)); // left insert
 *     System.out.println(out.reverse());
 * 
 * 
 * 
 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String word = scan.next();
		 StringBuilder sb = new StringBuilder(word);
		 char[] tab= new char[n+1];
		 String neww = "";
		int m;

		if(n%2==0) m=n/2;else m=(n/2)+1;
		int r=m+1;
		int l=m-1;
		tab[m]=word.charAt(0);
	//	System.out.println(m);
		int k=0;
		//if(n%2!=0) k++;
		
		if(n>2) {
			for(int i=1;i<word.length();i++) {
				int j=i+k;
				if(j%2==0) {
					tab[l]=word.charAt(i);
					l--;
				}
				else {
					tab[r]=word.charAt(i);
					r++;
				}

			}
			for(int j=0; j< tab.length;j++) {
				 if(n%2!=0) neww=tab[j]+neww;
				 else neww+=tab[j];
			}
	        	  
	         
	      	System.out.println(neww.trim());
		}
		
		else {
			System.out.println(word);
		}
		

          

	}

}
