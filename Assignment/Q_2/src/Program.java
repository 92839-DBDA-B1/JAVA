
//2. Accept 2 double values from User (using Scanner). Check data type. If 
//arguments are not doubles, supply suitable error message & terminate. 
//If numbers are double values, print its average.
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1=0;
		double num2=0;
		System.out.print("Enter First Double Value: ");
		if(sc.hasNextDouble())
		{
			num1=sc.nextDouble();
		}
		else {
			System.out.print("You Enter Wrong data type!");
		}
		System.out.println("Enter Second Double value: ");
		if(sc.hasNextDouble()) {
			num2=sc.nextDouble();
		}
		else{
			System.out.println("You Enter Wrong data type!");
		}
		
		double avg=(num1+num2)/2;
		
		System.out.println("Average of two numbers:"+avg);
		
		
	}
}
