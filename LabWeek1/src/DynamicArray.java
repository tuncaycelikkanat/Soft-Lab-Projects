public class DynamicArray {

    private int size = 0;
    private int[] array;

    public DynamicArray() {
        array = new int[size];
    }

    public void insertion(int item){

        int[] tempArray = new int[size];

        for (int i = 0; i < size; i++){
            tempArray[i] = array[i];
        }
        size++;
        array = new int[size];

        for(int i = 0; i < size - 1; i++){
            array[i] = tempArray[i];
        }
        array[size - 1] = item;
        showAll();
    }

    public void delete(int index){
        try {
            int[] tempArray = new int[size];

            for (int i = 0; i < size; i++){
                tempArray[i] = array[i];
            }
            size--;
            array = new int[size];

            for(int i = 0; i < index; i++){
                array[i] = tempArray[i];
            }
            for(int i = index; i < size; i++){
                array[i] = tempArray[i + 1];
            }
            showAll();

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public int search(int target){
        int index = -1;

        for (int i = 0; i < size; i++){
            if (array[i] == target)
                index = i;
        }
        return index;
    }

    public void showAll(){
        for (int item: array)
            System.out.print(item + " ");
        System.out.println("");
    }

}
