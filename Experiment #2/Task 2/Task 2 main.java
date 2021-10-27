import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Month:");
		int month = input.nextInt();

		long[] totalRabbit = new long[month+1];
		long[] rabit = new long[month];
		rabit[0] = 1;
		totalRabbit[1] = 1;
		
		for(int currentMonth=2; currentMonth<=month; currentMonth++){	
			long[] birthRabbit = new long[month];
			
			for(int birth = 1; birth < month; birth++){
				birthRabbit[birth] = rabit[birth-1];
				birthRabbit[0] += rabit[birth];
			}
					
			for(int birth2 = 0; birth2 < month; birth2++){
				rabit[birth2] = birthRabbit[birth2];
				totalRabbit[currentMonth] += rabit[birth2];
			}
		}
		
		System.out.println("Total " + totalRabbit[month] + " rabbit.");
		
	}
}