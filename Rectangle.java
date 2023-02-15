// Solution to Project 6.8
// Represents a rectangle

import java.awt.*;

public class Rectangle {

  private int cornerX, cornerY, width, height;
  private Color color;
  private boolean filled;

  public Rectangle(int x, int y, int w, int h, Color c) {
    cornerX = x;
    cornerY = y;
    width = w;
    height = h;
    color = c;
    filled = false;
  }

  public void draw(Graphics g) {
    Color oldColor = g.getColor();
    g.setColor(color);
    if (filled)
      g.fillRect(cornerX, cornerY, width, height);
    else
      g.drawRect(cornerX, cornerY, width, height);
    g.setColor(oldColor);
  }

  public boolean containsPoint(int x, int y) {
    return x >= cornerX && x <= cornerX + width &&
        y >= cornerY && y <= cornerY + height;
  }

  public void move(int xAmount, int yAmount) {
    cornerX += xAmount;
    cornerY += yAmount;
  }

  public void setFilled(boolean b) {
    filled = b;
  }
}
