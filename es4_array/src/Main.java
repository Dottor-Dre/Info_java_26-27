import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] v;
        Scanner tastiera = new Scanner(System.in);
        int x;
        v = new int[10];
        System.out.println("Inserisci 10 numeri: ");
        for (int i = 0; i < v.length; i++) {
            x = tastiera.nextInt();
            v[i] = x;
        }
        for (int i = v.length-1; i >= 0; i--) {
            System.out.printf(v[i] + " ");
        }
    }
}