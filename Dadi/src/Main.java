import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Dado dado = new Dado();
        Scanner tastiera = new Scanner(System.in);
        System.out.println("premi 1 per lanciare il dado");
        System.out.println("2 per cambiarne il numero di facce");
        System.out.println("3 per mostrare quante facce ha il dado");
        int n  = tastiera.nextInt();
        if (n == 1){
            System.out.println(dado.lancia());
        } else if (n == 2){
            int f = tastiera.nextInt();
            dado.N = f;
        } else {
            System.out.println(dado.toString());
        }
    }
}
