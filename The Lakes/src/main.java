import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		ArrayList<Integer> listeNombres = new ArrayList<Integer>();
		ArrayList<Integer> listesommes = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		while(cases>0) {
			int somme=0;
			int r = scan.nextInt();
			int c=scan.nextInt();
			int[][] matrix = new int[r][c];
			for(int i=0 ; i<r;i++) {
				for(int j=0 ; j<c ; j++) {
					matrix[i][j]=scan.nextInt();
				}
			}
			int i=0;
			int j=0;

						
			for(int i1=0 ; i1<r;i1++) {
				for(int j1=0 ; j1<c ; j1++) {
					
					if(!listeNombres.contains(matrix[i1][j1])) {
						if(matrix[i1][j1]!=0) {
							somme+=matrix[i1][j1];
							listeNombres.add(matrix[i1][j1]);
							
							listeNombres.add(matrix[i1+1][j1]);
							listeNombres.add(matrix[i1][j1+1]);
						}
						
					}
					
					
					}
					
				}
			}
			
			cases -- ;
		}
	}

}
