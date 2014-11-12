package li.july.cusjbutton.test;

import li.july.cusjbutton.CircleJButton;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by youmiss on 11/11/2014.
 */
public class TestCircleJButton {
    public static void main(String[] args) {
        final JButton button = new CircleJButton();
        button.setPreferredSize(new Dimension(50, 50));
        button.setBackground(Color.gray);
        button.setBorderPainted(false);
        button.setOpaque(false);
        button.setContentAreaFilled(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked!");
            }
        });

        button.getModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (button.getModel().isRollover()) {
                    button.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
            }
        });

        JFrame jFrame = new JFrame();
        jFrame.getContentPane().add(button);
        jFrame.getContentPane().setLayout(new FlowLayout());
        jFrame.setSize(150, 150);
        jFrame.setVisible(true);
    }
}
