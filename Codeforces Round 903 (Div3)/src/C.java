import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C {

	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;

        int t = Integer.parseInt(in.readLine().trim());
        for (int it = 1; it <= t; it++) {
        	tk = new StringTokenizer(in.readLine());
        	int n=parseInt(tk.nextToken());
        	String[] tab=new String[n];
        	String[] tab2=new String[n];
        	for(int i=0;i<n;i++) {
        		tk = new StringTokenizer(in.readLine());
        		tab[i]=tk.nextToken();
        		
        		for(int j=0;j<n;j++) {
        			if(tab2[j]==null)tab2[j]="";
        			tab2[j]=tab[i].charAt(j)+tab2[j];
        		}
        		
        	}
        	int c=0;
        	for(int i=0;i<n;i++) {
        		if(!tab[i].equals(tab2[i])) {
        			for(int k=0;k<n;k++) {
        				if(tab[i].charAt(k)!=tab2[i].charAt(k)) {
        					if(tab[i].charAt(k)>tab2[i].charAt(k))
        					{
        						if(tab[i].charAt(k)!='z') {
        							tab2[k]=replaceCharAt(tab2[k],k,tab[i].charAt(k));
        							c+=tab[i].charAt(k)-tab2[i].charAt(k);
        						}
        							
        					}else {
        						if(tab2[i].charAt(k)!='z') {
        							c+=tab2[i].charAt(k)-tab[i].charAt(k);
        							tab[k]=replaceCharAt(tab[k],k,tab2[i].charAt(k));
        						}
        							
        					}
        					
        				}
        			}
        			//tab[i]=tab2[i];
        		}
        	}
        	System.out.println(c);
        	//System.out.println(Arrays.toString(tab));
        	//System.out.println(Arrays.toString(tab2));
        }

	}

	public static String replaceCharAt(String str, int index, char replacement) {
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));
        charArray[index] = replacement;
        System.out.println(Arrays.toString(charArray)); 
        return new String(charArray);
    }
}
