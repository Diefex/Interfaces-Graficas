package interfaces.Paneles;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelInicio extends JPanel implements Colores{
    
    private SubPanel PSizq;
    private SubPanel PScen;
    private SubPanel PSder;
    private SubPanel PIizq;
    private SubPanel PIder;
    
    public PanelInicio () {
        setBounds(100,100,950,600);
        setBackground(WHITE230);
        setLayout(null);

        PSizq = new SubPanel(50,50,270,200, GREEN180);
        add(PSizq);
        
        PScen = new SubPanel(340,50,270,200, ORANGE137);
        add(PScen);
        
        PSder = new SubPanel(630,50,270,200, GREEN180);
        add(PSder);
        
        PIizq = new SubPanel(50,275,460,250, Color.WHITE);
        add(PIizq);
        
        PIder = new SubPanel(530,275,370,250, Color.WHITE);
        add(PIder);
        
    }
    
}
