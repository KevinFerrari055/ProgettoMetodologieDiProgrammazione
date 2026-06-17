package it.unicam.cs.mpgc.rpg130668.model.pokemon;

/**
 * Implementazione base dei tipi elementali previsti nella prima release.
 * La logica di efficacia tra tipi (es. il Fuoco e' debole contro l'Acqua)
 * NON e' qui: sara' responsabilita' di una classe dedicata (TabellaEfficacia,
 * nel package model.combattimento), cosi' aggiungere un nuovo tipo non
 * richiedera' di modificare i tipi gia' esistenti.
 */
public enum TipoElementale implements TipoPokemon
{
    FUOCO("Fuoco"),
    ACQUA("Acqua"),
    ERBA("Erba"),
    NORMALE("Normale"),
    ELETTRICO("Elettrico");

    private final String nome;

    TipoElementale(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }
}