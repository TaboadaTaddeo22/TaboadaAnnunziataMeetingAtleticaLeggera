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
public class LancioMartello extends Gara {
    
    public LancioMartello(String nome) {
        super(nome);
    }
    
    @Override
    public void gioca() {
        Random r = new Random();
        
        for (Atleta a : atleti) {
            if (a instanceof Lanciatore l) {
                l.setDistanza(r.nextDouble(72.0, 84.0));
                l.calcolaPunteggio();  
            }         
        }
        
        stampaRisultato();
    }
    
    @Override
    public String stampaRisultato() {
        String risultato = "";
        //atleti.sort(Comparator.comparingDouble(Velocista.getTempo()));
        return risultato;
    }
}
