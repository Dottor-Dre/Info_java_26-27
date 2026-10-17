import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int []v;
        v=new int[10];
        int a,b;
        System.out.println("inserisci a & b(a>b):");
        a= tastiera.nextInt();
        b= tastiera.nextInt();
        int m=(a+b)/2;
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()*a + b);
            if (v[i] > b && v[i] < m){
                System.out.println(v[i]);
            }
        }


    }
}