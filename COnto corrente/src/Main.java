import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        ContoCorrente c = new ContoCorrente();
        System.out.println("Che azione voui fare?");
        System.out.println("1 -> preleva");
        System.out.println("2 -> deposita");
        System.out.println("3 -> codice");
        System.out.println("4 -> nome e cognome");
        System.out.println("5 -> saldo");
        System.out.println("6 -> stampa le info sull'account");
        int n = tastiera.nextInt();
            if (n == 1) {
                int s = tastiera.nextInt();
                System.out.println(c.preleva(s));
            } else if (n == 2) {
                int s = tastiera.nextInt();
                System.out.println(c.deposita(30));
            } else if (n == 3) {
                System.out.println(c.getCodice());
            } else if (n == 4) {
                System.out.println(c.getNominativo());
            } else if (n == 5) {
                System.out.println(c.getSaldo());
            } else {
                System.out.println(c.toString());
            }

        }
    }
