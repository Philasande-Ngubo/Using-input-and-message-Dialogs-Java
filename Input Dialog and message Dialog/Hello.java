/*
 *Author: Philasande Ngubo
 *Email : pngubo041120@gmail.com
 *Date  : 12/08/2023
 * I hereby allow the use of this code
   for personal and learning purposes
   and one can download this code as 
   however fancied.
*/
import javax.swing.JOptionPane;
import java.util.Calendar;

public class Hello
{
 public static void main(String args[])
 {
   String sName = JOptionPane.showInputDialog(null,"Please input you name");
   
   //This gets hours in the 24hrs format
   Calendar currentDate = Calendar.getInstance();
   int iHours = currentDate.get(Calendar.HOUR_OF_DAY);
   
   //Now let's greet accordingly
   String sTime_Of_Day, sMessage ;
   
   if ( (iHours >= 5 ) && ( iHours <= 10)) 
   {
     sTime_Of_Day = "morning";
     sMessage ="It's a good day lets get to work." ;
   }  
   
   else if ( iHours == 11)
   {
    sTime_Of_Day ="day";
    sMessage= "Let's keep pushing.";
   }
   
   else if ( (iHours >= 12) && (iHours <= 16) )
   {
    sTime_Of_Day ="afternoon";
    sMessage="Let's wrapper up today's activities.";
   }
   
   else if ( (iHours >= 17 ) && (iHours <= 20))
   {
    sTime_Of_Day ="evening";
    sMessage="Spend this one with family and friends.";
   }
   
   else
   {
    sTime_Of_Day ="night";
    sMessage ="Rest up and wake up fresh for morning.";
    
   }
   
   //Actual greeting
   JOptionPane.showMessageDialog(null,"Good "+sTime_Of_Day+" "+sName+",\n"+sMessage);
 }

}