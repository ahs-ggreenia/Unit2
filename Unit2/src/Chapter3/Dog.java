
package Chapter3;

/**
 *Gabe Greenia
 * Purpose - Define a Dog object
 */
public class Dog {
    private String name;
    private int age;
    private String breed;
    
    public Dog(String n, int a, String b){
        name = n;
        age = a;
        breed = b;
    }
    
    public void bark() {
        System.out.println("woof!"); 
    }
    //changes value of name to value given
    public void setName(String n) {
        name = n;
    }
    //changes value of age to value given
    public void setAge(int a){
        age = a;
    }
    //changes value of breed to value given
    public void setBreed(String b){
        breed = b;
    }
    //gives value of name
    public String getName(){
        
    return name;    
    }
   // gives value of Age 
    public int getAge(){
        
    return age;    
    }
    // gives the value of breed 
    public String getBreed(){
        
        
    return breed;    
    }    

}
