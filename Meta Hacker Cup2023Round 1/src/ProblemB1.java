import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ProblemB1 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        for (int it = 1; it <= t; it++) {
        	tk = new StringTokenizer(in.readLine());
            int n =  parseInt(tk.nextToken());
            List<Integer> tab=new ArrayList<Integer>();
            List<Integer> tab2=new ArrayList<Integer>();
             tab=findlist(n,41,tab,0,0,1);
             //tab2=findlist(n,41,tab,0,0,1);
             //if(tab.size()<tab2.size())tab=tab2;
             System.out.print("Case #" + it + ": ");
             if(tab.size()>0) {
            	 System.out.print(tab.size()+" ");
                 
                 for(int a:tab)System.out.print(a+" ");
             }
             else System.out.print(-1);
             System.out.println();
            
        }

	}
	
	public static List<Integer> findlist(int p,int i,List<Integer> array,int s,int l,int prod) {
		//if(s==41)return array;
		for(int j=i;j>0;j--) {
			if(p%j==0) {
				array.add(j);
				s+=j;
				prod=prod*j;
				if(s==41 && prod==p)return array;
				else if(s>41 || array.size()>=100)return new ArrayList<Integer>();
				 return findlist(p,41-s,array,s,array.size(),1);
			}
			
		}
		return array;
	}
	
	public static List<Integer> findlist2(int p,int i,List<Integer> array,int s,int l,int prod) {
		//if(s==41)return array;
		//System.out.println("new i= "+i);
		for(int j=i+1;j<41-s;j++) {
			if(p%j==0) {
				//System.out.println(j);
				array.add(j);
				s+=j;
				prod=prod*j;
				if(s==41 && prod==p)return array;
				else if(s>41 || array.size()>=100) {
					//System.out.println("er");
					return new ArrayList<Integer>();
				}
				return findlist2(p,j,array,s,array.size(),prod);
			}
			
		}
		if(s==41 && prod==p)
		return array;
		else return new ArrayList<Integer>();
		
	}

}
