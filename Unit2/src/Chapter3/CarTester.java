/*
*Greenia    
*Programming III AP
* Car Class Tester
*9/30/2020
*/
package Chapter3;

public class CarTester {
    public static void main(String[] args) {
        //create a car object
        Car corvette = new Car();
        Car tacoma = new Car("Toyota", false, "Mr.Mulroy");
        Car wrangler = new Car("jeep", false);
        //call the methods of the Car class
       
        System.out.println("");
        
        corvette.printMake();
        corvette.printOwner();
        corvette.printisSports();
        
        System.out.println("");
        
        tacoma.printMake();
        tacoma.printisSports();
        tacoma.printOwner();
        
        System.out.println("");
        
        wrangler.printMake();
        wrangler.printisSports();
        wrangler.printOwner();
    }
    
}
