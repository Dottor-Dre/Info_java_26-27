public class Playlist {
    private String nome;
    private int indiceBranoCorrente; private String stato;
    private Canzone[] brani;
    private int numeroBraniInseriti;
    private static final int MAX_BRANI = 100;

    public Playlist(String nome, Canzone[] canzoniIniziali) {
        this.nome = nome;
        this.stato = "STOP";
        this.brani = new Canzone[MAX_BRANI];
        this.numeroBraniInseriti = 0;
        this.indiceBranoCorrente = 0;
        if (canzoniIniziali != null) {
            for (Canzone c : canzoniIniziali) {
                if (c != null && this.numeroBraniInseriti < MAX_BRANI) {
                    this.brani[this.numeroBraniInseriti++] = c;
                }
            }
        }
    }


    public String getNome() {
        return nome;
    }

    public int getQuantiBrani() {
        return numeroBraniInseriti;
    }

    public String getStato() {
        return stato;
    }


    public Canzone getCanzone(int numeroBrano) {
        int indice = numeroBrano - 1;
        if (indice >= 0 && indice < numeroBraniInseriti) {
            return brani[indice];
        }
        return null;
    }


    public boolean add(Canzone c) {
        if (numeroBraniInseriti < MAX_BRANI && c != null) {
            brani[numeroBraniInseriti++] = c;
            return true;
        }
        return false;
    }

    public String durataTotale() {
        int secondiTotali = 0;
        for (int i = 0; i < numeroBraniInseriti; i++) {
            secondiTotali += brani[i].getDurataInSecondi();
        }
        int min = secondiTotali / 60;
        int sec = secondiTotali % 60;
        return min + " minuti e " + sec + " secondi";
    }

    public void play() {
        if (numeroBraniInseriti > 0) {
            stato = "PLAY";
        }
    }

    public void pause() {
        if (stato.equals("PLAY")) {
            stato = "PAUSE";
        }
    }

    public void stop() {
        stato = "STOP";
        indiceBranoCorrente = 0;
    }

    public void branoSuccessivo() {
        if (numeroBraniInseriti > 0) {
            indiceBranoCorrente = (indiceBranoCorrente + 1) % numeroBraniInseriti;
        }
    }

    public void branoPrecedente() {
        if (numeroBraniInseriti > 0) {
            indiceBranoCorrente = (indiceBranoCorrente - 1 + numeroBraniInseriti) % numeroBraniInseriti;
        }
    }


    @Override
    public String toString() {
        String infoBranoCorrente = "nessun brano";
        if (numeroBraniInseriti > 0 && brani[indiceBranoCorrente] != null) {
            infoBranoCorrente = brani[indiceBranoCorrente].getTitolo() + " di " + brani[indiceBranoCorrente].getArtista();
        }
        return "Playlist " + nome + ", " + numeroBraniInseriti + " brani, in " + stato + " sul brano " + infoBranoCorrente;
    }
}