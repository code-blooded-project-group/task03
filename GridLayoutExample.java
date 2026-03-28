package GridLayouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {

    public GridLayoutExample() {
        this.CreateFrame();
    }

    public JFrame CreateFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(CreateMainPanel());
        frame.setVisible(true);
        return frame;
    }

    public JPanel CreateMainPanel() {
        JPanel mainContainer = new JPanel(new GridLayout(1, 3));
        mainContainer.add(CreatePanelOne());
        mainContainer.add(CreatePanelTwo());
        mainContainer.add(CreatePanelThree());
        return mainContainer;
    }

    public JPanel CreatePanelOne() {
        JPanel panelOne = new JPanel();
        panelOne.setBackground(Color.ORANGE);
        return panelOne;
    }

    public JPanel CreatePanelTwo() {
        JPanel panelTwo = new JPanel();
        panelTwo.setBackground(Color.GRAY);
        return panelTwo;
    }

    public JPanel CreatePanelThree() {
        JPanel panelThree = new JPanel();
        panelThree.setBackground(Color.MAGENTA);
        return panelThree;
    }
}
