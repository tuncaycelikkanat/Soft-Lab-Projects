package labweek5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LabWeek5 {

    public static void main(String[] args) {
        
        ArrayList<Order> orderList = new ArrayList<>();
        
        Random random = new Random();
        
        for(int i = 0; i < 100; i++){
            orderList.add(new Order(random.nextInt(500)));
        }
        
        Order.binarySearch(orderList, 500);
        
        int i = 0;
        for(Order order: orderList){
            System.out.printf("%d. index -> order id: %d, order amount: %d%n", i,order.getId(),order.getAmount());
            i++;
        }
        
        System.out.println("-------------------------------------------------");
        Order.bubbleSort(orderList);
        i = 0;
        for(Order order: orderList){
            System.out.printf("%d. index -> order id: %d, order amount: %d%n", i,order.getId(),order.getAmount());
            i++;
        }
        
        int found = Order.linearSearch(orderList, 40);
        if (found != -1)
            System.out.printf("Target found on %d. index.%n",found);
        else
            System.out.println("Not found");
        
        
        Collections.shuffle(orderList);
        Order.selectionSort(orderList);
        System.out.println("-------------------------------------------------");
        
        i = 0;
        for(Order order: orderList){
            System.out.printf("%d. index -> order id: %d, order amount: %d%n", i,order.getId(),order.getAmount());
            i++;
        }
        

        
    }
}
