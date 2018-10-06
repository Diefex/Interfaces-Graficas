package interfacesGraficas.Labels;

import interfacesGraficas.Colores;
import interfacesGraficas.Fuentes;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Label extends JLabel implements Fuentes, Colores{
    
    public Label (String ruta, int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        ImageIcon img = new ImageIcon(ruta);
        ImageIcon icn = new ImageIcon(img.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        this.setIcon(icn);
    }
    
    public Label (String txt, Font fuente, Color color, int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setFont(fuente);
        this.setForeground(color);
        this.setText(txt);
        this.setVerticalTextPosition(CENTER);
        this.setHorizontalTextPosition(RIGHT);
    }
    
}
