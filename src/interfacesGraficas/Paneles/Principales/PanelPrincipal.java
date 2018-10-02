package interfacesGraficas.Paneles.Principales;

import interfacesGraficas.Colores;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel implements Colores{
    public PanelPrincipal () {
        setBounds(100,100,950,600);
        setBackground(WHITE230);
        setLayout(null);
    }
}
