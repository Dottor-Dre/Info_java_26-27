public class Rettangolo {
    Punto a;
    Punto b;
    private double base=0;
    private double h=0;
    public Rettangolo(Punto a, Punto b){
        this.a = a;
        this.b = b;
        base = b.x-a.x;
        h=b.y-a.y;
        if (base < 0){
            base = -base;
        }
        if (h<0){
            h = -h;
        }
    }

    public double perimetro() {
        return (base+h)*2;
    }
    public double area(){
        return base*h;
    }
}
