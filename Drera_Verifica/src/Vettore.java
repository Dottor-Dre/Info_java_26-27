public class Vettore {
    Punto Origine;
    Punto Vertice;

    public Vettore(){
        Origine = new Punto();
        Vertice = new Punto();
    }

    public double calcolaLunghezza(){
        return Math.sqrt(Math.pow(Origine.x - Vertice.x, 2) + Math.pow(Origine.y-Vertice.y, 2));
    }

    public void spostaOrigine(Punto p){
        Origine.x = p.x;
        Origine.y = p.y;
    }

    public boolean verificaOrigine(Punto p){
        if (p.x == Origine.x && p.y == Origine.y){
            return true;
        }
        return false;
    }
}
