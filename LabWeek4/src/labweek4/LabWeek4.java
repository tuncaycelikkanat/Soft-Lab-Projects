
package labweek4;
public class LabWeek4 {
    public static void main(String[] args) {
       
        
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insertion(10);
        tree.insertion(5);
        tree.insertion(20);
        tree.insertion(7);
        tree.insertion(15);
        tree.insertion(3);
        tree.deletion(3);
        
        try {
            System.out.println("Found: " + tree.search(3).getData());            
        } catch (Exception e) {
            System.out.println("Not Found.");
        }
        
        tree.inorder();
        tree.preorder();
        tree.postorder();
        
//        tree.insertion(15);
//        
//        System.out.println("root: " + tree.getRoot().getData());
//        System.out.println("root.left: " + tree.getRoot().getLeft().getData());
//        System.out.println("root.left.right: " + tree.getRoot().getLeft().getRight().getData());
//        
//        System.out.println("root.right: " + tree.getRoot().getRight().getData());
        System.out.println("root.left.right: " + tree.getRoot().getLeft().getRight().getData());


    }  
}
