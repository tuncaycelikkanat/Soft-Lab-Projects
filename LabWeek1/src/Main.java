import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DynamicArray myArray = new DynamicArray();
        myArray.insertion(10);
        myArray.insertion(5);
        myArray.insertion(12);
        myArray.insertion(20);

        System.out.println("----------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(1);
        list.add(7);
        list.add(11);

        BubbleSort.bubbleSort(list);
        System.out.println("----------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(12);
        list2.add(1);
        list2.add(7);
        list2.add(11);

        SelectionSort.selectionSort(list2);

    }
}