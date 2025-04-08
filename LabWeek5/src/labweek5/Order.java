package labweek5;

import java.util.ArrayList;

public class Order {
    
    private int id;
    private static int nextId = 0;
    private int amount;

    public Order(int amount) {
        nextId++;
        id = nextId;

        this.amount = amount;
    }
    
    //Ok
    public static int linearSearch(ArrayList<Order> list, int target){
        long firstTime = System.nanoTime();
        
        int found = -1;
        for (int i = 0; i < list.size(); i++) {
            if (target == list.get(i).id) {
                found = i;
            }
        }
        
        long lastTime = System.nanoTime();
        System.out.println("Time Spent(Linear Search): " + (lastTime - firstTime)/ 1000 + " ms.");
        return found;
    }
    
    public static void binarySearch(ArrayList<Order> list, int target){  
        long firstTime = System.nanoTime();
        
        int left = 0;
        int right = list.size() - 1;
        int mid;


        while (left <= right) {
            mid = (left + right) / 2;

            if (list.get(mid).id == target) {
                System.out.println("Found at index: " + mid);
                break;
            }

            if (list.get(mid).id < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        long lastTime = System.nanoTime();
        System.out.println("Time Spent(Binary Search): " + (lastTime - firstTime)/ 1000 + " ms.");
    }
    
    //Ok
    public static void bubbleSort(ArrayList<Order> list){
        long firstTime = System.nanoTime();
        
        boolean exchange = true;
        
        while(exchange){
            exchange = false;

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).amount > list.get(i + 1).amount) {
                    
                    Order temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    
                    exchange = true;
                }
            }
        }
        
        long lastTime = System.nanoTime();
        System.out.println("Time Spent(Bubble Sort): " + (lastTime - firstTime)/ 1000 + " ms.");
    }
    
    //Ok
    public static void selectionSort(ArrayList<Order> list){
        long firstTime = System.nanoTime();
        
        for (int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i).getAmount();
            int pos = i;
            
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).amount < min) {
                    
                    min = list.get(j).amount;
                    pos = j;
                }
            }
            
            if (pos != i) {
                
                Order temp = list.get(i);
                list.set(i, list.get(pos));
                list.set(pos, temp);
            }
        }
        
        long lastTime = System.nanoTime();
        System.out.println("Time Spent (Selection Sort): " + (lastTime - firstTime)/ 1000 + " ms.");
    }
    
    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }
}