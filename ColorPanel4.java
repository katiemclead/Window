import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  //mouse events
import javax.swing.ImageIcon;


public class ColorPanel4 extends JPanel
{
    private int x, y;
    private ImageIcon i1, i2, selectedImage;

    public ColorPanel4(Color backColor) {
        setBackground(backColor);
        i1 = new ImageIcon("images/java.jpg");
        i2 = new ImageIcon("images/CSharp.jpg");
        selectedImage = null;
        addMouseListener(new PanelListener());
        addMouseMotionListener(new PanelMotionListener());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        i1.drawImage(x,y,g);
        i2.drawImage(x,y,g);

    }

    private class PanelListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            if(i1.containsPoint(x,y))
            {
                selectedImage = i1; 
            }
            else if(i2.containsPoint(x,y))
            {
                selectedImage = i2;
            }
        }

        public void mouseReleased(MouseEvent e)
        {
            selectedImage = null;
        }
    }

    private class PanelMotionListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e)
        {
            if(selectedImage != null)
            {
                int newX = e.getX();
                int newY = e.getY();
                int dx = newX - x;
                int dy = newY - y;
                selectedImage.move(dx,dy);
                x = newX;
                y = newY;
                repaint();
            }
        }
    }
}

