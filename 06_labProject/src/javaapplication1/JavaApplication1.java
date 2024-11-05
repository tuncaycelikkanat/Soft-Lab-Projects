package javaapplication1;


public class JavaApplication1 {
      
    public static void main(String[] args) {

        TwoDayPackage p1 = new TwoDayPackage("a", "istanb", "ist", "abc", "1234",
            "tuncay", "kayseri", "kays", "abc", "38500", 24, 5,10);
    
        System.out.printf("Two day package cost: %.1f%n",p1.calculateCost());
        
        OvernightPackage p2 = new OvernightPackage("a", "istanb", "ist", "abc", "1234",
            "tuncay", "kayseri", "kays", "abc", "38500", 24, 5,10);
        
        System.out.printf("Two day package cost: %.1f%n",p2.calculateCost());

    }
    
}
