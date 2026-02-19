/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.ArrayList;

/**
 * Classe Meeting
 * @author taboada.taddeo
 */
public class Meeting {
    // Attributi
    private ArrayList<Gara> eventi;

    /**
     * Costruttore di Meeting
     */
    public Meeting() {
        this.eventi = new ArrayList<>();
    }
    
    /**
     * Metodo che aggiunge una gara al meeting
     * @param g gara da aggiungere
     */
    public void aggiungiGara(Gara g) {
        for (Gara gara: eventi) {
            if (g.equals(gara))
                return;
        }
        eventi.add(g);
    }
    
    /**
     * Metodo che rimuove una gara al meeting
     * @param g gara da rimuovere
     */
    public void rimuoviGara(Gara g) {
        for (Gara gara: eventi) {
            if (g.equals(gara)) {
                eventi.remove(g);
                return;
            }
        }
    }

    /**
     * Metodo get di eventi
     * @return eventi
     */
    public ArrayList<Gara> getEventi() {
        return eventi;
    }
    
    
}
