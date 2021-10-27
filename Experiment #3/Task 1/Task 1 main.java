import java.util.Scanner;

public class Main
{
    public static String sumDigits(int n) {
        int total = 0;
        String exp = "";
        
        while (n != 0) {
            if (n / 10 == 0) {
                exp += n % 10;
            }else{
                exp += n % 10 + " + ";
            }
            
            total += n % 10;
            n /= 10;
        }
        
        return exp + " = " + total;
    }
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		while (true){
		    System.out.print("N:");
    		int n = input.nextInt();
    		System.out.println(sumDigits(n));
		}
	}
}
