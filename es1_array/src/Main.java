import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int []v;
        v= new int[10];
        System.out.println("Inserisci 10 numeri: ");
        for (int i = 0; i < v.length; i++) {
            int a = tastiera.nextInt();
            v[i] = a;
        }
        System.out.println("Numeri pari: ");
        for (int i = 0; i < v.length; i++) {
            if (v[i]%2 == 0){
                System.out.println(v[i]);
            }
        }
        System.out.println("Numeri dispari: ");
        for (int i = 0; i < v.length; i++) {
            if (v[i]%2 != 0){
                System.out.println(v[i]);
            }
        }
        System.out.println("Elenco: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}