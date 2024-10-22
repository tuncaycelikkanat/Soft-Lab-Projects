package pkg05_labweek;

public class Main {

    public static void main(String[] args) {
        
        FibonacciNumber f1 = new FibonacciNumber();      
        
        f1.calculateFibonacci(7);  
        
        FibonacciNumber.display(f1.getFibonacciSeries(6));
        
        FibonacciNumber.display(f1.getFibonacciSeries(5,true));
                      
    }
    
}
