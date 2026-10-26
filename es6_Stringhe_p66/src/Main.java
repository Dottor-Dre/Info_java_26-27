import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1,s2;
        s1 = scanner.next();
        for (int i = 0; i < s1.length(); i++) {
            System.out.printf(s1.charAt(i) + "-");
        }
    }
}

