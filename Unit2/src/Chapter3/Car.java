
package Chapter3;

/**
 *Greenia
 * Purpose: define a car
 */
public class Car {
    private String make;
    private boolean isSports;
    private String owner;
    
    /*
    no arg constructor for the Car Class
    */
    
    
    public Car() {
        make = null ;
        isSports = false;
        owner = null;
    }
    
    public Car(String m, boolean s, String o){
        make = m ;
        isSports = s ;
        owner = o ;
    }
    
    public Car(String m, boolean s){
        make = m ;
        isSports = s ;
        owner = null;
    }
    
    public void printMake(){
        System.out.println(make) ;
    }
    public void printisSports(){
        System.out.println(isSports);
    }
    public void printOwner(){
        System.out.println(owner);
    }
}
