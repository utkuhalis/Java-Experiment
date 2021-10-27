import java.util.Scanner;

public class Main
{
    public static String isHappyNumber(int n) {
		int total = 0;
		while (n != 0){
            total += n%10 * n%10;
            n /= 10;
        }
        
        int total2 = 0;
        while (total != 0){
            System.out.println(total);
            
            total2 += total%10 * total%10;
            total /= 10;
        }
        
        return (total2 == 1 ? "Happy Number" : "Not Happy Number");
    }
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		while (true){
		    System.out.print("N:");
    		int n = input.nextInt();
    		System.out.println(n + ": " + isHappyNumber(n));
		}
	}
}
