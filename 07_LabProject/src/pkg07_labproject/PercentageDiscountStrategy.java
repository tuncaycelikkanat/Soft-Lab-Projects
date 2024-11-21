
package pkg07_labproject;

public class PercentageDiscountStrategy implements IDiscountStrategy{

    @Override
    public double applyDiscount(double amount) {
        return  amount - (amount * 0.1);
    }
    
}
