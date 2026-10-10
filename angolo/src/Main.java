import java.util.Scanner;
public class Main {
    public static Angolo creaAngolo(){
        Scanner input = new Scanner(System.in);
        Angolo a=null;
        int g,p,s;
        System.out.println("Inseirisci i gradi, primi e secondi dell'angolo");
        g = input.nextInt();
        p = input.nextInt();
        s = input.nextInt();
        Angolo angolo = new Angolo(g,p,s);
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Angolo angolo = new Angolo();
        int scelta;
        int g,p,s;
        do {
            System.out.println("1->Inserisci un angolo");
            System.out.println("2->Somma il tuo angolo con un altro");
            System.out.println("3->Sottrai il tuo angolo con un altro");
            System.out.println("4->Esci");
            scelta = input.nextInt();
            switch (scelta){
                case 1:
                    creaAngolo();
                    break;
                case 2:

                    System.out.println("Inseirisci i gradi, primi e secondi dell'angolo che vuoi sommare");
                    g = input.nextInt();
                    p = input.nextInt();
                    s = input.nextInt();
                    Angolo angolo1 = new Angolo(g,p,s);
                    angolo.sommaAngolo(angolo1);
                    System.out.println(angolo.toString());
                    break;
                case 3:
                    System.out.println("Inseirisci i gradi, primi e secondi dell'angolo che vuoi sottrarre");
                    g = input.nextInt();
                    p = input.nextInt();
                    s = input.nextInt();
                    Angolo angolo2 = new Angolo(g,p,s);
                    angolo.sommaAngolo(angolo2);
                    System.out.println(angolo.toString());
                    break;
            }
        }while(scelta!=0);


    }
}