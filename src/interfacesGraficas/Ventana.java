package interfacesGraficas;

import interfacesGraficas.Paneles.PanelSuperior;
import interfacesGraficas.Paneles.Principales.*;
import interfacesGraficas.Paneles.PanelIzquierdo;
import interfacesGraficas.Botones.Boton;
import interfacesGraficas.Labels.Label;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener, Fuentes, Colores {

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
    private Boton help;

    private Label perfil;

    private JTextField t;

    public Ventana() {
        super("Paneles");

        this.setBounds(400, 250, 1050, 700);
        this.setLayout(null);

        Pweb = new PanelWeb();
        add(Pweb);
        Pweb.setVisible(false);

        Pconfig = new PanelConfig();
        add(Pconfig);
        Pconfig.setVisible(false);

        Pinc = new PanelInicio();
        add(Pinc);
        Pinc.setVisible(true);

        Pizq = new PanelIzquierdo();
        add(Pizq);
        setPizq();

        Psup = new PanelSuperior();
        add(Psup);
        setPsup();
        
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void setPizq() {
        String multimedia = new String("src/multimedia/");

        inicio = new Boton("inicio", multimedia + "icnInicio.png", 10, 100, 80, 80);
        inicio.addActionListener(this);
        Pizq.add(inicio);

        web = new Boton("web", multimedia + "icnWeb.png", 10, 200, 80, 80);
        web.addActionListener(this);
        Pizq.add(web);

        config = new Boton("Config.", multimedia + "icnOpciones.png", 5, 300, 90, 80);
        config.addActionListener(this);
        Pizq.add(config);

        cerrar = new Boton("cerrar", multimedia + "icnCerrar.png", 10, 500, 80, 80);
        cerrar.addActionListener(this);
        Pizq.add(cerrar);
    }

    private void setPsup() {
        String multimedia = new String("src/multimedia/");

        mensaje = new Boton(multimedia + "icnMensaje.png", 600, 35, 30, 30);
        mensaje.addActionListener(this);
        Psup.add(mensaje);

        notif = new Boton(multimedia + "icnNotificacion.png", 650, 35, 30, 30);
        notif.addActionListener(this);
        Psup.add(notif);

        help = new Boton(multimedia + "icnHelp.png", 700, 35, 30, 30);
        help.addActionListener(this);
        Psup.add(help);

        perfil = new Label("Grensesnitt", Brush70, ORANGE137, 20, 10, 300, 80);
        Psup.add(perfil);
        
        t = new JTextField();
        t.setBounds(300, 35, 200, 30);
        Psup.add(t);
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
