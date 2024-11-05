package javaapplication1;

public class OvernightPackage extends Package{
    
    private double extraFee;

    public OvernightPackage( String senderName, String senderAddress, 
            String senderCity, String senderState, String senderZIP, String reciperName, 
            String reciperAddress, String reciperCity, String reciperState, String reciperZIP, double weight, double costPerOunce,double extraFee) {
        
        super(senderName, senderAddress, senderCity, senderState, senderZIP, reciperName, 
                reciperAddress, reciperCity, reciperState, reciperZIP, weight, costPerOunce);
        
        this.extraFee = extraFee;
    }
    
    @Override
    public double calculateCost(){
        
        return (super.getCostPerOunce() + extraFee) * super.getWeight();
    }
    
    
}
