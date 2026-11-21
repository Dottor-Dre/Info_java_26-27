import graphics.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        Picture p = new Picture("esempio_planimetria_casa.png");
        p.draw();
        SistemaDomotico sistema = new SistemaDomotico(4);

        Lampadina l1 = new Lampadina(50);
        Lampadina l2 = new Lampadina(50);
        Lampadina l3 = new Lampadina(50);
        Lampadina l4 = new Lampadina(50);
        if (sistema.add(l1)){
            System.out.println("lampadina aggiunta");
        }
        sistema.add(l2);
        sistema.add(l3);
        sistema.add(l4);

        l1.disegna();
        l2.disegna();
        l3.disegna();
        l4.disegna();
        do {
            n = in.nextInt();
            switch (n){
                case 1:
                        sistema.spegniLampadine();
                        System.out.println(sistema.toString());
                        break;

                case 2:
                    sistema.accendiLampadine();
                    System.out.println(sistema.toString());
                    break;
            }
        } while (n != 0);
        System.exit(0);
    }
}