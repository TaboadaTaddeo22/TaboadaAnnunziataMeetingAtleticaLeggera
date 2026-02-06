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
public class CorsaOstacoli extends Gara {
    
    public CorsaOstacoli(String nome) {
        super(nome);
    }
    
    @Override
    public void gioca() {
        Random r = new Random();
        
        for (Atleta a : atleti) {
            if (a instanceof Velocista v) {
                v.setTempo(r.nextDouble(12.8, 14.0));
                v.calcolaPunteggio();  
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
