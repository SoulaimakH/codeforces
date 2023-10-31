import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B {

	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	       List<pair> major=new ArrayList();
	       List<pair> tab=new ArrayList();
        StringTokenizer tk;
        tk = new StringTokenizer(in.readLine());
		int t = parseInt(tk.nextToken());
		while(t-->0) {
			
			int distanceAtoM=Integer.MAX_VALUE;
			int distanceBtoM=Integer.MAX_VALUE;
			int distanceAtoN_M=Integer.MAX_VALUE;
			int distanceBtoN_M=Integer.MAX_VALUE;
			
			tk = new StringTokenizer(in.readLine());
			int n = parseInt(tk.nextToken());
			int k = parseInt(tk.nextToken());
			int a = parseInt(tk.nextToken());
			int b = parseInt(tk.nextToken());
			int i=0;
			pair init;
			pair end;
			while(i<k) {
				tk = new StringTokenizer(in.readLine());
				int x = parseInt(tk.nextToken());
				int y = parseInt(tk.nextToken());
				major.add(new pair(x,y));
			i++;}
			
			int j=n-k;
			while(j-->0) {
				tk = new StringTokenizer(in.readLine());
				int x = parseInt(tk.nextToken());
				int y = parseInt(tk.nextToken());
				major.add(new pair(x,y));
			}
			if(a<=k) { init=major.get(a-1);distanceAtoM=0;}else init=tab.get(a-1-k);
			if(b<=k){end=major.get(b-1);distanceBtoM=0;}else end=tab.get(b-1-k);
			
			
			
			
			for(pair p: major) {
				int dA=Math.abs(init.a-p.a)+Math.abs(init.b-p.b);
				distanceAtoM=Math.min(distanceAtoM,dA);
				int dB=Math.abs(end.a-p.a)+Math.abs(end.b-p.b);
				distanceBtoM=Math.min(distanceBtoM,dA);
			}
			
			for(pair p:tab) {
				int dA=Math.abs(init.a-p.a)+Math.abs(init.b-p.b);
				distanceAtoN_M=Math.min(distanceAtoN_M,dA);
				int dB=Math.abs(end.a-p.a)+Math.abs(end.b-p.b);
				distanceBtoN_M=Math.min(distanceBtoN_M,dA);
			}
			
		}

	}

}

class pair  implements Comparable<pair> {
	int a;
	int b;
	//int order;
	public pair(int a,int b) {
        this.a = a;
        this.b = b;
     
       
    }
	@Override
    public String toString() {
        return "Point("+a+","+b+")";
    }
   @Override
    public int compareTo(pair other) {
        if (this.a == other.a && this.b == other.b ) {
            return Integer.compare(this.a, other.a);
        } else {
            return Integer.compare(this.b, other.b);
        }
    }
}
