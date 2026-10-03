public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(5,3);
        Punto p2 = new Punto(3,2);
        Rettangolo r = new Rettangolo(p1,p2);
        System.out.println("Punto1 (" + p1.x + "," + p1.y + ")");
        System.out.println("Punto1 (" + p2.x + "," + p2.y + ")");
        System.out.println("Perimetro: " + r.perimetro());
        System.out.println("Area: " + r.area());
    }
}