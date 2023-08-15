package onsheet;

import java.util.Scanner;

public class EASYMATH {

	public static int inc_exe(int m,int idx,int d , int sgn,int[] tab) {
		if(idx==5) {
			if(d==1)
				return 0 ;
			
			return sgn * m/d;
		}
		return inc_exe(m,idx+1,d,sgn,tab)+inc_exe(m,idx+1,d*tab[idx],sgn*-1,tab);}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int cases =scan.nextInt();
		 while(cases>0) {
			
			 int n=scan.nextInt();
			 int m=scan.nextInt();
			 int a=scan.nextInt();
			 int b=scan.nextInt();
			 int all=m-n;
			 int[] tab = {a,a+b,a+(2*b),a+(2*3),a+(2*4)};
			 int div=0;
			 for(int i =0 ;i<tab.length ;i++) {
				 System.out.println(tab[i]);
				 int s=((m/tab[i])-(n/tab[i]));
				if(s>0)		 
				 div+=s;
				 System.out.println(div);
			 }
			// System.out.println(div);
			 int alldiv = m-n;
			 int r=alldiv-div;
			 System.out.println(r);
			 //int divn=inc_exe(n,0,1,-1,tab);
		     //int divm=inc_exe(m,0,1,-1,tab);
		     //int alldiv = divm-divn;
		     //System.out.println(divm);
		     //System.out.println(all-alldiv);
		    		 
			 cases--;}
		

	}

}
