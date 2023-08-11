import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases =scan.nextInt();
		String word ="";
		int i=0;
		int j=0;
		String output="";
		//String[] words=new String[cases];
		while(i<cases) {
			output="";
			for(j=0;j<8;j++) {
				word=scan.next();
				word=word.replace(".","");
				if(word!="")
				{
					output+=word;
					
				}
			}
			 System.out.println(output);
			i++;}
		
		
	}

}
