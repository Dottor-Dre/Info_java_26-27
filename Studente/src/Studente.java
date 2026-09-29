public class Studente {
    String nome;
    String cognome;
    int eta;
    double altezza;
    double massa;

    public Studente(){
        this.nome = "Francesco";
        this.cognome = "Drera";
        this.eta = 16;
        this.altezza = 175.5;
        this.massa = 85.5;
    }
    public Studente (Studente s){
        this.nome = s.nome;
        this.cognome = s.cognome;
        this.eta = s.eta;
        this.altezza = s.altezza;
        this.massa = s.massa;
    }

    public String calcolaIndice(Studente s){
        String valore;
        double bmi= s.massa/(s.altezza*s.altezza);
        if (bmi < 18.5){valore = "Sottopeso";}
        else if (bmi < 24.9){valore = "Normopeso";}
        else if (bmi < 29.9){valore = "Sovrappeso";}
        else {valore = "Obestià";}
        return valore + bmi;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getCognomome() {return cognome;}
    public void setCognoome(String nome) {this.cognome = nome;}
}
