import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static int vocali_in_stringa(String s){
        int vocali=0;
        String s_min = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s_min.charAt(i) == 'a' || s_min.charAt(i) == 'e' || s_min.charAt(i) == 'i' || s_min.charAt(i) == 'o' || s_min.charAt(i) == 'u'){
                vocali++;
            }
        }
        return vocali;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1;
        s1 = scanner.next();
        System.out.println(vocali_in_stringa(s1));
    }
}

