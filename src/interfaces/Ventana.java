package interfaces;

import interfaces.Paneles.*;
import interfaces.Paneles.Botones.Boton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame implements ActionListener {

    private PanelIzquierdo Pizq;
    private PanelSuperior Psup;
    private PanelInicio Ppri;
    private PanelWeb Pweb;

    private Boton inicio;
    private Boton web;

    public Ventana() {
        super("Paneles");

        this.setBounds(400, 250, 1050, 700);
        this.setLayout(null);

        Ppri = new PanelInicio();
        add(Ppri);

        Pizq = new PanelIzquierdo();
        add(Pizq);
        añadirBotonesPIzq();

        Psup = new PanelSuperior();
        add(Psup);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void añadirBotonesPIzq() {
        inicio = new Boton("inicio", "src/multimedia/inicio.png", 10, 100, 80, 80);
        inicio.addActionListener(this);
        Pizq.add(inicio);

        web = new Boton("web", "src/multimedia/web.png", 10, 200, 80, 80);
        web.addActionListener(this);
        Pizq.add(web);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object b = e.getSource();

        if (b == inicio) {
            Ppri.setVisible(true);
        } else {
            Pweb = new PanelWeb();
            add(Pweb);
            Ppri.setVisible(false);
        }
    }

}
