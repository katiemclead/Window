
//Modified from Lambert & Obsborne
import javax.swing.*; //for making windows (JFrame, JPanel)
import java.awt.*; //your colors!

class Window {

  // Make a GUI Window appear
  public static void makeWindow() {
    JFrame myWindow = new JFrame();
    myWindow.setTitle("Look at me!");
    myWindow.setSize(300, 200);
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myWindow.setVisible(true);
  }

  // add some color to your window!
  public static void colorfulWindow() {
    JFrame myWindow = new JFrame();
    myWindow.setTitle("Even prettier");
    myWindow.setSize(300, 200);
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
    panel.setBackground(Color.magenta);
    Container pane = myWindow.getContentPane();
    pane.add(panel);
    myWindow.setVisible(true);
  }

  public static void gridWindow() {
    JFrame myWindow = new JFrame();
    myWindow.setTitle("Mulitple Panels");
    myWindow.setSize(300, 200);
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel1 = new JPanel();
    panel1.setBackground(Color.decode("#928BB9"));
    JPanel panel2 = new JPanel();
    panel2.setBackground(Color.decode("#ECB1BB"));
    JPanel panel3 = new JPanel();
    panel3.setBackground(Color.decode("#A98980"));
    JPanel panel4 = new JPanel();
    panel4.setBackground(new Color(248, 241, 188));
    JPanel panel5 = new JPanel();
    panel5.setBackground(new Color(195, 221, 150));
    JPanel panel6 = new JPanel();
    panel6.setBackground(new Color(153, 197, 109));
    Container pane = myWindow.getContentPane();
    pane.setLayout(new GridLayout(3, 2));
    pane.add(panel1);
    pane.add(panel2);
    pane.add(panel3);
    pane.add(panel4);
    pane.add(panel5);
    pane.add(panel6);
    myWindow.setVisible(true);

  }

  public static void graphicWindow() {
    JFrame myWindow = new JFrame();
    myWindow.setTitle("Graphics");
    myWindow.setSize(300, 800);
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ColorPanel panel = new ColorPanel(Color.white);
    Container pane = myWindow.getContentPane();
    pane.add(panel);
    myWindow.setVisible(true);
  }

  public static void inputBox() {
    String inputString = JOptionPane.showInputDialog("Enter the radius", "0");
    if (inputString == null) {
      return;
    }
    double radius = Double.parseDouble(inputString);
    if (radius < 0) {
      JOptionPane.showMessageDialog(null, "Error: radius must be nonnegative");
    } else {
      double area = Math.PI * Math.pow(radius, 2);
      JOptionPane.showMessageDialog(null, "The area is " + area + ".");
    }
  }

  public static void mouseResponsiveWindow() {
    JFrame myWindow = new JFrame();
    myWindow.setTitle("Graphics");
    myWindow.setSize(300, 800);
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ColorPanel2 panel = new ColorPanel2(Color.white);
    Container pane = myWindow.getContentPane();
    pane.add(panel);
    myWindow.setVisible(true);
  }

  public static void movingRectangle() {
    JFrame myWindow = new JFrame();
    myWindow.setTitle("Graphics");
    myWindow.setSize(300, 800);
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ColorPanel3 panel = new ColorPanel3(Color.white);
    Container pane = myWindow.getContentPane();
    pane.add(panel);
    myWindow.setVisible(true);
  }

  public static void thermWindow() {
    ThermWindow myTherm = new ThermWindow();
    myTherm.setTitle("F to C Converter");
    myTherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myTherm.pack();
    myTherm.setVisible(true);
  }

  public static void movingImages() {
    JFrame myWindow = new JFrame();
    myWindow.setTitle("Graphics");
    myWindow.setSize(300, 800);
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ColorPanel4 panel = new ColorPanel4(Color.white);
    Container pane = myWindow.getContentPane();
    pane.add(panel);
    myWindow.setVisible(true);
  }
}
