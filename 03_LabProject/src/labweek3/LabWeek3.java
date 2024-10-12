package labweek3;

import java.util.Scanner;

public class LabWeek3 {

    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);

        System.out.print("Please enter the size of array: ");
        int arraySize = keyb.nextInt();
        System.out.println("----------------------------------");        
        int[] inputNumbers = new int[arraySize];
        
        System.out.printf("Please enter %d item(s) of array: %n", arraySize);
        
        for (int i = 0; i < arraySize; i++) {
            inputNumbers[i] = keyb.nextInt();
        }
        System.out.println("----------------------------------");
        
        System.out.printf("Entered items: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(inputNumbers[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------------------");
        
        System.out.print("Search for an item: ");
        int searchedItem = keyb.nextInt();
        
        boolean isFound = false;
        for (int i = 0; i < arraySize; i++) {
            if (inputNumbers[i] == searchedItem) {
                System.out.printf("Item found at \"%d\" index.%n",i);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.print("Your item is not in the array. Check your item for searching.%n");
        }
        
        for (int i = 0; i < arraySize - 1; i++) {
            
            for (int j = 0; j < arraySize - 1; j++) {
                if (inputNumbers[j] > inputNumbers[j + 1]) {
                    int temp = inputNumbers[j];
                    inputNumbers[j] = inputNumbers[j+1];
                    inputNumbers[j+1] = temp;   
                }
            }    
        }
        
        System.out.println("----------------------------------");
   
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(inputNumbers[i] + " ");
        }
  
    }
    
}
