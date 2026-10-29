import java.time.LocalDate;
import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("inserisci la data come aaaa-mm-g: ");
    String s = scanner.next();
    LocalDate oggi = LocalDate.parse(s);

}

