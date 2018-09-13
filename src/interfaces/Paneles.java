
package interfaces;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paneles extends JFrame {
    
    private JPanel Pizq;
    private JPanel Psup;
    private JPanel Ppri;
    private JPanel PSizq;
    private JPanel PScen;
    private JPanel PSder;
    private JPanel PIizq;
    private JPanel PIder;
    private JPanel fondo;
    
    public Paneles () {
        super("Paneles");
        
        this.setBounds(400,250,1050,700);
        
        fondo = new JPanel();
        fondo.setBounds(0,0,1050,700);
        fondo.setBackground(new Color(250,250,250));
        
        Ppri = new JPanel();
        Ppri.setBounds(100,100,950,600);
        Ppri.setBackground(new Color(230,230,230));
        
        Pizq = new JPanel();
        Pizq.setBounds(0,0,100,700);
        Pizq.setBackground(new Color(21,21,21));
        Pizq.setLayout(null);
        
        Psup = new JPanel();
        Psup.setBounds(100,0,950,100);
        Psup.setBackground(new Color(220,220,220));
        
        PSizq = new JPanel();
        PSizq.setBounds(150,150,270,200);
        PSizq.setBackground(new Color(134,180,4));
        
        PScen = new JPanel();
        PScen.setBounds(440,150,270,200);
        PScen.setBackground(new Color(255,137,0));
        
        PSder = new JPanel();
        PSder.setBounds(730,150,270,200);
        PSder.setBackground(new Color(134,180,4));
        
        PIizq = new JPanel();
        PIizq.setBounds(150,375,460,250);
        PIizq.setBackground(new Color(255,255,255));
        
        PIder = new JPanel();
        PIder.setBounds(630,375,370,250);
        PIder.setBackground(new Color(255,255,255));
        
        add(PIder);
        add(PIizq);
        add(PSder);
        add(PScen);
        add(PSizq);
        add(Ppri);
        add(Pizq);
        add(Psup);
        add(fondo);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
