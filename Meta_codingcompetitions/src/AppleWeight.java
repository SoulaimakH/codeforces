import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class AppleWeight {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        for (int it = 1; it <= t; it++) {
        	 tk = new StringTokenizer(in.readLine());
             int n =  parseInt(tk.nextToken());
             int nb=n*2-1;
             tk = new StringTokenizer(in.readLine());
             int[] array=new int[nb];
             int jk=0;
             int sm=0;
             while(jk<nb) {
            	 
            	 array[jk]= parseInt(tk.nextToken());
            	sm+=array[jk];
            jk++; }
               //System.out.println(sm);

             Arrays.sort(array);
             //System.out.println(Arrays.toString(array));
            int min=Integer.MAX_VALUE;
             
            if(nb>1) {
            	int h=0;
            	int z=0;
            	int nr=0;
            	boolean td=true;
            	boolean t0=true;
            	List<Integer> tab=new ArrayList();
            	List<Integer> tabw=new ArrayList();
            	for(int p=0;p<=nb/2;p++) {
            		
            		//case pos 0 howa eli bich itir
            		 h=nb-1;
                	z=array[p]+array[h];
                	//System.out.println(z);
                	 t0=true;
                	 int nrw=0;
                	 int w=0;
                	for(int k=p+1;k<nb/2;k++) {
                		h--;
                		//System.out.println(" p="+p);
                		//System.out.println("  =>"+z);
                		if(z!=array[k]+array[h]) {
                			w=k;
                		//	System.out.println("  =>zc= "+array[k]+" "+array[h]);
                			nrw++;
                			h++;
                		}
                	}
                	//System.out.println(" p="+p+" "+nrw);
                     if(nrw<1) { 
                    	 //min=array[p];
                    	 //System.out.println(z-array[p]);
                    	 tab.add(p);
                    	 
                     }else if(nrw==1) {
                    	 
                    	 int tn=0;
                    	 int sz=nb-(p-1);
                    	 //System.out.println("w = "+w);
                    	 if (sz>=nb)sz=nb-1;
                    	 h=nb-1;
                    	 z=array[w]+array[sz];
                    	// System.out.println("z= "+z );
                    	 for(int k=0;k<nb/2;k++) {
                    		// System.out.println("  =>"+(array[k]+array[h]));
                    		 if(z!=array[k]+array[h]) {
                    			 tn++;
                    			 h++;
                    		 }
                    		 h--;
                    	 }
                    	 //tabw.add(p);
                    	// System.out.println("tn "+tn);
                    	 if(tn>1) {
                    		 min=array[w];
                        	 tab.add(p);
                        	 tabw.add(w);
                        	 break;
                    	 }else {
                    		
                    		 min=array[p];
                    		 tab.add(w);
                    		 tabw.add(p);
                    	 }
                    	 
                     }
                     else {
                    	 
                    	 min=array[p];
                    	 tabw.add(p);
                     }
                   
                     //System.out.println(" p="+p+" tab"+tab);
            	}
            	
            	
            	//System.out.println(tabw.size());
            	
            	if(tabw.size()==1) {
            		
            		int zm=array[nb/2]+array[nb/2+1];
            		//System.out.println(array[tab.get(0)]+array[nb-tab.get(0)]);
            		int id=nb-tab.get(0);
            		if(id>=nb)id=nb-1;
            	    
            		//System.out.println("min "+min);
            		
            		if(zm==array[tab.get(0)]+array[id]) {
            			
            			System.out.println(("Case #" + it + ": "+(zm*n-sm)));
            		}
            			
            		else {
            			
                			System.out.println(("Case #" + it + ": "+(-1)));
                		
                		
            		}
            		
            		
            	
            		
            	}else if(tabw.size()>1) {
            		System.out.println(("Case #" + it + ": "+(-1)));
            	}
            	else if(tabw.size()==0) {
            		
            		z=array[0]+array[nb-1];
            		System.out.println(("Case #" + it + ": "+(z-array[nb/2])));
            		
            	}
            		
            			
                		
                		
                		
                		
               		
               
            	
            	
            }else {
            	System.out.println("Case #" + it + ": "+1);
            }
            
            
        }

	}

}
