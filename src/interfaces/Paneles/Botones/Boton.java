package interfaces.Paneles.Botones;

import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Diefex
 */
public class Boton extends JButton{
    
    public Boton (String texto ,String ruta, int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //this.setText(texto);
        this.setIcon(new ImageIcon(ruta));
    }
    
}
