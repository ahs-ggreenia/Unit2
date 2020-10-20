
package ch3pc1;

/**
 * Gabe Greenia
 */
public class Employee {
    private String name;
    private int idNum;
    private String department;
    private String position;
    
    // no aug constructor
public Employee(){
    name = "null";
    idNum = 0;
    department = "null";
    position = "null";
}
    //aug constructor
public Employee(String n,int i,String d, String p ) {
    name = n;
    idNum = i;
    department = d;
    position = p;
}
    //Changes Value of name field to given value
public void setName(String n){
    n = name;
}
    //Changes Value of idNum field to given value
public void setIdNum(int i){
    i = idNum;
}
    //Changes Value of department field to given value
public void setDepartment(String d){
    d = department;
}
    //Changes Value of position field to given value
public void setPosition(String p){
    p = position;
}
    //Gets Value of name field
public String getName(){
    return name;
}
    //Gets Value of idNum field
public int getId(){
    return idNum;
}    
    //Gets Value of position field
public String getPosition(){
    return position;
}    
    //Gets Value of department field
public String getDepartment(){
    return department;
}    
    
}
