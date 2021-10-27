import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		System.out.print("N:");
		int n = input.nextInt();
		
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }
            int C = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}