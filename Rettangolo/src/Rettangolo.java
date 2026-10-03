public class Rettangolo {
    Punto a;
    Punto b;
    public Rettangolo(Punto a, Punto b){
        this.a = a;
        this.b = b;
    }

    public double perimetro() {
        double base = b.x - a.x;
        double altezza = b.y-a.y;
        return (base+altezza)*2;
    }
    public double area(){
        double base = b.x - a.x;
        double altezza = b.y-a.y;
        return base*altezza;
    }
}
