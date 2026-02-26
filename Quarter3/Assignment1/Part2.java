package Quarter3.Assignment1;

import javax.swing.*;
import java.awt.event.*;

public class Part2 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Part 2: Making buttons");
        JButton button = new JButton("Click me!");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(window, "Button was clicked!");
            }
        });

        window.add(button);
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
