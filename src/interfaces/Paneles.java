
package interfaces;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paneles extends JFrame {
    
    Color White230;
    Color White220;
    Color Black21;
    Color Green180;
    Color Orange137;
    
    private JPanel Pizq;
    private JPanel Psup;
    
    private JPanel fondo;
    
    private Panel Ppri;
    
    public Paneles () {
        super("Paneles");
        
        this.setBounds(400,250,1050,700);
        this.setLayout(null);
        
        Color White230 = new Color(230,230,230);
        Color White220 = new Color(220,220,220);
        Color Black21 = new Color(21,21,21);
        Color Green180 = new Color(134,180,4);
        Color Orange137 = new Color(255,137,0);
        
        Ppri = new Panel();
        
        Pizq = new JPanel();
        setPanel (Pizq, 0,0,100,700, Black21);
        
        Psup = new JPanel();
        setPanel(Psup, 100,0,950,100, White220);
        
        add(Ppri);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void setPanel (JPanel panel, int x, int y, int width, int height, Color color) {
        panel.setBounds(x,y,width,height);
        panel.setBackground(color);
        panel.setLayout(null);
        add(panel);
    }
    
}
