/* -------------------THIS IS THE CODE FOR IN-BUILT VALUES-------------------------------
public class Markscalculator {
    public static void main(String[] args) {  
        int a=96;
        int b=88;
        int c=95;
        int d=87;
        int e=90;
        int f=81;
        double div= (a+b+c+d+e+f)/600d;
        double percent= div*100d;
        System.out.println("The percentage of student is: "+ percent + "%");
    }
}*/

//----------------------THIS IS THE CODE FOR VALUES FROM USER-------------------------
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st subject mark: ");
		int mark= sc.nextInt();
			System.out.print("Enter 2nd subject mark: ");
		int mark2= sc.nextInt();
			System.out.print("Enter 3rd subject mark: ");
		int mark3= sc.nextInt();
			System.out.print("Enter 4th subject mark: ");
		int mark4= sc.nextInt();
			System.out.print("Enter 5th subject mark: ");
		int mark5= sc.nextInt();
		double percent= (mark+mark2+mark3+mark4+mark5)*100/500d;
		System.out.println("Percentage of Marks is: "+percent+"%");
	}
}
