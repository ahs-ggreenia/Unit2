/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CH2PC4;

/**
 *Gabe Greenia
 * Programming III AP
 * 10/19/2020
 * Retail Item Class
 */
public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;
    
    public RetailItem(String d, int u, double p){
        description = d;
        unitsOnHand = u;
        price = p;
    }
    
    public void setDesc(String d){
    
    description = d;
        
    }
    public void setUnits(int u){
    
    unitsOnHand = u;
        
    }
    public void setPrice(double p){
    
    price = p;
        
    }
    
   public String getDesc(){
    return description;   
   }
   public int getUnits(){
    return unitsOnHand;   
   }
   public double getPrice(){
    return price;   
   }
    
}
