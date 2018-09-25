package interfaces;

import java.awt.Color;
import javax.swing.JPanel;

public class Panel extends JPanel {
    
    private JPanel PSizq;
    private JPanel PScen;
    private JPanel PSder;
    private JPanel PIizq;
    private JPanel PIder;
    
    Color Green180 = new Color(134,180,4);
    Color Orange137 = new Color(255,137,0);
    
    public Panel () {
        
        setBounds(100,100,950,600);
        setBackground(new Color(230,230,230));
        setLayout(null);
        
        PSizq = new JPanel();
        setPanel(PSizq, 50,50,270,200, Green180);
        
        PScen = new JPanel();
        setPanel(PScen, 340,50,270,200, Orange137);
        
        PSder = new JPanel();
        setPanel(PSder, 630,50,270,200, Green180);
        
        PIizq = new JPanel();
        setPanel(PIizq, 50,275,460,250, Color.WHITE);
        
        PIder = new JPanel();
        setPanel(PIder, 530,275,370,250, Color.WHITE);
        
    }
    
    public void setPanel (JPanel panel, int x, int y, int width, int height, Color color) {
        panel.setBounds(x,y,width,height);
        panel.setBackground(color);
        panel.setLayout(null);
        add(panel);
    }
    
}
