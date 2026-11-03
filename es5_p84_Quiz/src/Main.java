import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Risposta[] r = new Risposta[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < r.length; i++) {
            r[i] = new Risposta();
        }

        r[0].risposta = "Roma";
        r[0].giusto = true;
        r[1].risposta = "Lisbona";
        r[2].risposta = "calabria";
        r[3].risposta = "como";
        Domanda d = new Domanda("Qual'è l capitale d'italia?",r,2 );
        Quiz quiz = new Quiz("Capitali");
        quiz.add(d);
        System.out.println(quiz.domande[0].toString());
        int risposta = scanner.nextInt();
        quiz.domande[0].rispondi(risposta);
        System.out.println(quiz.toString());
    }
}