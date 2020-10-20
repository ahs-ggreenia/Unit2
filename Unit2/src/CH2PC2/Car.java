package CH2PC2;

/**
 *Gabe Greenia
 * Programming III AP
 * Car Class
 */
public class Car {
    private int carModel;
    private String make;
    private int speed;
    
     public Car(int c, String m){
         carModel = c;
         make = m;
         speed = 0;
    }
     
    public int getModel(){
        return carModel;
    }
    public String getMake(){
        return make;
    }
    public int getSpeed(){
        return speed;
    }
    public void accelerate(){ 
       speed = speed + 5 ;
    }
     public void brake(){ 
       speed = speed - 5 ;
    }   
}
