import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Incrocio incrocio = new Incrocio();
        int scelta;
        char strada;
        do {
            System.out.println("1. Accendi incrocio");
            System.out.println("2. Spegni incrocio");
            System.out.println("3. Avanza un semaforo");
            System.out.println("4. Controlla se l'incrocio è acceso");
            System.out.println("5. Visualizza colore di un semaforo");
            System.out.println("6. Visualizza stato dell'incrocio");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    incrocio.accendi();
                    System.out.println("Incrocio acceso.");
                    break;
                case 2:
                    incrocio.spegni();
                    System.out.println("Incrocio spento.");
                    break;
                case 3:
                    System.out.print("Inserisci la strada (N, S, E, O): ");
                    strada = input.next().toUpperCase().charAt(0);
                    incrocio.avanzare(strada);
                    System.out.println("Semaforo fatto avanzare.");
                    break;
                case 4:
                    if (incrocio.isAcceso()) {
                        System.out.println("L'incrocio è acceso.");
                    } else {
                        System.out.println("L'incrocio è spento.");
                    }
                    break;
                case 5:
                    System.out.print("Inserisci la strada (N, S, E, O): ");
                    strada = input.next().toUpperCase().charAt(0);
                    System.out.println("Colore: " + incrocio.getColore(strada));
                    break;
                case 6:
                    System.out.println(incrocio);
                    break;
                case 0:
                    System.out.println("Programma terminato.");
                    break;
            }
        } while (scelta != 0);
    }
}

