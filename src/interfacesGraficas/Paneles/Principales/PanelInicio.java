package interfacesGraficas.Paneles.Principales;

import interfacesGraficas.Paneles.SubPanel;
import java.awt.Color;

public class PanelInicio extends PanelPrincipal{
    
    private SubPanel PSizq;
    private SubPanel PScen;
    private SubPanel PSder;
    private SubPanel PIizq;
    private SubPanel PIder;
    
    public PanelInicio () {

        PSizq = new SubPanel(50,50,270,200, GREEN180);
        add(PSizq);
        
        PScen = new SubPanel(340,50,270,200, ORANGE137);
        add(PScen);
        
        PSder = new SubPanel(630,50,270,200, GREEN180);
        add(PSder);
        
        PIizq = new SubPanel(50,275,460,250, Color.WHITE);
        add(PIizq);
        
        PIder = new SubPanel(530,275,370,250, Color.WHITE);
        add(PIder);
        
    }
    
}
