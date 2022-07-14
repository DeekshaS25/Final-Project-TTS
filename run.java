import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.util.*;
import java.io.*;
class A extends JFrame implements ActionListener
{
  JLabel l1;
  JTextField t1;
  JButton b1;
  A()
  {
   setLayout(new FlowLayout());
   l1 = new JLabel("Enter Text: ");
   t1 = new JTextField(20);
   b1 = new JButton("Convert");
 
   setLayout(new FlowLayout());
   add(l1);
   add(t1);
   add(b1);
   b1.addActionListener(this);
 
   setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    String s = e.getActionCommand();

    if(s.equals("Convert"))
    {
       String pathPython = "C:/Users/Saurabh/Desktop//ci.py";
       String [] cmd = new String[3];
       cmd[0] = "python";
       cmd[1] = pathPython;
       cmd[2] = t1.getText();

      Runtime r = Runtime.getRuntime();
      
      try{
      Process p = r.exec(cmd);
      }
      catch(IOException i)
      {
       System.out.println(i);
      }
   }
  }
  public static void main(String args[])
  {
   A d = new A();
   d.setSize(300,400);
   d.setVisible(true);
  }
}
