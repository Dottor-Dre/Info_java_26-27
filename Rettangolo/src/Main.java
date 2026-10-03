import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci i punti: ");
        double x1 = tastiera.nextInt();
        double y1 = tastiera.nextInt();
        Punto p1 = new Punto(x1,y1);
        double x2 = tastiera.nextInt();
        double y2 = tastiera.nextInt();
        Punto p2 = new Punto(x2,y2);
        Rettangolo r = new Rettangolo(p1,p2);
        System.out.println("Punto1 (" + p1.x + "," + p1.y + ")");
        System.out.println("Punto1 (" + p2.x + "," + p2.y + ")");
        System.out.println("Perimetro: " + r.perimetro());
        System.out.println("Area: " + r.area());
    }
}