package labweek4;
public class MyBinarySearchTree {
    
    private MyNode root;
    private int size = 0;
    
    public boolean insertion(int input){
        MyNode node = new MyNode(input);            
       
        if (size == 0) {
            root = node;
            size++;
            
            //System.out.println("inserted as root");
            return true;
        }
        
        MyNode current = root;
        MyNode parent = root;
//        System.out.println("current: " + current.data);
        
        while(current != null){
            
            if (input > current.data) {
//                System.out.println("current: " + current.data);
                parent = current;
                current = current.right;
                
            } else if (input < current.data){
//                System.out.println("current: " + current.data);
                parent = current;
                current = current.left;
                
            } else {
                System.out.println("Duplicated item");
                break;
            }
            
        }
        
        
        if (input > parent.data) {
            parent.right = node;
            size++;
            
//            System.out.println("inserted to the right");
            return true;
            
        } else if ( input < parent.data){
            parent.left = node;
            size++;
            
//            System.out.println("inserted to the left");
            return true;
        } else {
            return false;
        }
        
        
    }
    
    public void deletion(int target){
        MyNode parent = searchForParent(target);
        MyNode current = search(target);
        
        if (parent == null || current == null) {
            
        } else {
            
            //if it is leaf -- OK
            if (current.right == null && current.left == null) {
                
                if (current.data > parent.data) {
                    parent.right = null;
                } else if (current.data < parent.data){
                    parent.left = null;
                }
                
            }
            
            //if it is root
            if (parent == root) {
                System.out.println("Root deletion has not supported yet.");
                return;
            }
            
            // if left full, right empty -- OK
            if (current.right == null && current.left != null) {
                parent.right = current.left;               
            }
            
            // if left empty, right null -- OK
            if (current.right != null && current.left == null) {              
                parent.left = current.right;
            }
            
            //if both of them full
            if (current.right != null && current.left != null) {
                parent.left = current.left;
                current.left.right = current.right;
            }     
        }  
        
    }
    
    public void inorder(){
        System.out.println("inprder: ");
        inorderHelper(root);
        System.out.println("");
    }
    
    public void inorderHelper(MyNode root){
        
        if (root != null) {
            inorderHelper(root.left);
            System.out.print(root.data + " ");
            inorderHelper(root.right);
        }
    }
    
    public void preorder(){
        System.out.println("preorder: ");
        preorderHelper(root);
        System.out.println("");
    }
    
    public void preorderHelper(MyNode root){
        if (root != null) {
            System.out.print(root.data + " ");
            inorderHelper(root.left);
            inorderHelper(root.right);
        }
    }
    
    public void postorder(){
        System.out.println("postorder: ");
        postorderHelper(root);
        System.out.println("");
    }
    
    public void postorderHelper(MyNode root){
        if (root != null) {
            inorderHelper(root.left);
            inorderHelper(root.right);
            System.out.print(root.data + " ");
        }
    }
    
    
    
    
    public MyNode search(int target){
        
        MyNode current = root;
        MyNode parent = root;
        
        while(current != null){
            
            if (target > current.data) {
//                System.out.println("current: " + current.data);
                parent = current;
                current = current.right;
                
            } else if (target < current.data){
//                System.out.println("current: " + current.data);
                parent = current;
                current = current.left;
                
            } else if (target == current.data){
//                System.out.println("Found: " + current.data + "\nParent: " + parent.data);
                break;
            } else {
                System.out.println("Not Found");
                break;
            }
            
        }
        
        if (current == null) {
//            System.out.println("null");
            return null;
        } else {
//            System.out.println("Returned: " + current.data);
            return current; 
        }
        
    }

    public MyNode searchForParent(int target){
        
        MyNode current = root;
        MyNode parent = root;
        
        while(current != null){
            
            if (target > current.data) {
//                System.out.println("current: " + current.data);
                parent = current;
                current = current.right;
                
            } else if (target < current.data){
//                System.out.println("current: " + current.data);
                parent = current;
                current = current.left;
                
            } else if (target == current.data){
//                System.out.println("Found: " + current.data + "\nParent: " + parent.data);
                break;
            } else {
                System.out.println("Not Found");
                break;
            }
            
        }
        
        if (current == null) {
//            System.out.println("null");
            return null;
        } else {
//            System.out.println("Returned: " + current.data);
            return parent; 
        }
        
    }
    
    public MyNode getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }
    
    
    
    public class MyNode{
        
        private MyNode left;
        private MyNode right;
        private int data;

        public MyNode(int data) {
            this.data = data;
        }

        public MyNode getLeft() {
            return left;
        }

        public MyNode getRight() {
            return right;
        }

        public int getData() {
            return data;
        }
        
        
    }
}
