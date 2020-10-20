
package ch3pc1;

/**
 * Gabe Greenia
 * Purpose: test Employee class methods
 */
public class EmployeeTester {

    public static void main(String[] args) {
        Employee SusanMeyers = new Employee();
        Employee MarkJones = new Employee ("Mark Jones", 39119, "IT", 
        "Programmer" );
        Employee JoyRogers = new Employee("Joy Rogers", 81774, "Manufactoring"
        , "Engineer"); 
        
        
        SusanMeyers.setName("Susan Meyers");
        SusanMeyers.setIdNum(47899);
        SusanMeyers.setDepartment("Accounting");
        SusanMeyers.setPosition("Vice President");
        
        SusanMeyers.getName();
        SusanMeyers.getDepartment();
        SusanMeyers.getId();
        SusanMeyers.getPosition();
        
        System.out.println("");
        
        MarkJones.getName();
        MarkJones.getId();
        MarkJones.getPosition();
        MarkJones.getDepartment();
        
        System.out.println("");
              
        JoyRogers.getName();
        JoyRogers.getId();
        JoyRogers.getPosition();
        JoyRogers.getDepartment();
        
        
    }
    
}
