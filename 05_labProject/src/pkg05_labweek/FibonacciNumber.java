
package pkg05_labweek;

import java.util.ArrayList;

public class FibonacciNumber {
    
    // F(0) = 0, F(1) = 1, F(2) = 1, F(3) = 2
    // calculateFibonacci(int n)
    // getFibonacciSeries(int n)
    // getFibonacciSeries(int n, bool isdouble)
    
    ArrayList<Integer> fbList;

    public FibonacciNumber() {
        fbList = new ArrayList<>();
        fbList.add(0);
        fbList.add(1);
    }
    
    public void calculateFibonacci(int n){
        
        for (int i = 2; i <= n; i++) {  
            fbList.add(fbList.get(i - 1) + fbList.get(i - 2));  
        }       
        System.out.printf("F(%d) = %d%n",fbList.size() - 1,fbList.get(fbList.size() - 1));
        
        System.out.println("----------------------------------------------");  
    }
    
    public ArrayList<Integer> getFibonacciSeries(int n){
        
        ArrayList<Integer> fbList2 = new ArrayList<>(); 
        
        for (int i = 0; i <= n; i++) {
            fbList2.add(fbList.get(i));
        }
        
        return fbList2;     
    }
    
    public ArrayList<Double> getFibonacciSeries(int n, boolean isDouble){
        
        ArrayList<Double> fbList3 = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            fbList3.add(Double.valueOf( fbList.get(i)));
        } 
        
        return fbList3;     
    }
    
    
    static void display( ArrayList list){             
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("----------------------------------------------");       

    }
    
    
}
