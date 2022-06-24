// import statements  
import java.awt.*;    
import javax.swing.*;    
    
public class GridLayoutQuestion 
{    
  
JFrame frameObj;    
  
// constructor  
GridLayoutQuestion()  
{    
frameObj = new JFrame();    
  
// creating 4 buttons  
JButton btn1 = new JButton("1");    
JButton btn2 = new JButton("2");    
JButton btn3 = new JButton("3");    
JButton btn4 = new JButton("4");     
    
// adding buttons to the frame  
// since, we are using the parameterless constructor, therefore;   
// the number of columns is equal to the number of buttons we   
// are adding to the frame. The row count remains one.  
frameObj.add(btn1); frameObj.add(btn2); 
frameObj.add(btn3); frameObj.add(btn4); 

// setting the grid layout   
// a 2 * 2 grid is created with the horizontal gap 20   
// and vertical gap 20
frameObj.setLayout(new GridLayout(2, 2, 20, 20));    
frameObj.setSize(200, 200);    
frameObj.setVisible(true);    
}  
// main method  
public static void main(String argvs[])   
{    
new GridLayoutQuestion();    
}    
}    