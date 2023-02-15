import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class ColorPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColorPanel extends JPanel
{
    public ColorPanel(Color backColor)
    {
       setBackground(backColor);
    }
    
    public void paintComponent(Graphics g)
    {
     super.paintComponent(g);
     
     
     //Rectangle: Top left hand x and y coordinates, followed by length and width
     g.setColor(Color.blue);
     g.drawRect(150,50,50,50);
     
     
     //Oval: Top left hand x and y coordinates, followed by length and width, of imaginary rectangle
     g.setColor(Color.cyan);
     g.drawOval(40,150,200,50);
     
     //Line segment: Starting x and y coordinates and Ending x and y coordinates
     g.setColor(Color.red);
     g.drawLine(10,15,200,5);
     
     //Arc: Strting x, y, width, height, startAngle, arcAngle
     g.setColor(Color.black);
     g.drawArc(100,100,100,75,0,90);
     
     //Round Rectangle: Same as rectangle, + arcWidth and arcHeigh
     g.setColor(Color.darkGray);
     g.drawRoundRect(50,400,200,100,20,50);
     
     //String: Text, x and y coordinates for first character
     g.setColor(Color.orange);
     g.drawString("Shapes by McLead", 100, 525);
        
    }

    
}
