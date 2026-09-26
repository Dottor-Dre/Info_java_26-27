public class LampadinaIntelligente {
    int potenza;
    int illuminazione;
    String colore;
    String nome;
    String stato;
    public LampadinaIntelligente( ){
        this.potenza = 40;
        this.illuminazione = 50;
        this.colore = "bianco";
        this.nome = "";
        this.stato = "spento";

    }

    public LampadinaIntelligente(LampadinaIntelligente l){
        this.potenza = l.potenza;
        this.illuminazione = l.illuminazione;
        this.colore = l.colore;
        this.stato = l.stato;
        this.nome = l.nome;

    }
    public void accendi(){
        this.stato = "accesa";
    }
    public void spegni(){
        this.stato = "spento";
    }
    public void aumentaIlluminazione(){
        if (illuminazione < 100){
            this.illuminazione += 10;
        }
    }
    public void diminusiciIlluminazione(){
        if (illuminazione > 0){
            this.illuminazione -= 10;
        }
    }
    public void get(String name){
        this.nome = name;
    }
    public void set(String color){
        this.colore = color;
    }
    public String toString(){
        return "Nome: " + this.nome + ", Potenza: " + this.potenza + " watt, Stato: "
        + this.stato + ", Qta: " + this.illuminazione + "%, Colore: " + this.colore;
    }

}
