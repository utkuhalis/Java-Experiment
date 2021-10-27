import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = userInput.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double montlyInterestRate = userInput.nextDouble();
		
		montlyInterestRate /= 1200;
		
		System.out.print("Enter number of years: ");
		int numberOfYears = userInput.nextInt();

		double fiVal = investmentAmount * Math.pow(1 + montlyInterestRate, numberOfYears * 12);

		System.out.println("Accumulated value is $" + fiVal);
	}
}