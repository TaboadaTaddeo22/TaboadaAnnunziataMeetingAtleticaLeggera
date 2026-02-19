/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.*;

/**
 * Classe LancioMartello
 * @author taboada.taddeo
 */
public class LancioMartello extends Gara {
    
    /**
     * Metodo costruttore di LancioMartello
     * @param nome nome dell'evento
     */
    public LancioMartello(String nome) {
        super(nome);
    }
    
    /**
     * Metodo che assegna le performance agli atleti e che ordina le loro prestazioni
     */
    @Override
    public void gioca() {
        Random r = new Random();
        
        for (Atleta a : atleti) {
            if (a instanceof Lanciatore l) {
                l.setDistanza(r.nextDouble(72.0, 84.0));
                l.setDistanza(l.calcolaPunteggio());
            }    
        }
        
        atleti.sort(
        Comparator.comparingDouble(a -> ((Lanciatore) a).getDistanza()).reversed()
        );
    }
    
    /**
     * Metodo che stampa il risultato dell'evento
     * @return il risultato dell'evento con posizioni degli atleti
     */
    @Override
    public String stampaRisultato() {
        return "=== Ecco il risultato della gara di lancio del martello === \n" + this.stampaGara();
    }
}
