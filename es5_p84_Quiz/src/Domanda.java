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
    public boolean completata(){
        if (risposta_utente == -1){
            return false;
        }
        return true;
    }
    public int getRispostaCorretta(){return risposta_giusta;}
    public String getRispostaData(){
        if (risposta_utente == -1){
            return null;
        }
        return opzioni[risposta_giusta].risposta;
    }
    @Override
    public String toString(){
        return domanda + "\n1)" + opzioni[0].risposta + "\n2)" + opzioni[1].risposta + "\n3)" + opzioni[2].risposta + "\n4)" + opzioni[3].risposta;
    }

}
