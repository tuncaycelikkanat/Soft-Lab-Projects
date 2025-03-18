import java.util.ArrayList;

public class SelectionSort {

    public static void selectionSort(ArrayList<Integer> list){
        int runTime = 0;
        ArrayList<Integer> newList = new ArrayList<>(list.size());

        for (int item: list){
            newList.add(item);
        }

        for (int i = 0; i < list.size(); i++){
            int index = i;

            for (int j= i; j < list.size();j++){
                if (list.get(j) < list.get(index)){
                    index = j;
                }
                runTime++;
            }

            newList.set(i,list.get(index));

            int x = list.get(index);
            list.set(index, list.get(i));
            list.set(i, x);

        }

        for (int item: newList)
            System.out.print(item + " ");

        System.out.println("\nO(n^2)");
        System.out.println("Run Time: " + runTime);
    }
}
