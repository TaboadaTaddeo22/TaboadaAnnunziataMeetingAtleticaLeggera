/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

/**
 *
 * @author taboada.taddeo
 */
public class Lanciatore extends Atleta {
    // Attributi
    double distanza;

    public Lanciatore(String nome, String nazionalita, String numero) {
        super(nome, nazionalita, numero);
        this.distanza = 0;
    }
    
    @Override
    public double calcolaPunteggio() {
        return distanza;
    }

    public double getDistanza() {
        return distanza;
    }

    public void setDistanza(double distanza) {
        this.distanza = distanza;
    }

    @Override
    public String toString() {
        return super.toString() + "Lanciatore{" + "distanza=" + distanza + '}';
    }

}
