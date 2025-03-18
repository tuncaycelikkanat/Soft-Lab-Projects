
package labweek3;

import java.util.ArrayList;
import java.util.List;

public class MyNode {
    
    private int data;
    static MyNode head;
    static MyNode tail;
    
    static List<MyNode> list = new ArrayList();

    public MyNode(int data) {
        this.data = data;
        list.add(this);
        
//        if (list.isEmpty()) {
//            head = this;
//            tail = this;
//        } else {
//            head = list.get(0);
//            tail = list.get(list.size() - 1);
//        }
    }
    
    public MyNode next(){
        if (list.indexOf(this) == list.size() - 1) {
            return null;
        } else {
            return list.get(list.indexOf(this) + 1);
        }
    }

    public int getData() {
        return this.data;
    }
}
