/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.ArrayList;

/**
 * Classe Gara
 * @author taboada.taddeo
 */
public abstract class Gara {
    // Attributi
    protected ArrayList<Atleta> atleti;
    protected String nome;

    /**
     * Costruttore di Gara
     * @param nome della gara
     */
    public Gara(String nome) {
        this.atleti = new ArrayList<>();
        this.nome = nome;
    }
    
    /**
     * Metodo che aggiunge un atleta alla gara
     * @param a atleta da aggiungere
     */
    public boolean aggiungiAtleta(Atleta a) {
        for (Atleta atleta: atleti) {
            if (a.equals(atleta))
                return false;
        }
        atleti.add(a);
        return true;
    }
    
    /**
     * Metodo che rimuove un atleta alla gara
     * @param a atleta da rimuovere
     */
    public void rimuoviAtleta(Atleta a) {
        atleti.remove(a);
    }
    
    /**
     * Metodo che assegna le performance agli atleti e che ordina le loro prestazioni
     */
    public abstract void gioca();
    
    /**
     * Metodo che stampa il risultato dell'evento
     * @return il risultato dell'evento con posizioni degli atleti
     */
    public abstract String stampaRisultato();

    /**
     * Metodo get di nome
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo get di atleti
     * @return atleti
     */
    public ArrayList<Atleta> getAtleti() {
        return atleti;
    }

    /**
     * Metodo che stampa il risultato della Gara con posizioni in classifica
     * @return risultato
     */
    public StringBuilder stampaGara() {
        StringBuilder risultato = new StringBuilder();
        int i = 1;
        for (Atleta a: atleti) {
            risultato.append(i + "° Posto " + a.toString() + "\n");
            i++;
        }
        return risultato;
    }
    
}
