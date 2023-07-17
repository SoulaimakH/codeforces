import java.util.Scanner;

public class secondsolution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number = scan.next();

		if(number.length()<2) {
			 System.out.println(0);
		}else {
		
			int value=11;//Integer.parseInt(number);
			//System.out.println(value);
			int result=0;
			while(value>=10) {
				value=0;
				for(int i=0;i<number.length();i++) {
			
					value+=Integer.parseInt(String.valueOf(number.charAt(i)));
				}
				number=value+"";
				//System.out.println("new "+number);
				result++;
			}
			 System.out.println(result);
		}
		
	}

}
