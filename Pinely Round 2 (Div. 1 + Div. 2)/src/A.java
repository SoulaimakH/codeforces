import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        int cases=sc.nextInt();
        while(cases>0){

            int n=sc.nextInt();
            int a=sc.nextInt();
            int c=sc.nextInt();

            String s=sc.next();

            int count=a;
            int p=a;

            boolean an=false;

            if(a==n)
            	an=true;

            for(int i=0;i<c;i++){
                if(s.charAt(i)=='+') {
                    count++;
                    p++;
                    if(count>=n)
                    	an=true;
                }else
                    count--;
            }

            if(p>=n){
                if(an)
                System.out.println("YES");
                else
                    System.out.println("MAYBE");
            }else{
                System.out.println("NO");
            }
            cases--;
        }
    }
}
