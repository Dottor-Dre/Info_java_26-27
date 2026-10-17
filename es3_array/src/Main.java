import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int []v;
        v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()*10);
            System.out.printf("__");
        }
        System.out.println("");
        for (int i = 0; i < v.length; i++) {
            System.out.printf(i + " ");
        }
        System.out.println("");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("__");
        }
        System.out.println("");
        for (int i = 0; i < v.length; i++) {
            System.out.printf(v[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("__");
        }
    }
}