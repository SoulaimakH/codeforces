import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		char[] colors= {'R','O','Y','G','B','I','V'};
		String chaine="ROYGBIV";
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		String result ="";
		int i=0;
		int j=0;
		
			
			//System.out.println(n/7);
           
            for(j=0;j<n/7;j++) {
            	 //  System.out.println(j);
            	result+=chaine;
                
                //System.out.println(result);
            }
            	
            n=n%7;
            if(n>0) {
            	//System.out.println(n);
                if(n>4) {
                	result+=colors[0];
                	result+=colors[1];
                	result+=colors[2];
                	result+=colors[3];
                	//System.out.println(colors[0]+colors[1]+colors[2]+colors[3]);
                	for( i=0;i<n-4;i++) {
                		//System.out.println(result);
                	result+=colors[i+4];
                	}
                }
                else
                {
                	//System.out.println(n);
                	if(n==1) {
                		//for(i=0;i<n;i++)
                    	result+='G';
                    	//result+=colors[2];
                	}
                	
                	else if(n==2) {
                		result+="GB";
                    	//result+=colors[4];
                	}
                		
                	else
                		if(n==3) {
                		result+="YGB";
                		/*result+=colors[3];
                    	result+=colors[4];*/
                    	//result+=colors[2];
                    	
                		}
                		else
                    		if(n==4) {
                    		result+="YGBI";
                    		
                    		}
                }
            }
        
			
		
		System.out.println(result);
		//System.out.println(result.length());
		
	}

}
