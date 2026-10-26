import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1,s2;
        System.out.printf("Inserisci le parole e ti darò quella che viene prima in ordine alfabetico: ");
        s1 = scanner.next();
        s2 = scanner.next();
        if (s1.compareTo(s2) <= 0){
            System.out.println(s1);
        } else{
            System.out.println(s2);
        }
    }
}
