import java.util.Scanner;

public class Main
{
    public static int reverse(int n) {
        String exp = "";
        
        while (n != 0) {
            exp += n % 10;
            n /= 10;
        }
        
        return Integer.parseInt(exp);
    }
    
    public static boolean isPalindrome(int n) {
        if (n == reverse(n)) {
            return true;
        }else{
            return false;
        }
    }
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		while (true){
		    System.out.print("N:");
    		int n = input.nextInt();
    		System.out.println("Reverse: " + reverse(n));
    		System.out.println("Palindrome: " + isPalindrome(n));
		}
	}
}
