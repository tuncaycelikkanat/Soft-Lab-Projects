import java.util.ArrayList;

public class BubbleSort {

    public static void bubbleSort(ArrayList<Integer> list){

        int runTime = 0;

        for (int i = 0; i < list.size(); i++){
            for (int j = 1; j < list.size(); j++){

                if (list.get(j) < list.get(j - 1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
                runTime++;
            }
        }

        for (int item: list){
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("Run Time: " + runTime);
        System.out.println("O(n^2)");
    }

}
