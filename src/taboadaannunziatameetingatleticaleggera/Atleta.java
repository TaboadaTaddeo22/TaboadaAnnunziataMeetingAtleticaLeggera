/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.Objects;

/**
 * Classe Atleta
 * @author taboada.taddeo
 */
public abstract class Atleta {
    // Attributi
    protected String nome;
    protected String nazionalita;
    protected int numero;

    /**
     * Metodo costruttore di Atleta
     * @param nome nome e cognome dell'atleta
     * @param nazionalita nazionalità dell'atleta
     * @param numero pettorale dell'atleta
     */
    public Atleta(String nome, String nazionalita, int numero) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.numero = numero;
    }
    
    /**
     * Metodo che calcola il risultato dell'atleta
     * @return il punteggio dell'atleta
     */
    public abstract double calcolaPunteggio();

    /**
     * Metodo get di nome
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo get di nazionalita
     * @return nazionalita
     */
    public String getNazionalita() {
        return nazionalita;
    }

    /**
     * Metodo get di numero
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Metodo set di nome
     * @param nome nuovo nome da impostare
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo set di nazionalita
     * @param nazionalita nuova nazionalità da impostare
     */
    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    /**
     * Metodo set di numero
     * @param numero nuovo numero da impostare
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Override del metodo equals
     * @param obj l'atleta da confrontare
     * @return true se gli atleti hanno lo stesso numero false altrimenti
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atleta other = (Atleta) obj;
        return this.numero == other.numero;
    }
    
    

    /**
     * Override del metodo toString()
     * @return gli attributi di atleta
     */
    @Override
    public String toString() {
        return nome + ", " + nazionalita + ", " + numero;
    }

}
