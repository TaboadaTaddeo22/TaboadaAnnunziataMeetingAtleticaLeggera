/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import java.util.Objects;

/**
 *
 * @author taboada.taddeo
 */
public abstract class Atleta {
    // Attributi
    protected String nome;
    protected String nazionalita;
    protected String numero;

    public Atleta(String nome, String nazionalita, String numero) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.numero = numero;
    }
    
    public abstract double calcolaPunteggio();

    public String getNome() {
        return nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public String getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

     public void setNumero(String numero) {
        this.numero = numero;
    }
    
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
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.nazionalita, other.nazionalita);
    }

    @Override
    public String toString() {
        return nome + ", " + nazionalita + ", " + numero;
    }

}
