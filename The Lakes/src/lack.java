import java.util.ArrayList;
import java.util.Scanner;

public class lack {
	 ArrayList<Integer> listeNombres = new ArrayList<Integer>();
	
	 static boolean isValide(int i,int j,int r,int c,int[][] matrix,boolean[][] parcourirMatrix) {

		 if(i>=0 && i<r && j>=0 && j<c) 

		 {return matrix[i][j]!=0 && !parcourirMatrix[i][j];}
			
		    else 
		        return false;
	 }
		static int[] ro = {-1, 1, 0, 0};
		static int[] co = {0, 0, -1, 1};
	static int sommeMatrix(int i,int j,int r,int c,int[][] matrix,boolean[][] parcourirMatrix)
	{
		int somme=matrix[i][j];
	

	    for(int k=0; k<4;k++) {
	    
	    		if(isValide(i+ro[k],j+co[k],r,c,matrix,parcourirMatrix)) {
	    			parcourirMatrix[i+ro[k]][j+co[k]]=true;
	    	    		somme+=sommeMatrix(i+ro[k],j+co[k],r,c,matrix,parcourirMatrix);
	    			
	    		}
	   
	    }
		return somme;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		while(cases>0) {

			int r = scan.nextInt();
			int c=scan.nextInt();
			int max=0;
			int somme=0;
			int[][]  matrix = new int[r][c];
			boolean[][] parcourirMatrix = new boolean[r][c];
			for(int i=0 ; i<r;i++) {
				for(int j=0 ; j<c ; j++) {
					matrix[i][j]=scan.nextInt();
					parcourirMatrix[i][j]=false;
				}
			}
			for(int i=0; i<r;i++) {
				for(int j=0;j<c;j++) {
					
					if(parcourirMatrix[i][j]==false &&  matrix[i][j]!=0) {	
						parcourirMatrix[i][j]=true;
						
						somme=sommeMatrix(i,j,r,c,matrix,parcourirMatrix);
						
						if(somme>max)
							max=somme;

					}
				    
					
				}
			}
					
					
			System.out.println(max);		
			cases--;
		}

	}

}
