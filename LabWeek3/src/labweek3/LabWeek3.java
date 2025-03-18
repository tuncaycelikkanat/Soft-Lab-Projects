
package labweek3;

public class LabWeek3 {
    public static void main(String[] args) {
        
//        MyNode myNode = new MyNode(10);
//        MyNode myNodee = new MyNode(15);
//        MyNode myNode2 = new MyNode(20);
//        
//        System.out.println(myNode.next().next().getData());
//        //System.out.println(myNode2.next());
//        System.out.println(MyNode.head.getData());
//        System.out.println(MyNode.tail.getData());

//        DoubleEndedQueue queue = new DoubleEndedQueue();
//        
//        queue.addLast(15);
//        queue.addLast(55);
//        queue.addLast(79);
//        queue.addFirst(30);
//        queue.removeFirst();
//        queue.getFirst();
//        queue.getLast();
//        
//        System.out.println(queue.isEmpty());
//        
//        try {
//            System.out.println( "Get: " + queue.get(0).next().next().next().getData());
//        } catch (Exception e) {
//            System.out.println("Get: Null");
//        }
//        
//        queue.getHead();
//        queue.getTail();
//        queue.showAll();

        DoubleEndedQueue queue = new DoubleEndedQueue();
        
        System.out.println("Deque empty: " + queue.isEmpty());
        queue.addFirst(10);
        System.out.println("10 added to first");
        queue.showAll();
        System.out.println("");
        
        queue.addLast(20);
        System.out.println("20 added to last");
        queue.showAll();
        System.out.println("");
        
        queue.addFirst(5);
        System.out.println("5 added to first");
        queue.showAll();
        System.out.println("");
        
        queue.addLast(25);
        System.out.println("25 added to last");
        queue.showAll();
        System.out.println("");
        
        queue.getHead();
        queue.getTail();
        System.out.println("");
        
        System.out.println("Removing first...");
        System.out.println("Removed First: " + queue.removeFirst());
        queue.showAll();
        System.out.println("");
        
        System.out.println("Removing last...");
        System.out.println("Removed Last: " + queue.removeLast());
        queue.showAll();
        System.out.println("");
        
        System.out.println("Deque empty: " + queue.isEmpty());
        System.out.println("");

    }
}
