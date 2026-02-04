/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.ArrayList;

/**
 *
 * @author taboada.taddeo
 */
public class Meeting {
    // Attributi
    private ArrayList<Gara> eventi;

    public Meeting() {
        this.eventi = new ArrayList<>();
    }
    
    public void aggiungiGara(Gara g) {
        for (Gara gara: eventi) {
            if (g.equals(gara))
                return;
        }
        eventi.add(g);
    }
    
    public void rimuoviGara(Gara g) {
        for (Gara gara: eventi) {
            if (g.equals(gara)) {
                eventi.remove(g);
                return;
            }
        }
    }

    public ArrayList<Gara> getEventi() {
        return eventi;
    }
    
    
}
