package interfacesGraficas.Paneles.Principales;

import interfacesGraficas.Paneles.SubPanel;
import java.awt.Color;

public class PanelConfig extends PanelPrincipal{
    
    private SubPanel S1;
    private SubPanel S1O1;
    private SubPanel S1O2;
    private SubPanel S1O3;
    private SubPanel S1O4;
    private SubPanel S2;
    private SubPanel S2O1;
    private SubPanel S2O2;
    private SubPanel S2O3;
    private SubPanel S2O4;

    public PanelConfig () {
        S1 = new SubPanel (50,50,850,50, BLUE171);
        add(S1);
        
        S1O1 = new SubPanel (50,120,415,75, Color.WHITE);
        add(S1O1);
        
        S1O2 = new SubPanel (485,120,415,75, Color.WHITE);
        add(S1O2);
        
        S1O3 = new SubPanel (50,215,415,75, Color.WHITE);
        add(S1O3);
        
        S1O4 = new SubPanel (485,215,415,75, Color.WHITE);
        add(S1O4);
        
        S2 = new SubPanel (50,310,850,50, BLUE171);
        add(S2);
        
        S2O1 = new SubPanel (50,380,415,75, Color.WHITE);
        add(S2O1);
        
        S2O2 = new SubPanel (485,380,415,75, Color.WHITE);
        add(S2O2);
        
        S2O3 = new SubPanel (50,475,415,75, Color.WHITE);
        add(S2O3);
        
        S2O4 = new SubPanel (485,475,415,75, Color.WHITE);
        add(S2O4);
        
    }
    
}
