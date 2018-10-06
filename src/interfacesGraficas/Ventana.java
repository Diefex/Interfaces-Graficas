package interfacesGraficas;

import interfacesGraficas.Paneles.PanelSuperior;
import interfacesGraficas.Paneles.Principales.*;
import interfacesGraficas.Paneles.PanelIzquierdo;
import interfacesGraficas.Botones.Boton;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {

    private PanelIzquierdo Pizq;
    private PanelSuperior Psup;
    private PanelInicio Pinc;
    private PanelWeb Pweb;
    private PanelConfig Pconfig;

    private Boton inicio;
    private Boton web;
    private Boton cerrar;
    private Boton config;
    
    private Boton mensaje;
    private Boton notif;
    
    private JLabel perfil;
    
    private JTextField t;

    public Ventana() {
        super("Paneles");

        this.setBounds(400, 250, 1050, 700);
        this.setLayout(null);
        
        Pweb = new PanelWeb();
        add(Pweb);
        Pweb.setVisible(false);
        
        Pconfig = new PanelConfig ();
        add(Pconfig);
        Pconfig.setVisible(false);

        Pinc = new PanelInicio();
        add(Pinc);
        Pinc.setVisible(true);

        Pizq = new PanelIzquierdo();
        add(Pizq);
        añadirBotonesPizq();
        
        Psup = new PanelSuperior();
        add(Psup);
        añadirBotonesPsup();

        perfil = new JLabel();
        perfil.setBounds(845, 20, 60, 60);
        ImageIcon p = new ImageIcon("src/multimedia/imgPerfil.jpg");
        ImageIcon pi = new ImageIcon(p.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        perfil.setIcon(pi);
        Psup.add(perfil);
        
        t = new JTextField();
        t.setBounds(300, 35, 100, 30);
        Psup.add(t);
        
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void añadirBotonesPizq() {
        String multimedia = new String("src/multimedia/");
        
        inicio = new Boton("inicio", multimedia+"icnInicio.png", 10,100,80,80);
        inicio.addActionListener(this);
        Pizq.add(inicio);

        web = new Boton("web", multimedia+"icnWeb.png", 10,200,80,80);
        web.addActionListener(this);
        Pizq.add(web);
        
        config = new Boton ("Config.", multimedia+"icnOpciones.png", 5,300,90,80);
        config.addActionListener(this);
        Pizq.add(config);
       
        cerrar = new Boton ("cerrar", multimedia+"icnCerrar.png", 10,500,80,80);
        cerrar.addActionListener(this);
        Pizq.add(cerrar);
    }
    
    private void añadirBotonesPsup () {
        String multimedia = new String("src/multimedia/");
        
        mensaje = new Boton("", multimedia+"icnMensaje.png", 50,25,50,50);
        mensaje.addActionListener(this);
        Psup.add(mensaje);
        
        notif = new Boton("", multimedia+"icnNotificacion.png", 100,25,50,50);
        notif.addActionListener(this);
        Psup.add(notif);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object b = e.getSource();

        if (b == inicio) {
            Pinc.setVisible(true);
            Pconfig.setVisible(false);
            Pweb.setVisible(false);
        } 
        if (b == web) {
            Pweb.setVisible(true);
            Pinc.setVisible(false);
            Pconfig.setVisible(false);
        }
        if (b == config) {
            Pconfig.setVisible(true);
            Pinc.setVisible(false);
            Pweb.setVisible(false);
        }
        
        if (b == cerrar) {
            System.exit(0);
        }
    }

}
