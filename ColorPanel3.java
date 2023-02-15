import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  //mouse events

public class ColorPanel3 extends JPanel
{
    private int x, y;
    private Rectangle r1, r2, selectedRectangle;

    public ColorPanel3(Color backColor) {
        setBackground(backColor);
        r1 = new Rectangle(100,200,25,50,Color.magenta);
        r1.setFilled(true);
        r2 = new Rectangle(100,100,50,50, Color.black);
        selectedRectangle = null;
        addMouseListener(new PanelListener());
        addMouseMotionListener(new PanelMotionListener());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        r1.draw(g);
        r2.draw(g);

    }

    private class PanelListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            if(r1.containsPoint(x,y))
            {
                selectedRectangle = r1; 
            }
            else if(r2.containsPoint(x,y))
            {
                selectedRectangle = r2;
            }
        }

        public void mouseReleased(MouseEvent e)
        {
            selectedRectangle = null;
        }
    }

    private class PanelMotionListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e)
        {
            if(selectedRectangle != null)
            {
                int newX = e.getX();
                int newY = e.getY();
                int dx = newX - x;
                int dy = newY - y;
                selectedRectangle.move(dx,dy);
                x = newX;
                y = newY;
                repaint();
            }
        }
    }
}

