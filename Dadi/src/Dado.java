import java.util.Random;
public class Dado {
    Random rand = new Random();
    int N;
    public Dado(){
        this.N = 6;
    }
    public Dado(int N){
        if (N < 2){
            this.N = 6;
        } else if (N == 3){
            this.N = 6;
        }
    }
    public Dado(Dado N){
        this.N = N.N;
    }
    public int lancia(){
        return rand.nextInt(this.N) + 1;
    }
    @Override
    public String toString(){
        return "Questo dado ha:" + this.N + " facce";
    }
    public void getFacce(int n){
        this.N = n;
    }
}
