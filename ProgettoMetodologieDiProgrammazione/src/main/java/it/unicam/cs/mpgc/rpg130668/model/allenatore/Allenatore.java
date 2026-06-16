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
