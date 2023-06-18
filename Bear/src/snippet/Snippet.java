package snippet;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i=0;
        while(a<=b) {
        	i++;
        	a=a*3;
        	b=b*2;
        }
        System.out.println(i);
	}
}

