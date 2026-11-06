
import java.awt.*;
import javax.swing.*;

class ShapesApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect(30, 50, 100, 60);
        g.drawOval(160, 50, 70, 70);
        g.drawLine(30, 150, 150, 150);

        int x[] = {280, 240, 320};
        int y[] = {50, 120, 120};
        g.drawPolygon(x, y, 3);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Geometric Shapes");
        f.add(new ShapesApplet());
        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}