import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        for (int it = 1; it <= t; it++) {
        	tk = new StringTokenizer(in.readLine());
        	Long x =Long.parseLong(tk.nextToken());
        	int k =Integer.parseInt(tk.nextToken());
        	int sum=0;
        	String v=x+"";
        	if(v.length()>1) {
        		for(int d=0;d<v.length();d++)
        			sum+=  Character.getNumericValue(v.charAt(d));
        	}
        	else sum=Character.getNumericValue(v.charAt(0));
        	int m=sum%k;
        	//int rest=0;
        	if(m>0)
        	{
        		while(sum%k!=0) {
        			x++;
        			 v=x+"";
        			sum=0;
        			for(int d=0;d<v.length();d++)
            			sum+=  Character.getNumericValue(v.charAt(d));
        		}
        	}
        	
        	System.out.println(x);
        }
	}

}
