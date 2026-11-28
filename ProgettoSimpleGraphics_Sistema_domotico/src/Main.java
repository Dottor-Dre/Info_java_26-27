import graphics.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        Picture p = new Picture("esempio_planimetria_casa.png");
        p.draw();
        SistemaDomotico sistemaDomotico = new SistemaDomotico();

        int potenza, illuminazione;
        String colore, stato, nome;

        do {

            System.out.println("\n 1. crea una nuova lampadina \n 2. accendi tutte \n 3. spegni tutte \n 4. rimuovi una lampadina \n 5. cambia il colore a una lampadina \n 6. cambia intensità di una lampadina \n 7. cerca una lampadina \n 8. quante lampadine ci sono \n 9. potenza totale");
            n = in.nextInt();
            switch (n){
                case 1:
                    System.out.println("inserire la potenza della lampadina");
                    potenza = in.nextInt();
                    Lampadina lampadina = new Lampadina(potenza);
                    System.out.println("inserire il livello di illuminazione");
                    illuminazione = in.nextInt();
                    lampadina.setIlluminazione(illuminazione);
                    System.out.println("inserire il colore");
                    colore = in.nextLine();
                    lampadina.setColore(colore);
                    System.out.println("inserire lo stato");
                    stato = in.nextLine();
                    lampadina.setStato(stato);
                    System.out.println("inserire il nome");
                    nome = in.nextLine();
                    lampadina.setNome(nome);

                    sistemaDomotico.add(lampadina);
                    System.out.println(lampadina.toString());
                    break;

                case 2:
                    sistemaDomotico.accendiLampadine();
                    break;

                case 3:
                    sistemaDomotico.spegniLampadine();
                    break;

                case 4:
                    System.out.println("inserire il nome della lampadina da rimuovere");
                    nome = in.nextLine();
                    sistemaDomotico.rimuovi(nome);
                    break;

                case 5:
                    System.out.println("inserire il nome della lampadina");
                    nome = in.nextLine();
                    System.out.println("inserire il colore");
                    colore = in.nextLine();
                    sistemaDomotico.cambiaColore(sistemaDomotico.posizioneLampadina(nome), colore);
                    break;

                case 6:
                    System.out.println("inserire il nome della lampadina");
                    nome = in.nextLine();
                    System.out.println("inserire l'intensita");
                    illuminazione = in.nextInt();
                    sistemaDomotico.cambiaIntensita(nome, illuminazione);
                    break;

                    case 7:
                        System.out.println("inserire il nome della lampadina");
                        nome = in.nextLine();
                        Lampadina l = new Lampadina(50);
                        l = sistemaDomotico.cerca(nome);
                        System.out.println(l.toString());
                    break;

                case 8:
                    System.out.println("ci sono " + sistemaDomotico.getQuanteLampadine() + " lampadine");
                    break;

                case 9:
                    System.out.println("la potenza totale è di " + sistemaDomotico.getPotenzaAttuale() + " watt");
            }
        } while (n != 0);
        System.exit(0);
    }
}