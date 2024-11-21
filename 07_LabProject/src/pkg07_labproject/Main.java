
package pkg07_labproject;


public class Main {

    public static void main(String[] args) {
        
        // laptop 1000 2
        // phone 500 3
        // headphones 50 5
        
        // 3750 - 3375 - 3650 - 2250
        // 0       %10    100    remove
        
        Product p1 = new Product("Laptop", 1000.0, 2);
        Product p2 = new Product("Phone", 500.0, 3);
        Product p3 = new Product("Headphones", 50.0, 5);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        System.out.println();
        
        System.out.println("Total price without dicount: " + cart.calculateTotalCost());
        
        PercentageDiscountStrategy dis1 = new PercentageDiscountStrategy();
        FixedDiscountStrategy dis2 = new FixedDiscountStrategy();
        
        double percentageDiscount = dis1.applyDiscount(cart.calculateTotalCost()); 
        double fixedDiscount = dis2.applyDiscount(cart.calculateTotalCost());

        System.out.println("Total price 10% discount: " + percentageDiscount);
        System.out.println("Total price $100 discount: " + fixedDiscount);
        
        System.out.println("");
        cart.removeProduct("Phone");
        System.out.println("");
        
        System.out.println("Total price after remove: " + cart.calculateTotalCost());

        
    }
    
}
