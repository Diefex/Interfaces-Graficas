package interfacesGraficas.Paneles;

import java.awt.Color;
import javax.swing.JPanel;

public class SubPanel extends JPanel {
    
    public SubPanel (int x, int y, int width, int height, Color color) {
        this.setBounds(x, y, width, height);
        this.setBackground(color);
        this.setLayout(null);
    }
    
}
