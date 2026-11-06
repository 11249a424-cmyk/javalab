
import java.awt.*;
import javax.swing.*;

class CalculatorGrid {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        f.setLayout(new BorderLayout());

        JTextField display = new JTextField();
        f.add(display, BorderLayout.NORTH);

        JPanel p = new JPanel(new GridLayout(4, 4, 5, 5));

        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            p.add(btn);

            btn.addActionListener(e -> {
                if (b.equals("C")) {
                    display.setText("");
                } else if (b.equals("=")) {
                    display.setText("Calculator UI");
                } else {
                    display.setText(display.getText() + b);
                }
            });
        }

        f.add(p, BorderLayout.CENTER);
        f.setSize(350, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}