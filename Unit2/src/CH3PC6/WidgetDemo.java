package CH3PC6;
/**
 * Chapter 3
 * Programming Challenge 6: Widget Factory
 * This program demonstrates the WidgetFactory class.
 */

public class WidgetDemo
{
   public static void main(String[] args)
   {
      // Create a WidgetFactory object.
      WidgetFactory wf = new WidgetFactory();
      
      // We want to make 1500 widgets.
      wf.setNumWidgets(1500);
      
      // Display the number of days required to
      // produce that many widgets.
      System.out.println("It will take " + 
                         wf.getDaysToProduce() +
                         " days to produce 1500 widgets.");
   }
}
