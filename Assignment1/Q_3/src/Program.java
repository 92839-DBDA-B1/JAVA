
//3. Display food menu to user. User will select items from menu along with the 
//quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed 
//prices to food items(hard code the prices)  When user enters 'Generate Bill' 
//option , display total bill & exit.

//1)Dosa=10
//2)Samosa=20
//3)Idli=20
//4)Poha=35
//5)Upma=20
//6)Appe=30
//7)Patise=40
//8)Paratha=20
//9)Sprouts=25
//10)thali=100

import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String op;
		double Dosa=10;
		double Samosa=20;
		double Idli=20;
		double Poha=35;
		double Upma=20;
		double Appe=30;
		double Patise=40;
		double Paratha=20;
		double Sprouts=25;
		double thali=100;
		double totalBill=0;
		
	
		do {
			System.out.println("Enter Which Menu you want to add \n 1)Dosa=10\r\n"
					+ "2)Samosa=20\r\n"
					+ "3)Idli=20\r\n"
					+ "4)Poha=35\r\n"
					+ "5)Upma=20\r\n"
					+ "6)Appe=30\r\n"
					+ "7)Patise=40\r\n"
					+ "8)Paratha=20\r\n"
					+ "9)Sprouts=25\r\n"
					+ "10)thali=100\r\n"
					+ "11)Calculate total bill\r\n"
					);
			System.out.println("Enter your choice:");
			int num=sc.nextInt();
			
			if(num>=1 && num<=10) {
				System.out.print("Enter quantity:");
				int qut=sc.nextInt();
				switch(num) {
				case 1:
					totalBill+=Dosa*qut;
					break;
				case 2:
					totalBill+=Samosa*qut;
					break;
				case 3:
					totalBill+=Idli*qut;
					break;
				case 4:
					totalBill+=Poha*qut;
					break;
				case 5:
					totalBill+=Upma*qut;
					break;
				case 6:
					totalBill+=Appe*qut;
					break;
				case 7:
					totalBill+=Patise*qut;
					break;
				case 8:
					totalBill+=Paratha*qut;
					break;
				case 9:
					totalBill+=Sprouts*qut;
					break;
				case 10:
					totalBill+=thali*qut;
					break;
				}
			}
			else if(num==11) {
				System.out.println("Total Bill:"+totalBill);
				break;
			}
			}while(true);

		
	}
}
