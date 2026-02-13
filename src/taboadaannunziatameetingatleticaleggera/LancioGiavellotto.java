/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.*;

/**
 *
 * @author taboada.taddeo
 */
public class LancioGiavellotto extends Gara {
    
    public LancioGiavellotto(String nome) {
        super(nome);
    }
    
    @Override
    public void gioca() {
        Random r = new Random();
        
        for (Atleta a : atleti) {
            if (a instanceof Lanciatore l) {
                l.setDistanza(r.nextDouble(80.0, 95.0));
                l.calcolaPunteggio();  
            }         
        }
        
        atleti.sort(
        Comparator.comparingDouble(a -> ((Lanciatore) a).getDistanza())
        );
        
        stampaRisultato();
    }
    
    @Override
    public String stampaRisultato() {
        return "=== Ecco il risultato della gara di lancio del giavellotto === \n" + this.toString();
    }
}
