
package employee;

/**
 * Gabe Greenia
 * Purpose: Employee class stores info about an employee 1.2.20
 */
public class Employee {
    private String name;
    private String empID;
    private int pay;
    
    public Employee() {
        name = null;
        empID = null;
        pay = 0; 
    }
    public Employee(String n, String id, int p){
        name = n;
        empID = id;
        pay = p ; 
    }
    public Employee(String n, String id){
        name = n;
        empID = id;
        pay = 20;
    }
}
