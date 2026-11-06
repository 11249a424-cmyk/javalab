
import java.awt.*;
import javax.swing.*;

class FaceApplet extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(100, 40, 150, 150);

        g.setColor(Color.BLACK);
        g.fillOval(135, 85, 15, 15);
        g.fillOval(200, 85, 15, 15);

        g.drawLine(175, 100, 165, 130);
        g.drawLine(165, 130, 180, 130);
        g.drawArc(140, 120, 70, 40, 180, 180);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Human Face");
        f.add(new FaceApplet());
        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}