import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creazione di alcune canzoni di prova (passando direttamente minuti e secondi)
        Canzone c1 = new Canzone("Suspicious Minds", 4, 22, "Elvis Presley");
        Canzone c2 = new Canzone("Come Together", 4, 19, "The Beatles");
        Canzone c3 = new Canzone("Paint It Black", 3, 22, "The Rolling Stones");

        // Creazione della playlist con un array iniziale
        Canzone[] canzoniIniziali = {c1, c2};
        Playlist playlist = new Playlist("Rock anni sessanta", canzoniIniziali);

        Scanner scanner = new Scanner(System.in);
        int scelta = -1;

        do {
            System.out.println("\n--- MENU PLAYLIST ---");
            System.out.println(playlist); // Stampa lo stato attuale
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Brano Successivo");
            System.out.println("5. Brano Precedente");
            System.out.println("6. Aggiungi Canzone");
            System.out.println("7. Visualizza informazioni di una canzone (getCanzone)");
            System.out.println("8. Mostra durata totale della playlist");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");

            if (scanner.hasNextInt()) {
                scelta = scanner.nextInt();
                scanner.nextLine(); // Pulisce il buffer
            } else {
                System.out.println("Inserisci un numero valido!");
                scanner.next();
                continue;
            }

            switch (scelta) {
                case 1:
                    playlist.play();
                    break;
                case 2:
                    playlist.pause();
                    break;
                case 3:
                    playlist.stop();
                    break;
                case 4:
                    playlist.branoSuccessivo();
                    break;
                case 5:
                    playlist.branoPrecedente();
                    break;
                case 6:
                    System.out.print("Inserisci il titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Inserisci i minuti: ");
                    int min = scanner.nextInt();
                    System.out.print("Inserisci i secondi: ");
                    int sec = scanner.nextInt();
                    scanner.nextLine(); // Pulizia buffer
                    System.out.print("Inserisci l'artista: ");
                    String artista = scanner.nextLine();

                    Canzone nuovaCanzone = new Canzone(titolo, min, sec, artista);
                    boolean inserita = playlist.add(nuovaCanzone);
                    if (inserita) {
                        System.out.println("Canzone aggiunta con successo!");
                    } else {
                        System.out.println("Impossibile aggiungere: limite massimo di 100 brani raggiunto.");
                    }
                    break;
                case 7:
                    System.out.print("Inserisci il numero del brano (1 - " + playlist.getQuantiBrani() + "): ");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    Canzone trovata = playlist.getCanzone(num);
                    if (trovata != null) {
                        System.out.println("\n--- DETTAGLI CANZONE ---");
                        System.out.println(trovata);
                    } else {
                        System.out.println("Valore non valido o brano non esistente (null).");
                    }
                    break;
                case 8:
                    System.out.println("Durata totale della playlist: " + playlist.durataTotale());
                    break;
                case 0:
                    System.out.println("Uscita in corso...");
                    break;
                default:
                    System.out.println("Opzione non valida.");
            }
        } while (scelta != 0);

        scanner.close();
    }
}
