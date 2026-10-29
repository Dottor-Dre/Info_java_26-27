import java.time.LocalDate;
import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    int g,m,a;
    System.out.println("giorno: ");
    g = scanner.nextInt();
    System.out.println("mese: ");
    m = scanner.nextInt();
    System.out.println("anno: ");
    a = scanner.nextInt();
    LocalDate oggi = LocalDate.of(a,m,g);
    System.out.println("Tra un giorno: " + oggi.plusDays(1));
    System.out.println("Tra un mese: " + oggi.plusMonths(1));
    System.out.println("Tra un anno: " + oggi.plusYears(1));

}

