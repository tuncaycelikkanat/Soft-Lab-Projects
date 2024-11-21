
package pkg07_labproject;

public class FixedDiscountStrategy implements IDiscountStrategy{

    @Override
    public double applyDiscount(double amount) {
        if (amount >= 100) {
            return amount - 100;
        } else {
            return 0;
        }
    }
    
}
