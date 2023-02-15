import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //mouse events

public class ColorPanel2 extends JPanel {
  private int x, y;

  public ColorPanel2(Color backColor) {
    setBackground(backColor);
    // default coordinates
    x = 100;
    y = 100;
    // listen for mouse
    addMouseListener(new PanelListener());
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.drawString("(" + x + "," + y + ")", x, y);

  }

  public class PanelListener extends MouseAdapter {

    public void mousePressed(MouseEvent e) {
      x = e.getX();
      y = e.getY();
      repaint();
    }
  }

}
