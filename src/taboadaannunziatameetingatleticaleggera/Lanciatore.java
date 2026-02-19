/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

/**
 * Classe Lanciatore
 * @author taboada.taddeo
 */
public class Lanciatore extends Atleta {
    // Attributi
    double distanza;

    /**
     * Metodo costruttore di Lanciatore
     * @param nome nome e cognome dell'atleta
     * @param nazionalita nazionalità dell'atleta
     * @param numero pettorale dell'atleta
     */
    public Lanciatore(String nome, String nazionalita, int numero) {
        super(nome, nazionalita, numero);
        this.distanza = 0;
    }
    
    
    /**
     * Metodo che calcola il risultato dell'atleta
     * @return il punteggio dell'atleta
     */
    @Override
    public double calcolaPunteggio() {
        return Math.round(distanza * 100) / 100.0;
    }

    /**
     * Metodo get di distanza
     * @return distanza
     */
    public double getDistanza() {
        return distanza;
    }

    /**
     * Metodo set di distanza
     * @param distanza nuova distanza da impostare
     */
    public void setDistanza(double distanza) {
        this.distanza = distanza;
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
        return super.toString() + ", Distanza raggiunta " + distanza + " m";
    }

}
