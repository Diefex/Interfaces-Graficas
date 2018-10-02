package interfacesGraficas.Paneles;

import interfacesGraficas.Colores;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Diefex
 */
public class PanelSuperior extends JPanel implements Colores{
    
    public PanelSuperior () {
        setBounds(100,0,950,100);
        setBackground(WHITE220);
    }
    
}
