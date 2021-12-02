import java.util.Scanner;

public class Main{
    
    public static int[] locateLargest(double[][] a) {
        int[] loc = new int[]{0, 0};
        double largest = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (largest < a[i][j]) {
                    largest = a[i][j];
                    loc[0] = i;
                    loc[1] = j;
                }
            }
        }
        return loc;
    }


    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int r = input.nextInt();
        int c = input.nextInt();
        double[][] array = new double[r][c];
        System.out.println("Enter the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        int[] loc = locateLargest(array);
        System.out.printf("The location of the largest element is (%d, %d)%n", loc[0], loc[1]);

    }
    
}
