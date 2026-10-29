import java.time.LocalDate;
void main() {
    LocalDate oggi = LocalDate.now();
    System.out.println("Tra un giorno: " + oggi.plusDays(1));
    System.out.println("Tra un mese: " + oggi.plusMonths(1));
    System.out.println("Tra un anno: " + oggi.plusYears(1));

}
