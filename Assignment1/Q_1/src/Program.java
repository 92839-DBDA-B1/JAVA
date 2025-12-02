

//1. Accept a integer number and when the program is executed print the 
//binary, octal and hexadecimal equivalent of the given number. 
//Sample Output: 
//java Test 
//Enter Number : 20 
//Given Number :20 
//Binary equivalent :10100 
//Octal equivalent :24 
//Hexadecimal equivalent :14 
//Hint : toBinaryString() , toOctalString(), toHexString()

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Integer number: ");
	int num=sc.nextInt();
	
	
	String binary=Integer.toBinaryString(num);
	System.out.println("Binary:"+binary);
	
	String octal=Integer.toOctalString(num);
	System.out.println("Octal: "+octal);
	
	String hexa=Integer.toHexString(num);
	System.out.println("Hexadecimal:"+hexa);
	
	sc.close();
	}
	
}