import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Punto punto = new Punto();
        int scelta;
        do{
            System.out.println("1->Inserisci il punto");
            System.out.println("2->calcola la distanza tra due punti");
            System.out.println("3->calcola il punto medio tra due punti");
            System.out.println("4->ruota il punto di un angolo");
            System.out.println("5->stampa la posizione del punto");
            System.out.println("6->exit");
            scelta = input.nextInt();
            switch (scelta){
                case 1:
                    System.out.println("Inserisci x:");
                    double x = input.nextDouble();
                    System.out.println("Inserisci y:");
                    double y = input.nextDouble();
                    punto = new Punto(x,y);
                    break;
                case 2:
                    System.out.println("Inserisci x del punto:");
                    double x1 = input.nextDouble();
                    System.out.println("Inserisci y del punto:");
                    double y1 = input.nextDouble();
                    Punto punto1 = new Punto(x1,y1);
                    System.out.println(punto.distanza(punto1));
                    break;
                case 3:
                    System.out.println("Inserisci x del punto:");
                    double x2 = input.nextDouble();
                    System.out.println("Inserisci y del punto:");
                    double y2 = input.nextDouble();
                    Punto punto2 = new Punto(x2,y2);
                    System.out.println(punto.puntoMedio(punto2));
                    break;
                case 4:
                    System.out.println("Inserisci l'angolo:");
                    double angolo = input.nextDouble();
                    punto.ruota(angolo);
                    break;
                case 5:
                    System.out.println(punto.toString());
                    break;
            }
        } while (scelta != 6);
    }
}