import java.util.Scanner;  

public class main{

     public static void main(String []args){
    	  Scanner scan = new Scanner(System.in);

          int n = scan.nextInt();
           scan.nextLine();
          String S = scan.nextLine();
          int A=0 ;
          int D=0 ;
          for(int i=0; i<S.length(); i++) {
              if(S.charAt(i)=='A')
                  A++;
              else if(S.charAt(i)=='D')
                  D++;
          }
          if(A>D)
              System.out.println("Anton");
          else if(D>A)
              System.out.println("Danik");
          else
              System.out.println("Friendship");
     }
}