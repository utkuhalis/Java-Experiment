import java.util.Scanner;

public class Main{
    
    public final static int SIZE = 10;
    
    public static int[] eliminateDuplicates(int[] list){
        int[] newArr = new int[SIZE];
        int arrPosition = 0;
        
        for (int i=0; i<SIZE; i++){
            boolean have = false;
            
            for (int j=0; j<SIZE; j++){
                if (list[i] == newArr[j]) {
                    have = true;
                    break;
                }
            }
            
            if (have == false) {
                newArr[arrPosition] = list[i];
                arrPosition++;
            }
        }
        return newArr;
    }

    public static void main(String []args){
        int[] arr = new int[SIZE];
        int[] newArr = new int[SIZE];
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter ten numbers: ");
        for (int i=0; i<SIZE; i++){
            arr[i] = input.nextInt();
        }
        
        newArr = eliminateDuplicates(arr);
        
        System.out.print("The distinct numbers are: ");
        for (int i=0; i<SIZE; i++){
            if (newArr[i] != 0) {
                System.out.print(newArr[i] + " ");
            }
        }

    }
    
}
