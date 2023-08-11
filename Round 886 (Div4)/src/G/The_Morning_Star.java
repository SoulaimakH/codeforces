package G;
import java.util.ArrayList;

import java.util.Scanner;
 
  
public class The_Morning_Star {
 
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
     // Creating an empty HashMap  first time i use map 
       
       
        while (cases > 0) {
        	 int result = 0;
        	 
        	 ArrayList<Point> pointsList = new ArrayList<>();
        	 ArrayList<Point> pointsList0 = new ArrayList<>();
        	int n=scan.nextInt();
        	int a=n;
        	while(n>0) {
        		Point point = new Point(scan.nextInt(),scan.nextInt());
        		pointsList.add(point);
        		pointsList0.add(point);
        	n--;}
        	for(int i=0;i<a;i++) {
        		if(pointsList.get(i).x<1000000000) {
        			Point point = new Point(pointsList.get(i).x+i,pointsList.get(i).y);
        			Point point2 = new Point(-(pointsList.get(i).x+i),pointsList.get(i).y);
        			if(pointsList.contains(point) || pointsList.contains(point2) ){
        				result++;
        			}
        		}
        		else if(pointsList.get(i).x>1000000000) {
        			Point point = new Point(pointsList.get(i).x-i,pointsList.get(i).y);
        			Point point2 = new Point(-(pointsList.get(i).x-i),pointsList.get(i).y);
        			if(pointsList.contains(point) || pointsList.contains(point2) ){
        				result++;
        			}
        		}
        		
        		if(pointsList.get(i).y<1000000000) {
        			Point point = new Point(pointsList.get(i).x,pointsList.get(i).y+i);
        			Point point2 = new Point(pointsList.get(i).x,-(pointsList.get(i).y+i));
        			if(pointsList.contains(point) || pointsList.contains(point2) ){
        				result++;
        			}
        		}
        		else if(pointsList.get(i).y>1000000000) {
        			Point point = new Point(pointsList.get(i).x,pointsList.get(i).y-i);
        			Point point2 = new Point(pointsList.get(i).x,-(pointsList.get(i).y-i));
        			if(pointsList.contains(point) || pointsList.contains(point2) ){
        				result++;
        			}
        		}
        		
        		if(pointsList.get(i).y+pointsList.get(i).x<1000000000) {
        			Point point = new Point(0,pointsList.get(i).y+pointsList.get(i).x+2*i);
        			Point point2 = new Point(-(pointsList.get(i).y+pointsList.get(i).x+2*i),0);
        			if(pointsList.contains(point) || pointsList.contains(point2) ){
        				result++;
        			}
        		}
        		
        		else if(pointsList.get(i).y+pointsList.get(i).x>1000000000) {
        			Point point = new Point(0,pointsList.get(i).y+pointsList.get(i).x-2*i);
        			Point point2 = new Point(-(pointsList.get(i).y+pointsList.get(i).x-2*i),0);
        			if(pointsList.contains(point) || pointsList.contains(point2) ){
        				result++;
        			}
        		}
        		
        	}
//            for(int i=0;i<a;i++) {
//            	for(int j=0;j<a;j++) {
//            		if(j!=i) {
//            			 int nrmX= pointsList.get(j).x-pointsList.get(i).x;
//            			 int nrmY=pointsList.get(j).y-pointsList.get(i).y;
//            			 
//            			// System.out.println("nrm X"+nrmX +" y"+nrmY);
//            			 
//            			 if (nrmX==nrmY || (nrmX==0 || nrmY==0) || (nrmX==-nrmY) ) result++;
//            		}
//            	}
//            }
        
        
        	
            System.out.println(result);
        	cases--;}
 
	}
 
 
	
}
 
class Point {
    int x;
    int y;
 
   public Point(int x, int y) {
       this.x = x;
       this.y = y;
   }
   }