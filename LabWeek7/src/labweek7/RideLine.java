package labweek7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RideLine {
    
    private Queue<String> queue;
    private Stack<String> stack;

    public RideLine() {
        queue = new LinkedList<>();
        stack = new Stack<>();
    }
    
    public void manageRideLine(ArrayList<String> list, int capacity){
        int remainigCapacity = capacity;
        
        for (String item: list) {
            if (remainigCapacity > 0) {
                queue.add(item);
                System.out.printf("%s approved.%n", item);
                remainigCapacity--;
            }
            else {
                if (item.startsWith("VIP_")) {
                    stack.add(item);
                    System.out.printf("%s pushed to stack.%n", item);
                } else {
                    System.out.printf("%s rejected.%n", item);
                }
            }
        }
        
    }   
    
    public void printStack(){
        for (int i = 0; i <= stack.size(); i++) {
            System.out.println(stack.pop());
        }
    }
}
