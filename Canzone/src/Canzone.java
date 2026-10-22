public class Canzone {
    private String titolo;
    private int minuti;
    private int secondi;
    private String artista;

    // Costruttore
    public Canzone(String titolo, int minuti, int secondi, String artista) {
        this.titolo = titolo;
        this.minuti = minuti;
        // Gestione di sicurezza nel caso i secondi inseriti siano 60 o più
        this.minuti += secondi / 60;
        this.secondi = secondi % 60;
        this.artista = artista;
    }

    // Metodi Get
    public String getTitolo() {
        return titolo;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    // Metodo utile per calcoli agevoli (es. durata totale in secondi)
    public int getDurataInSecondi() {
        return (this.minuti * 60) + this.secondi;
    }

    public String getArtista() {
        return artista;
    }

    // Metodo toString richiesto
    @Override
    public String toString() {
        return "Titolo: " + titolo + "\n" +
                "Durata: " + minuti + " minuti e " + secondi + " secondi\n" +
                "Artista: " + artista;
    }
}