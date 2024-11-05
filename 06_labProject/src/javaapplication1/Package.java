package javaapplication1;

public class Package {
    
    private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZIP;    

    private String reciperName;
    private String reciperAddress;
    private String reciperCity;
    private String reciperState;
    private String reciperZIP;
    
    private double weight; 
    private double costPerOunce;

    public Package(String senderName, String senderAddress, String senderCity, 
            String senderState, String senderZIP, String reciperName, String reciperAddress, 
            String reciperCity, String reciperState, String reciperZIP, double weight, double costPerOunce) {
        
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZIP = senderZIP;
        
        this.reciperName = reciperName;
        this.reciperAddress = reciperAddress;
        this.reciperCity = reciperCity;
        this.reciperState = reciperState;
        this.reciperZIP = reciperZIP;
        
        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }    
    
    public double calculateCost(){
        return weight * costPerOunce;
    }

    public double getWeight() {
        return weight;
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }
    
    
    
}
