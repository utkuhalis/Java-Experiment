import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double c1 = userInput.nextDouble();
		double c2 = userInput.nextDouble();

		boolean withinRectangle = (Math.pow(Math.pow(c1, 2), 0.5) <= 10 / 2 ) || (Math.pow(Math.pow(c2, 2), 0.5) <= 5.0 / 2);
		System.out.println("Point (" + c1 + ", "+ c2 + ") is " + ((withinRectangle) ? "in " : "not in ") + "the rectangle"); 
	}
}