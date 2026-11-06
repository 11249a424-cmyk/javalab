
import java.awt.*;
import javax.swing.*;

class BorderDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("BorderLayout");

        f.setLayout(new BorderLayout());

        f.add(new JButton("Header"), BorderLayout.NORTH);
        f.add(new JButton("Footer"), BorderLayout.SOUTH);
        f.add(new JButton("Menu"), BorderLayout.WEST);
        f.add(new JButton("Tools"), BorderLayout.EAST);
        f.add(new JButton("Content"), BorderLayout.CENTER);

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}