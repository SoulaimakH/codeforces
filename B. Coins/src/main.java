import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 ArrayList<String> cases = new ArrayList<String>(3);
		//String[] cases = new String[3];
		Scanner scan = new Scanner(System.in);
		cases.add(scan.next()); 
		cases.add(scan.next());
		cases.add(scan.next());
		
		if((cases.contains("A<B") || cases.contains("B>A"))&& (cases.contains("C<B")|| cases.contains("B>C"))) {
			if(cases.contains("C<A") || cases.contains("A>C")) {
				 System.out.println("CAB");
			}
			else if(cases.contains("C>A")|| cases.contains("A<C")) {
				System.out.println("ACB");
			}
			else {
				System.out.println("Impossible");
			}
		}
		else if((cases.contains("B<A") || cases.contains("A>B"))&& (cases.contains("C<A")|| cases.contains("A>C"))) {
			if(cases.contains("C<B") || cases.contains("B>C")) {
				 System.out.println("CBA");
			}
			else if(cases.contains("C>B")|| cases.contains("B<C")) {
				System.out.println("BCA");
			}
			else {
				System.out.println("Impossible");
			}
		}
		
		else if((cases.contains("B<C") || cases.contains("C>B"))&& (cases.contains("A<C")|| cases.contains("C>A"))) {
			if(cases.contains("A<B") || cases.contains("B>A")) {
				 System.out.println("ABC");
			}
			else if(cases.contains("A>B")|| cases.contains("B<A")) {
				System.out.println("BAC");
			}
			else {
				System.out.println("Impossible");
			}
		}
		else {
			System.out.println("Impossible");
		}

	}

}
