import java.util.Scanner;
void main() {
    Scanner scaner = new Scanner(System.in);
    String email = "";
    System.out.println("Inserisci l'email: ");
    email = scaner.next();
    System.out.println(email.substring(email.indexOf('@')+1));
}
