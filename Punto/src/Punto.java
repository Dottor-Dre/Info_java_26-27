public class Punto {
    double x;
    double y;
    public Punto(){
        x=0;
        y=0;
    }
    public Punto(Punto punto){
        this.x= punto.x;
        this.y= punto.y;
    }
    public double distanza(Punto punto){
        return Math.sqrt(Math.pow(x - punto.x, 2) + Math.pow(y - punto.y, 2));
    }
    public Punto puntoMedio(Punto punto){
        Punto p = new Punto();
        p.x = (this.x + punto.x)/2;
        p.y = (this.y + punto.y)/2;
        return p;
    }
    public void ruota(double angolo){
        double temp = x;
        angolo = Math.toRadians(angolo);
        x = x * Math.cos(angolo) - y * Math.sin(angolo);
        y = temp * Math.sin(angolo) + y * Math.cos(angolo);
    }

    @Override
    public String toString() {
        return "Punto: (" + x + ";" + y + ")";
    }
}
