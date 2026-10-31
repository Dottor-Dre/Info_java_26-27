public class Quiz {
    String titolo;
    Domanda[] domande;
    private final int MAX_DOMANDE = 100;
    public Quiz(String titolo){
        this.titolo = titolo;
        domande = new Domanda[MAX_DOMANDE];
    }
    public void add(Domanda d){
        for (int i = 0; i < domande.length; i++) {
            if (domande[i] == null){
                domande[i] = d;
            }
        }
    }
    public int getQuanteDomande(){
        int quante=0;
        for (int i = 0; i < domande.length; i++) {
            if (domande[i] != null){
                quante++;
            }
        }
        return quante;
    }
    public int getQuanteRisposte(){
        int quante = getQuanteDomande(), cont= 0 ;
        for (int i = 0; i < quante; i++) {
            if (domande[i].risposta_utente != -1){
                cont++;
            }
        }
        return cont;
    }
    public int[] getDomandeNonDate(){
        int quante = getQuanteDomande(), indice=0;
        int[] non_risposte = new int[quante];
        for (int i = 0; i < quante; i++) {
            if (domande[i].risposta_utente == -1){
                non_risposte[indice] = i;
                indice++;
            }
        }
        return non_risposte;
    }
    public String getDomanda(int indice){
        int quante = getQuanteDomande();
        if (indice > quante){
            return domande[indice].domanda;
        }
        return null;
    }
    public int getTotale(){
        int quante = getQuanteDomande();
        int totale=0;
        for (int i = 0; i < quante; i++) {
            totale += domande[i].valore;
        }
        return totale;
    }

    public int getPunteggio(){
        int quante = getQuanteDomande();
        int totale=0;
        for (int i = 0; i < quante; i++) {
            if (domande[i].risposta_utente != -1){
                totale += domande[i].valore;
            }
        }
        return totale;
    }
}
