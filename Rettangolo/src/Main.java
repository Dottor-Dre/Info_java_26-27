public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(3,2);
        Punto p2 = new Punto(5,3);
        Rettangolo r = new Rettangolo(p1,p2);
        System.out.println(r.perimetro());
        System.out.println(r.area());
    }
}