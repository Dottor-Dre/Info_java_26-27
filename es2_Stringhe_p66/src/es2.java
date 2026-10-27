import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1,s2;
        System.out.println("Inserisci le parole e ti darò la più lunga: ");
        s1 = scanner.next();
        s2 = scanner.next();
        if (s1.length() >= s2.length()){
            System.out.println(s1);
        } else {
            System.out.println(s2);
        }
    }
}
