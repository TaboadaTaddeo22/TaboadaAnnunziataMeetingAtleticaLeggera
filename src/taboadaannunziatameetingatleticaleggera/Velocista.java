/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.Random;

/**
 * Classe Velocista
 * @author taboada.taddeo
 */
public class Velocista extends Atleta implements ITempoReazione {
    // Attributi
    private double tempo;

    /**
     * Metodo costruttore di Velocista
     * @param nome nome e cognome dell'atleta
     * @param nazionalita nazionalità dell'atleta
     * @param numero pettorale dell'atleta
     */
    public Velocista(String nome, String nazionalita, int numero) {
        super(nome, nazionalita, numero);
        this.tempo = 0;
    }

    /**
     * Metodo che calcola il risultato dell'atleta
     * @return il punteggio dell'atleta
     */
    @Override
    public double calcolaPunteggio() {
        return Math.round((tempo + tempoReazione()) * 100) / 100.0;
    }
    
    /**
     * Override del metodo tempoReazione dell'interfaccia tempoReazione
     * @return 
     */
    @Override
    public double tempoReazione() {
        Random r = new Random();
        return(r.nextDouble(0.1, 0.2));
    }

    /**
     * Metodo get di tempo
     * @return tempo
     */
    public double getTempo() {
        return tempo;
    }

    /**
     * Metodo set di tempo
     * @param tempo nuovo tempo da impostare
     */
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    /**
     * Metodo che stampa gli attributi di atleta
     * @return atleta.toString()
     */
    public String atletaToString() {
        return super.toString();
    }

    /**
     * Override del metodo toString
     * @return gli attributi del Velocista
     */
    @Override
    public String toString() {
        return super.toString() + ", Tempo impiegato " + tempo + " s";
    }
    
}
