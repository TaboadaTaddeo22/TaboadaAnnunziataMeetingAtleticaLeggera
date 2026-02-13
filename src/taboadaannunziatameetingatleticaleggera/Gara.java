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
public abstract class Gara {
    // Attributi
    protected ArrayList<Atleta> atleti;
    protected String nome;
    protected StringBuilder risultato;

    public Gara(String nome) {
        this.atleti = new ArrayList<>();
        this.nome = nome;
        this.risultato = new StringBuilder();
    }
    
    public void aggiungiAtleta(Atleta a) {
        for (Atleta atleta: atleti) {
            if (a.equals(atleta) || a.getClass() != atleta.getClass())
                return;
        }
        atleti.add(a);
    }
    
    public void rimuoviAtleta(Atleta a) {
        for (Atleta atleta: atleti) {
            if (a.equals(atleta)) {
                atleti.remove(a);
                return;
            }
        }
    }
    
    public abstract void gioca();
    
    public abstract String stampaRisultato();

    public String getNome() {
        return nome;
    }

    public ArrayList<Atleta> getAtleti() {
        return atleti;
    }

    public StringBuilder stampaGara() {
        int i = 1;
        for (Atleta a: atleti) {
            risultato.append(i + "° Posto " + a.toString() + "\n");
            i++;
        }
        return risultato;
    }
    
}
