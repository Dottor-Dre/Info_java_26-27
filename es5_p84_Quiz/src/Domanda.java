public class Domanda {
    Risposta[] opzioni;
    String domanda;
    int risposta_giusta;
    int risposta_utente = -1;
    int valore;
    private final int MAX_RISPOSTE = 4;

    public Domanda(String domanda, Risposta[] r, int risposta_giusta){
        opzioni = new Risposta[MAX_RISPOSTE];
        this.domanda = domanda;
        opzioni = r;
        valore = 1;
        this.risposta_giusta = risposta_giusta;
    }
    public Domanda(Domanda d){
        opzioni = d.opzioni;
        domanda = d.domanda;
    }
    public boolean rispondi(int risposta){
        risposta_utente = risposta;
        if (opzioni[risposta-1].giusto){
            return true;
        }
        return false;
    }

    public void setValore(int v){
        if (v >= 0){
            valore = v;
        }
    }
    public int getValore(){return valore;}
    public int getPunteggio(){
        if (risposta_utente == -1){
            return -1;
        } else if (rispondi(risposta_utente)){
            return valore;
        }
        return 0;
    }
}
