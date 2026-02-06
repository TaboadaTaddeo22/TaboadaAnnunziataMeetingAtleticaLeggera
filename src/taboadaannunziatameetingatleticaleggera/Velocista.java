/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.Random;

/**
 *
 * @author taboada.taddeo
 */
public class Velocista extends Atleta implements ITempoReazione {
    // Attributi
    private double tempo;

    public Velocista(String nome, String nazionalita, String numero) {
        super(nome, nazionalita, numero);
        this.tempo = 0;
    }

    @Override
    public double calcolaPunteggio() {
        return tempo + tempoReazione();
    }
    
    @Override
    public double tempoReazione() {
        Random r = new Random();
        return(r.nextDouble(0.1, 0.2));
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return super.toString() + "Velocista{" + "tempo=" + tempo + '}';
    }
    
}
