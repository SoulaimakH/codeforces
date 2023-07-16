import java.util.ArrayList;
import java.util.Collections;   

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 //  HashMap<Integer, Integer> hs = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int nbr_matchbox = scan.nextInt();
		
		int nbr_choix = scan.nextInt();
		int i=0;
		//int [] boxs =new int[nbr_choix];
		
		ArrayList<Integer> boxs = new ArrayList<Integer>();
		
		//Integer [] matches_val=new Integer[nbr_choix];
		
		ArrayList<Integer> matches_val = new ArrayList<Integer>();
		//int [] sorted = new int[nbr_choix];
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		int resulte=0;
		while(i<nbr_choix) {
			//boxs[i]=scan.nextInt();
			boxs.add(scan.nextInt());
			//matches_val[i]=scan.nextInt();
			matches_val.add(scan.nextInt());
			sorted.add(matches_val.get(i));
			//hs.put(nbrbox,nbr_matchs);
			
			i++;
		}
		//sorted=matches_val;
		Collections.sort(sorted);
		//System.out.println(sorted);
		/*for(int j=0 ;j<sorted.length;j++) {
			System.out.println(sorted[j]);
		}*/
		//int index=matches_val.indexOf(sorted.get(8));
		//System.out.println(index);
		int j=nbr_choix-1;
		int indexi=-1;
		while(nbr_matchbox>0 && j>=0 ) {
			
			int val=sorted.get(j);
			
			 int index=matches_val.indexOf(val);
			 
			if(nbr_matchbox>=boxs.get(index) )
			{
				resulte+=boxs.get(index)*matches_val.get(index);
				//if(j>0)
				j--;
				
				//sorted.remove(j);
			}
			else {
				resulte+=nbr_matchbox*matches_val.get(index);
			}
			
			nbr_matchbox-=boxs.get(index);
			boxs.remove(index);
			matches_val.remove(index);
			//System.out.println("reste="+nbr_matchbox);
			//nbr_matchbox--;
		
		}
		
		
		System.out.println(resulte);
	}

}
