import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int max=0;
		int nbr=0;
        while(a>0) {
        String s=scan.next();
        
        if(s.contains("0")) nbr++;
        else nbr=0;
        max =Math.max(max, nbr);
        a--;}
        System.out.println(max);
	}

}
