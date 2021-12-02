import java.util.Scanner;

public class Main{
    
    public static int[] merge(int[] list1, int[] list2)  {
        int[] list3 = new int[list1.length + list2.length];
        
        for (int i = 0; i < list1.length; i++){
            list3[i] = list1[i];   
        }

		for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
			list3[j] = list2[i];	
		}
		
		for (int i = 0; i < list3.length - 1; i++) {
			int arrMin = list3[i];
			int arrMinI = i;

			for (int j = i + 1; j < list3.length; j++) {
				if (list3[j] < arrMin) {
					arrMin = list3[j];
					arrMinI = j; 
				}					
			}

			if (arrMinI != i) {
				list3[arrMinI] = list3[i];
				list3[i] = arrMin;
			}
		}

		return list3;
    }

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter list1: ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter list2: ");
		int[] list2 = new int[input.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		
		int[] list3 = merge(list1, list2);
		
		System.out.print("The merged list is");
		for (int i = 0; i < list3.length; i++) {
			System.out.print(" " + list3[i]); 
		}

    }
    
}
