/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.*;

/**
 * Classe LancioGiavellotto
 * @author taboada.taddeo
 */
public class LancioGiavellotto extends Gara {
    
    /**
     * Metodo costruttore di LancioGiavellotto
     * @param nome nome dell'evento
     */
    public LancioGiavellotto(String nome) {
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
                l.setDistanza(r.nextDouble(80.0, 95.0));
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
        return "=== Ecco il risultato della gara di lancio del giavellotto === \n" + this.stampaGara();
    }
}
