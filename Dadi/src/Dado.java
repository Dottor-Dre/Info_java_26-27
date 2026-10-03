import java.util.Random;
public class Dado {
    int facce;
    int UltimoLancio;
    private int contatore = 0;
    private int somma  = 0;

    public Dado(int facce){
        if (facce < 2){
            this.facce = 6;
        } else if (facce == 3){
            this.facce = 6;
        } else {
            this.facce = facce;
        }
        this.UltimoLancio = 0;
    }
    public Dado(Dado facce){
        this.facce = facce.facce;
    }
    public int lancia(){
        Random r = new Random();
        this.UltimoLancio = r.nextInt(this.facce) + 1;
        this.contatore ++;
        this.somma += this.UltimoLancio;
        return this.UltimoLancio;
    }

    public int getUltimoLancio(){
        return this.UltimoLancio;
    }

    @Override
    public String toString(){
        return "Questo dado ha:" + this.facce + " facce. Finora sono stati fatti: " + contatore + " lanci e la loro somma è: " + somma;
    }
    public void getFacce(int n){
        this.facce = n;
    }
}
