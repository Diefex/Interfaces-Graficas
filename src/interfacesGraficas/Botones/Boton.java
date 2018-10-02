package interfacesGraficas.Botones;

import interfacesGraficas.Fuentes;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Boton extends JButton implements Fuentes {
    
    public Boton (String texto ,String ruta, int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setFocusable(false);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.setForeground(Color.WHITE);
        this.setFont(Century);
        this.setText(texto);
        this.setHorizontalTextPosition(CENTER);
        this.setVerticalTextPosition(BOTTOM);
        ImageIcon img = new ImageIcon(ruta);
        ImageIcon icono = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        this.setIcon(icono);
    }
    
}
