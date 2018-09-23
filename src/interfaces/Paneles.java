
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
    private JPanel Ppri;
    private JPanel PSizq;
    private JPanel PScen;
    private JPanel PSder;
    private JPanel PIizq;
    private JPanel PIder;
    private JPanel fondo;
    
    private Panel p1;
    
    public Paneles () {
        super("Paneles");
        
        this.setBounds(400,250,1050,700);
        
        Color White230 = new Color(230,230,230);
        Color White220 = new Color(220,220,220);
        Color Black21 = new Color(21,21,21);
        Color Green180 = new Color(134,180,4);
        Color Orange137 = new Color(255,137,0);
        
        p1 = new Panel();
        
        
        fondo = new JPanel();
        fondo.setBounds(0,0,1050,700);
        fondo.setBackground(Color.WHITE);
             
        Ppri = new JPanel();
        Ppri.setBounds(100,100,950,600);
        Ppri.setBackground(White230);
        
        Pizq = new JPanel();
        Pizq.setBounds(0,0,100,700);
        Pizq.setBackground(Black21);
        Pizq.setLayout(null);
        
        Psup = new JPanel();
        Psup.setBounds(100,0,950,100);
        Psup.setBackground(White220);
        
        PSizq = new JPanel();
        PSizq.setBounds(150,150,270,200);
        PSizq.setBackground(Green180);
        
        PScen = new JPanel();
        PScen.setBounds(440,150,270,200);
        PScen.setBackground(Orange137);
        
        PSder = new JPanel();
        PSder.setBounds(730,150,270,200);
        PSder.setBackground(Green180);
        
        PIizq = new JPanel();
        PIizq.setBounds(150,375,460,250);
        PIizq.setBackground(Color.WHITE);
        
        PIder = new JPanel();
        PIder.setBounds(630,375,370,250);
        PIder.setBackground(Color.WHITE);
        
        add(PIder);
        add(PIizq);
        add(PSder);
        add(PScen);
        add(PSizq);
        add(Ppri);
        add(Pizq);
        add(Psup);
        add(fondo);
        
        fondo.add(p1);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
