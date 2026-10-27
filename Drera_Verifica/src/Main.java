import java.util.Scanner;
public class Main {
    public static Punto creaPunto(){
        Scanner tastiera = new Scanner(System.in);
        Punto p = new Punto();
        System.out.println("Inserisci la x del punto: ");
        int x = tastiera.nextInt();
        System.out.println("Inserisci la y del punto: ");
        int y = tastiera.nextInt();
        p.x = x;
        p.y = y;
        return p;
    }
    public static Vettore creaVettore(){
        Vettore v = new Vettore();
        v.Origine = creaPunto();
        v.Vertice = creaPunto();
        return v;
    }
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Crea il vettore 1:");
        Vettore v1 = creaVettore();
        System.out.println("Crea il vettore 2:");
        Vettore v2 = creaVettore();
        int scelta = 0;
        int qualeVettore = 0;
        do {
            System.out.println("1-> Visualizza le coordinate dei vettori");
            System.out.println("2-> Lunghezza del Vettore selezionato");
            System.out.println("3-> sposta l'origine di un vettore");
            System.out.println("4-> controllo se i vettori hanno origine uguale");
            System.out.println("5 EXIT");
            scelta = tastiera.nextInt();

            switch(scelta){
                case 1:
                    System.out.println("Vettore 1: Origine(" + v1.Origine.x + "," + v1.Origine.y+ ")");
                    System.out.println("Vettore 1: Vertice(" + v1.Vertice.x + "," + v1.Vertice.y+ ")");
                    System.out.println("Vettore 2: Origine(" + v2.Origine.x + "," + v2.Origine.y+ ")");
                    System.out.println("Vettore 2: Vertice(" + v1.Vertice.x + "," + v1.Vertice.y+ ")");
                    break;
                case 2:
                    System.out.println("Inserisci di quale vettore vuoi sapere la lunghezza: ");
                    qualeVettore = tastiera.nextInt();
                    if (qualeVettore == 1){
                        System.out.println(v1.calcolaLunghezza());
                    } else {
                        System.out.println(v2.calcolaLunghezza());
                    }
                    break;
                case 3:
                    System.out.println("Inserisci di quale vettore vuoi spostare l'origine: ");
                    qualeVettore = tastiera.nextInt();
                    Punto p =creaPunto();
                    if (qualeVettore == 1){
                        v1.spostaOrigine(p);
                    } else {
                        v2.spostaOrigine(p);
                    }
                    break;
                case 4:
                    if (v1.verificaOrigine(v2.Origine)){
                        System.out.println("Hanno la stessa origine");
                    } else {
                        System.out.println("Hanno origine diversa");
                    }
                    break;
            }
        } while(scelta != 5);
    }
}