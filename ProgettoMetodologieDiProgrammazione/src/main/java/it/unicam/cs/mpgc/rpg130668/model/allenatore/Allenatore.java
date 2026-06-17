package it.unicam.cs.mpgc.rpg130668.model.allenatore;

/**
 * E' a tutti gli effetti il personaggio del gioco principale, colui che esplorerà la mappa
 * con la sua squadra dei pokemon
 */
public class Allenatore
{
    //Attributi
    private String id;
    private String username;
    private Posizione posizione;
    private Squadra squadra;

    /**
     * Costruttore della classe Allenatore
     * @param id dell'allenatore
     * @param username dell'allenatore che può cambiare
     * @param posizioneIniziale dell'allenatore all'interno del gioco
     * @throws IllegalArgumentException se id è null o Empty
     * @throws IllegalArgumentException se username è null o lunghezza inferiore a 3
     * @throws IllegalArgumentException se la posizioneIniziale è null o se le coordinate sono negative
     */
    //Costruttore
    public Allenatore(String id, String username, Posizione posizioneIniziale)
    {
        if(id == null || id.isEmpty()) throw new IllegalArgumentException("id non valido");
        if(username == null || username.length() < 3) throw new IllegalArgumentException("username non valido");
        if(posizioneIniziale == null || posizioneIniziale.x() < 0 || posizioneIniziale.y() < 0) throw new IllegalArgumentException("posizione non valida");
        this.id = id;
        this.username = username;
        this.posizione = posizioneIniziale;
        this.squadra = new Squadra();
    }

    public Posizione getPosizione() {
        return posizione;
    }

    public void setPosizione(Posizione posizione) {
        this.posizione = posizione;
    }

    public String getUsername() {
        return username;
    }

    public String getId() {
        return id;
    }

    public Squadra getSquadra() {
        return squadra;
    }
}
