package GridLayouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {

    public GridLayoutExample() {
        JFrame frame = new JFrame();
        frame.setTitle("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel mainContainer = new JPanel(new GridLayout(1, 3));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);

        mainContainer.add(panel1);
        mainContainer.add(panel2);
        mainContainer.add(panel3);
        
        frame.add(mainContainer);
        frame.setVisible(true);

    }
}
