/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.*;

/**
 * Classe CentoMetri
 * @author taboada.taddeo
 */
public class CentoMetri extends Gara {

    /**
     * Metodo costruttore di CentoMetri
     * @param nome nome dell'evento
     */
    public CentoMetri(String nome) {
        super(nome);
    }
    
    /**
     * Metodo che assegna le performance agli atleti e che ordina le loro prestazioni
     */
    @Override
    public void gioca() {
        Random r = new Random();
        
        for (Atleta a : atleti) {
            if (a instanceof Velocista v) {
                v.setTempo(r.nextDouble(9.5, 11.5));
                v.setTempo(v.calcolaPunteggio());
            }         
        }
        
        atleti.sort(
        Comparator.comparingDouble(a -> ((Velocista) a).getTempo())
        );
    }
    
    /**
     * Metodo che stampa il risultato dell'evento
     * @return il risultato dell'evento con posizioni degli atleti
     */
    @Override
    public String stampaRisultato() {
        return "=== Ecco il risultato della gara di 100 metri piani === \n" + this.stampaGara();
    }
}
