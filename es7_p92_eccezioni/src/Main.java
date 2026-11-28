import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        ContoCorrente c = new ContoCorrente();
        System.out.println("Che azione vuoi fare?");
        System.out.println("1 -> preleva");
        System.out.println("2 -> deposita");
        System.out.println("3 -> codice");
        System.out.println("4 -> nome e cognome");
        System.out.println("5 -> saldo");
        System.out.println("6 -> stampa le info sull'account");
        System.out.println("7 -> esci");
        int n = tastiera.nextInt();
        do {
            if (n == 1) {
                int s = tastiera.nextInt();
                try {
                    System.out.println(c.preleva(s));
                } catch (PrelievoNonValidoExeption e){
                    System.out.println(e);
                }
            } else if (n == 2) {
                int s = tastiera.nextInt();
                try {
                    System.out.println(c.deposita(30));
                } catch (DepositoNonValidoExeption e){
                    System.out.println(e);
                }
            } else if (n == 3) {
                System.out.println(c.getCodice());
            } else if (n == 4) {
                System.out.println(c.getNominativo());
            } else if (n == 5) {
                System.out.println(c.getSaldo());
            } else {
                System.out.println(c.toString());
            }
            System.out.println("Che azione vuoi fare?");
            System.out.println("1 -> preleva");
            System.out.println("2 -> deposita");
            System.out.println("3 -> codice");
            System.out.println("4 -> nome e cognome");
            System.out.println("5 -> saldo");
            System.out.println("6 -> stampa le info sull'account");
            System.out.println("7 -> esci");
            n = tastiera.nextInt();
        } while(n!=7);


    }
}
