package interfaces.Paneles;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Diefex
 */
public class PanelWeb extends JPanel implements Colores{
    
    private SubPanel Pizq;
    private SubPanel Psup;
    private SubPanel Pinf;
    
    public PanelWeb () {
        setBounds(100,100,950,600);
        setBackground(WHITE230);
        setLayout(null);
        
        Pizq = new SubPanel(50,50,270,500, GREEN180);
        add(Pizq);
        
        Psup = new SubPanel(340,50,550,240, Color.WHITE);
        add(Psup);
        
        Pinf = new SubPanel(340,310,550,240, Color.WHITE);
        add(Pinf);
        
    }
    
}
