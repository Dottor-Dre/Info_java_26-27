public class ContoCorrente {
    String nome;
    String cognome;
    String codice;
    double saldo;

    public ContoCorrente() throws PrelievoNonValidoExeption, DepositoNonValidoExeption{
        this.nome = "Francesco";
        this.cognome = "Drera";
        this.codice = "X7K9P2W4";
        this.saldo = 100;
    }
    public double preleva(double s){
        if (s >= 0 || this.saldo - s >= 0){
            this.saldo -= s;
        }
        throw new PrelievoNonValidoExeption();
    }
    public double deposita(double s){
        if (s >= 0){
            this.saldo += s;
        }
        throw new DepositoNonValidoExeption();
    }
    public double getSaldo(){return this.saldo;}
    public String getCodice(){return this.codice;}
    public String getNominativo(){return this.nome + " " + this.cognome;}
    @Override
    public String toString(){
        return "Nome: " + this.nome + " Cognome: " + this.cognome + " Codice: " + this.codice + " Saldo: " + this.saldo;
    }
}
