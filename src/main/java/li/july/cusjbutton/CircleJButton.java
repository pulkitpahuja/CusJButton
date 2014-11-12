package li.july.cusjbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by youmiss on 11/11/2014.
 */
public class CircleJButton extends JButton {
    public CircleJButton() {
        super();
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }
        //g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        //super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        //g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
        //super.paintBorder(g);
    }

    private Shape shape;
    public boolean contains(int x, int y) {
        if (shape == null ||
                !shape.getBounds().equals(getBounds())) {
            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        }

        return shape.contains(x, y);
    }
}
