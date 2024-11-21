
package pkg07_labproject;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    //key - value pair, .value , .key
    private Map<String, Product> cart;
    
    public ShoppingCart() {
        cart = new HashMap<>();
                
    }
    
    public void addProduct(Product product){
        cart.put(product.getName(), product);
        System.out.printf("%d %ss is added in cart.%n",
                product.getQuantity(),product.getName());
    }
    
    public void removeProduct(String productName){
        if (!cart.isEmpty()) {
            if (cart.containsKey(productName)) {
                cart.remove(productName);
                System.out.printf("%s is deleted in cart.%n",
                    productName);
            } else {
                System.out.println("Product is not in your cart.");
            }
        } else{
            System.out.println("Cart is already empty.");
        }
         
    }
    
    public double calculateTotalCost(){
        double totalPrice = 0;
        for (Product p: cart.values()) {
            totalPrice += p.getTotalPrice();
        }
        return totalPrice;
    }
    
    
    
}
