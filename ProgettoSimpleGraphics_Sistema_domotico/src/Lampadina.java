import graphics.Color;
import graphics.Ellipse;

public class Lampadina {
    private int potenza;
    private int illuminazione;
    private String colore;
    private String nome;
    private String stato;
    private double x = Math.random()*878;
    private double y = Math.random()*934;

    public Lampadina(int potenza ){
        this.potenza = potenza;
        this.illuminazione = 50;
        this.colore = "bianco";
        this.nome = "";
        this.stato = "spento";
    }

    public Lampadina(Lampadina l){
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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }
    public void setStato(String stato) {
        this.stato = stato;
    }
    public void setIlluminazione(int illuminazione) {
        this.illuminazione = illuminazione;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getIlluminazione() {
        return illuminazione;
    }

    public void disegna(){
        Ellipse e = new Ellipse(x, y, 50, 50);

    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Potenza: " + this.potenza + " Watt, Accesa: " + stato + ", Intensità: " + this.illuminazione + ", Colore: " + this.colore;
    }
}