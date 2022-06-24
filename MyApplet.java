import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet
{
String name;
String grade;
String reg_num;

public void init()
{
name = getParameter("Name");
grade = getParameter("Grade");
reg_num = getParameter("Registeration Number");
}

public void paint(Graphics g)
{
g.drawString("Name: " + name, 20, 20);
g.drawString("Grade: " + grade, 20, 20);
g.drawString("Registeration Number: " + reg_num, 20, 20);
}

}