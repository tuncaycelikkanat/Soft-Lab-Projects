package labweek7;
import java.util.ArrayList;
public class LabWeek7 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("VIP_John");
        list.add("Carol");
        list.add("Erdemhan");
        list.add("VIP_Lisa");
        list.add("VIP_Mike");
        list.add("Tuncay");
        
        RideLine rideLine = new RideLine();
        System.out.println("PROCESSED:");
        rideLine.manageRideLine(list, 4);
        System.out.println("");
        System.out.println("RE-PROCESSING STACK:");
        rideLine.printStack();
        
    }
    
}
