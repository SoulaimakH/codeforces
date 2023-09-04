import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       
        StringTokenizer tk;
        tk = new StringTokenizer(in.readLine());
		int x = parseInt(tk.nextToken());
	    int y = parseInt(tk.nextToken());
        
	    boolean cel=true;
	    boolean han=false;
	    int i=0;
	    while((x>=2 &&y>=2) || (x==1 && y>=12) || (y>=22)) {
	    	//System.out.println("d5");
	    if(!han) {
	    	int a=0;
	        if(x>0) {
	        	if(x>=2) {
	        		x-=2;
	        		if(y>=2) {
	        			y-=2;
	        		}
	        		else {
	        			y=0;break;
	        		}
	        	}
	        	else {
	        		if(y>=12)y-=12;else {
	        			y=0; break;
	        		}
	        	}
	        }
	        else {
	        	if(y>=22)y-=22;
	        	else {
	        		y=0;break;
	        	}
	        }
	       
	    	han=true;
	    	cel=false;
	    }
	    else {
	    	
	    	if(y>=22)y-=22;
	    	else {
	    		if(y>=12) {
	    			if(x>=1)x-=1;
	    			else {
	    				x=0;y=0;break;
	    			}
	    			y-=12;
	    		}
	    		else if(y>=2){
	    			if(x>=2)x-=2;
	    			else {
	    				x=y=0;break;
	    			}
	    			y-=2;
	    		}
	    		else {
	    			y=x=0;break;
	    		}
	    	}
	    	han=false;
	    	cel=true;
	    }
	   // System.out.println(cel+" x="+x+" y"+y);
	    i++;}
	   // System.out.println(i);
	    if(i%2!=0)System.out.println("Ciel"); else System.out.println("Hanako");
	}

}
