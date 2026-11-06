
import java.awt.*;
import javax.swing.*;

class ColorApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(50, 40, 120, 60);

        g.setColor(Color.BLUE);
        g.fillOval(200, 40, 100, 70);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Java Applets are fun!", 50, 150);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Color Shapes");
        f.add(new ColorApplet());
        f.setSize(400, 220);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}