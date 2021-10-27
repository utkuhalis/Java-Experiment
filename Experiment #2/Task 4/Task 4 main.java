import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		
		while(true){
		    System.out.print("Number:");
    		int n = input.nextInt();
    		
    		if (n > 9 || n < -9) {
    		    int lastDigit = n % 10;
    		    int firstDigit = 0;
    		    
    		    while(n != 0) {
                    firstDigit = n % 10;
                    n = n / 10;
                }
                
                System.out.println(firstDigit + " + " + lastDigit + " = " + (firstDigit + lastDigit));
    		}else{
    		    System.out.println("Please write number of 2 digit or more");
    		}
		}
    }
}