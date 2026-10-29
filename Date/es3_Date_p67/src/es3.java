import java.time.LocalDate;
import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("inserisci la data come aaaa-mm-g: ");
    String s = scanner.next();
    LocalDate oggi = LocalDate.parse(s);
    System.out.println("Tra un giorno: " + oggi.plusDays(1));
    System.out.println("Tra un mese: " + oggi.plusMonths(1));
    System.out.println("Tra un anno: " + oggi.plusYears(1));

}

