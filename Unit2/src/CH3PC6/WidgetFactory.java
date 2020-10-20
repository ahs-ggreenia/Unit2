package CH3PC6;
/**
 * Chapter 3
 * Programming Challenge 6: Widget Factory
 * The WidgetFactory class stores data for 
 * a widget manufacturing plant. 
 */

public class WidgetFactory
{
   private final double WIDGETS_PER_HOUR = 10.0; // Number of widgets per hour
   private final int NUM_SHIFTS = 2;             // Number of shifts
   private final int HOURS_PER_SHIFT = 8;        // Hours per shift
   private int numWidgets;                       // To hold the number of widgets


   /**
    * The setNumWidgets method sets the number of widgets.
    */

   public void setNumWidgets(int n)
   {
      numWidgets = n;
   }

   /**
    * The getNumWidgets method returns the number of widgets.
    */

   public int getNumWidgets()
   {
      return numWidgets;  
   }

   /**
    * The getDaysToProduce method returns the number 
    * of days required to produce the widgets.
    */

   public double getDaysToProduce()
   {
       double widgetsPerDay =0.0;
       widgetsPerDay = WIDGETS_PER_HOUR * NUM_SHIFTS * HOURS_PER_SHIFT;
       return numWidgets / widgetsPerDay;
   }
}
