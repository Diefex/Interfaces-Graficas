package interfacesGraficas.Paneles;

import interfacesGraficas.Colores;
import interfacesGraficas.Botones.Boton;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelIzquierdo extends JPanel implements Colores{
    
    public PanelIzquierdo () {
        setBounds (0,0,100,700);
        setBackground(BLACK21);
        setLayout(null);
    }
}
