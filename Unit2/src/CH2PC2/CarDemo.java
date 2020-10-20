
package CH2PC2;

/**
 *Gabe Greenia 
 *Programming III AP
 * 10/19/2020
 * CarDemo
 */
public class CarDemo {

    public static void main(String[] args) {
        Car Nissan = new Car(2008,"Frontier");
        
        //beginning of acceleration
        Nissan.accelerate();
        System.out.println(Nissan.getSpeed());
        
        
        Nissan.accelerate();
        System.out.println(Nissan.getSpeed());
        
        Nissan.accelerate();
        System.out.println(Nissan.getSpeed());
        
        
        Nissan.accelerate();
        System.out.println(Nissan.getSpeed());
        
        Nissan.accelerate();
        System.out.println(Nissan.getSpeed());
        
        //Beginning of brakes
        
        Nissan.brake();
        System.out.println(Nissan.getSpeed());
        
        
        Nissan.brake();
        System.out.println(Nissan.getSpeed());
        
        
        Nissan.brake();
        System.out.println(Nissan.getSpeed());
        
        
        Nissan.brake();
        System.out.println(Nissan.getSpeed());
        
        
        Nissan.brake();
        System.out.println(Nissan.getSpeed());
    }
    
}
