
package labweek3;

import java.util.ArrayList;
import java.util.List;

public class DoubleEndedQueue {
    
    
    public void addFirst(int input){
        List<MyNode> temp = new ArrayList();
        temp.addAll(MyNode.list);
        MyNode.list.clear();
        new MyNode(input);
        MyNode.list.addAll(temp);
        
//        //Temp
//        MyNode.tail = MyNode.list.get(MyNode.list.size() - 1);
        checkChanges();
    }
    
    //fine
    public void addLast(int input){
        new MyNode(input);
        checkChanges();
    }
    
    public int removeLast(){
        int temp = MyNode.list.get(MyNode.list.size() -1).getData();
        MyNode.list.remove(MyNode.list.size() -1);
        checkChanges();
        return temp;
    }
    
    public int removeFirst(){
        int temp = MyNode.list.get(0).getData();
        MyNode.list.remove(0);
        checkChanges();
        return temp;
//        //Temp
//        MyNode.head = MyNode.list.get(0);
        
    }
    
    public void getFirst(){
        if (!isEmpty()) {
            System.out.println("first: " + MyNode.head.getData());
        } else {
            System.out.println("null");
        }
    }
    
    public void getLast(){
        if (!isEmpty()) {
            System.out.println("last: " + MyNode.tail.getData());
        } else {
            System.out.println("null");            
        }
    } 
    
    //there is null exception
    public MyNode get(int index){
        return MyNode.list.get(index);
    }
    
    public boolean isEmpty(){
        return MyNode.list.isEmpty();
    }
    
    //fine
    public void showAll(){
        System.out.print("Deque = ");
        for (MyNode node: MyNode.list) {
            System.out.print(node.getData() + " ");
        }
        System.out.println("");
    }
    
    public void getHead(){
        if (!MyNode.list.isEmpty()){
            System.out.println("Head: " + MyNode.head.getData());
        } else {
            System.out.println("Head: Null" );
        }
    }
    
    public void getTail(){
        if (!MyNode.list.isEmpty()){
            System.out.println("Tail: " + MyNode.tail.getData());
        } else {
            System.out.println("Tail: Null" );
        }
    }
    
    public void checkChanges(){
        if (MyNode.list.isEmpty()) {
            MyNode.head = null;
            MyNode.tail = null;
        } else {
            MyNode.head = MyNode.list.get(0);
            MyNode.tail = MyNode.list.get(MyNode.list.size() - 1);
        }
    }
    
}
