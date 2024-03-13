/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical3;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Practical3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      String name = JOptionPane.showInputDialog("Please enter your name");
      JOptionPane.showMessageDialog(null, "Hello " + name );
      
      int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you"));
      JOptionPane.showMessageDialog(null, "Hello " + name +  " you are " + age);
    }
    
}
