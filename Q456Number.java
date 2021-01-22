package Assignment4;
import java.util.InputMismatchException;
import java.util.Scanner;


class NumberGreaterThanLimit extends Exception{
	private static final long serialVersionUID = 1L;

	NumberGreaterThanLimit(String s){
		super(s);
	}
}

public class Q456Number {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int globalLimit = 0;
		while(true) {
			System.out.println("Enter the number. -1 if you want to quit");
			try {
				int num = obj.nextInt();
				if(num == -1)
					break;
				System.out.println("Enter the limit");
				int limit = obj.nextInt();
				globalLimit = limit;
				
				if(num > limit) {
					throw new NumberGreaterThanLimit("");
				}
				
				if(num%2==0)
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			}
			
			catch(InputMismatchException e) {
				obj.next();
				System.out.println("You must enter an Integer");
				
			}
			
			catch(NumberGreaterThanLimit e) {
				System.out.println("Number cant be greater than "+globalLimit);
			}
			
			catch(Exception e) {
				System.out.println("Number cant be greater than 100");
			}
			
		}
		obj.close();
	}
}
