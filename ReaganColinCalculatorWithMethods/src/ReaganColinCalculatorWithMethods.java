import java.util.Scanner;
public class ReaganColinCalculatorWithMethods {
	
	// Calculator Function
	public static void main(String[] args) {
		
		// Declare Variables
		int number;
		int count = 0;
		double Operand1, Operand2;
		double lowerLimit, upperLimit;
		double result;
		
		Scanner input = new Scanner(System.in);
		
		// Menu Display
		do {
		getMenuOption();
		// Allows user to input a number for the menu
		number = input.nextInt();
		
		// Calculator Switch Menu
		switch(number) {
		case 1:
			Operand1 = getOperand("Please enter your first number: ");
			Operand2 = getOperand("Please enter your second number: ");
			result = add(Operand1, Operand2);
			break;
		case 2:
			Operand1 = getOperand("Please enter your first number: ");
			Operand2 = getOperand("Please enter your second number: ");
			result = subtract(Operand1, Operand2);
			break;
		case 3:
			Operand1 = getOperand("Please enter your first number: ");
			Operand2 = getOperand("Please enter your second number: ");
			result = multiply(Operand1, Operand2);
			break;
		case 4:
			Operand1 = getOperand("Please enter your first number: ");
			Operand2 = getOperand("Please enter your second number: ");
			result = divide(Operand1, Operand2);
			break;
		case 5:
			
			lowerLimit = getOperand("What is the lower limit? ");
			upperLimit = getOperand("What is the upper limit? ");
			System.out.println("Here is your random number: " + random(lowerLimit, upperLimit));
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
	
	// Method for displaying the menu
	public static int getMenuOption()
	{
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Generate Random Number");
		System.out.println("6. Quit");
		System.out.println("What would you like to do? ");
		return 0;
	}
	
	// Method for retrieving user input for operands
	public static double getOperand(String prompt)
	{
		System.out.println(prompt);
		Scanner operand = new Scanner(System.in);
		return operand.nextDouble();
	}
	
	// Method for adding operands
	public static double add(double Operand1, double Operand2)
	{
		double result = Operand1 + Operand2;
		System.out.println("Answer: " + result);
		return result;
	}
	
	// Method for subtracting operands
	public static double subtract(double Operand1, double Operand2)
	{
		double result = Operand1 - Operand2;
		System.out.println("Answer: " + result);
		return result;
	}
	
	// Method for multiplying operands
	public static double multiply(double Operand1, double Operand2)
	{
		double result = Operand1 * Operand2;
		System.out.println("Answer: " + result);
		return result;
	}
	
	// Method for dividing operands
	public static double divide(double Operand1, double Operand2)
	{
		double result = Operand1 / Operand2;
		if (Operand2 == 0)
		{
			System.out.println("You cannot divide by zero. Please try again.");
		}
		else 
		{
			System.out.println("Answer: " + result);
		}
		return result;
	}
	
	// Method for random generation of numbers
	public static double random(double lowerLimit, double upperLimit)
	{
		// Generate a random number for case 5
		double randomVal = lowerLimit + (upperLimit - lowerLimit) * Math.random();
					
		return randomVal;
	}
}

