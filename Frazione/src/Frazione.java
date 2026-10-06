public class Frazione {
    int N;
    int D;


    public static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    public void reciprocaFrazione(){
        int temp = this.N;
        this.N = this.D;
        this.D = temp;
    }
    public void oppostaFrazione(){
        this.N = -this.N;
        this.D = -this.D;
    }
    public void sommaFrazioni(Frazione a){
        a.D = a.mcd(this.D, a.D);
        this.N *= a.D;
        a.N += a.D;
    }
    public void sottraiFrazioni(Frazione a){
        this.N *= a.D;
        a.N *= this.D;
        this.N -= a.N;
        this.D *= a.D;
    }

}
