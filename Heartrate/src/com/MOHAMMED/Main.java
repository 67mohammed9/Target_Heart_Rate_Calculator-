/*Target Heart rate Calculator
* Date: February 09 2019
* By: Mohammed Bhuiyan
*/

/*Main Class File*/
package com.MOHAMMED;

import javax.swing.JOptionPane;
public class Main {
//created dialogue box for name and birthdate
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to Target-Heart-Rate Calculator!");
        String first = JOptionPane.showInputDialog("What is your first name?");
        String last = JOptionPane.showInputDialog("What is your last name?");
        int t_year = Integer.parseInt(JOptionPane.showInputDialog("What year were you born in?"));
        int t_month = Integer.parseInt(JOptionPane.showInputDialog("What month were you born in? (enter the number like january is 01)"));
        int t_day = Integer.parseInt(JOptionPane.showInputDialog("What day of the month were you born in? (e.g 1,15,23,etc,)"));
        HeartRates x = new HeartRates(first, last, t_month,t_day,t_year );
        int age = x.age();
        int MaxHR = x.max_heartRate();
        String TargetHR = x.target_heartrate();

        // create the message
        String message =
                String.format(
                        "Name: " + first + " " + last + "\n" +
                        "Date of Birth: " + t_month+"/"+t_day+"/"+t_year + "\n" +
                        "Age: " + age +"\n" +
                        "Maximum Heart Rate: "+ MaxHR + "\n"+
                        "Target Heart Rate: " + TargetHR
                );
        // display the message containing the user's information
        JOptionPane.showMessageDialog(null,message);

    }
}
