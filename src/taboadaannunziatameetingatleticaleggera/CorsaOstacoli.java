/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;
import java.util.*;

/**
 * Classe CorsaOstacoli
 * @author taboada.taddeo
 */
public class CorsaOstacoli extends Gara {
    
    /**
     * Metodo costruttore di CorsaOstacoli
     * @param nome nome dell'evento
     */
    public CorsaOstacoli(String nome) {
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
                v.setTempo(r.nextDouble(12.8, 14.0));
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
        return "=== Ecco il risultato della gara di 110 metri a ostacoli === \n" + this.stampaGara();
    }
}
