import java.util.Scanner;
public class ReaganColin02BasicCalculator {

	// Calculator Function
	public static void main(String[] args) {
		
		// Declare Variables
		int number;
		int count = 0;
		double num1;
		double num2;
		double result = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		// Menu Display
		do {
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Generate Random Number");
		System.out.println("6. Quit");
		System.out.println("What would you like to do? ");
		
		// Allows user to input a number for the menu
		number = input.nextInt();
		
		// Calculator Switch Menu
		switch(number) {
		case 1:
			System.out.println("Please enter your first number: ");
			num1 = input.nextInt();
									
			System.out.println("Please enter your second number: ");
			num2 = input.nextInt();
			
			result = num1 + num2;
			System.out.println("Answer: " + result);
			break;
		case 2:
			System.out.println("Please enter your first number: ");
			num1 = input.nextInt();
									
			System.out.println("Please enter your second number: ");
			num2 = input.nextInt();
			
			result = num1 - num2;
			System.out.println("Answer: " + result);
			break;
		case 3:
			System.out.println("Please enter your first number: ");
			num1 = input.nextInt();
									
			System.out.println("Please enter your second number: ");
			num2 = input.nextInt();
			
			result = num1 * num2;
			System.out.println("Answer: " + result);
			break;
		case 4:
			System.out.println("Please enter your first number: ");
			num1 = input.nextInt();
									
			System.out.println("Please enter your second number: ");
			num2 = input.nextInt();
			
			result = num1 / num2;
			
			if (num2 == 0)
			{
				System.out.println("You cannot divide by zero. Please try again.");
			}
			else 
			{
				System.out.println("Answer: " + result);
			}
			break;
		case 5:
			System.out.println("What is the lower limit? ");
			num1 = input.nextInt();
			
			System.out.println("What is the upper limit? ");
			num2 = input.nextInt();
			
			// Generate a random number for case 5
			double randomVal = Math.random();
			double randomNum = (double) (randomVal * num2 + num1);
			
			System.out.println("Here is your random number: " + randomNum);
			break;
		case 6:
			System.out.println("Goodbye!");
			System.exit(number);
		default:
			count++;
			if (count==3) {
				System.out.println("You have ran out of attempts. Try again later.");
				number = 6;
				break;
			}
			else {
			System.out.println("You entered an invalid option, " + number + ". Please try again. ");	
			}	
		}	
	} while (number !=6);
		input.close();
}
}
