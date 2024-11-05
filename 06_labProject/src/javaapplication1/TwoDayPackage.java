package javaapplication1;

public class TwoDayPackage extends Package{
    
    private double flatFee;

    public TwoDayPackage(String senderName, String senderAddress, 
            String senderCity, String senderState, String senderZIP, String reciperName, 
            String reciperAddress, String reciperCity, String reciperState, String reciperZIP, double weight, double costPerOunce, double flatFee) {
        
        super(senderName, senderAddress, senderCity, senderState, senderZIP, 
                reciperName, reciperAddress, reciperCity, reciperState, reciperZIP, 
                weight, costPerOunce);
        
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost(){
        return super.calculateCost() + flatFee;
    }
 
}
