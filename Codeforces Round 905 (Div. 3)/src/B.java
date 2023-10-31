import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        
        
        for (int it = 1; it <= t; it++) {
        	tk = new StringTokenizer(in.readLine());
        	int n =Integer.parseInt(tk.nextToken());
        	int k =Integer.parseInt(tk.nextToken());
        	tk = new StringTokenizer(in.readLine());
        	String s=tk.nextToken();
        	int l=n-k;
        	String left="";
        	String right="";
        	
        	if(n==1 || l==1)System.out.println("YES");
        	else if(n>1) {
        		for(int d=0;d<s.length();d++) {
            		int occurrences = countOccurrences(s, s.charAt(d));
            		//System.out.println(occurrences);
            		//System.out.println(s.charAt(d));
            		if(occurrences%2==0) {
            			int r=0;
            			while(r<occurrences/2) {
            				
            				left+=s.charAt(d);
            				
                			right+=String.valueOf(s.charAt(d));
            			r++;}
            			
            			s=s.replaceAll(String.valueOf(s.charAt(d)),"");
            		}
            		else {
            			int r=0;
            			while(r<(occurrences)/2) {
            				left+=s.charAt(d);
            				
                			right+=String.valueOf(s.charAt(d));
                			s=s.replaceFirst(String.valueOf(s.charAt(d)),"");
                			s=s.replaceFirst(String.valueOf(s.charAt(d)),"");
            			r++;}
            			//char c=s.charAt(d);
            			//s=s.replaceAll(String.valueOf(s.charAt(d)),"");
            			//s+=c;
            		}
            		//System.out.println("s="+s);
            		//System.out.println("rs= "+left+right);
            		//System.out.println((left.length()+right.length()));
            		if((left.length()+right.length())>=l)break;
            	}
        		int rs=left.length()+right.length();
        		//System.out.println(left+right);
        		if(rs==l) {
        			System.out.println("YES");
        		}
        		else if(rs==l-1 && rs>1 && (s.length()>0))
        			System.out.println("YES");
        		else if(rs-1==l && (s.length()>0)) System.out.println("YES");
        		else System.out.println("NO");
        		//System.out.println();
        	}
        	
        	else {
        		System.out.println("YES");
        	}
        	
        	
        	
        	
        }

	}

	public static int countOccurrences(String input, char targetChar) {
        int count = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }
        
        return count;
    }
}
