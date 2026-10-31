public class Main {
    public static void main(String[] args) {
        Risposta[] r = new Risposta[4];

        for (int i = 0; i < r.length; i++) {
            r[i] = new Risposta();
            r[i].risposta = "ddddd";
        }
        Domanda d = new Domanda("ciao",r,2 );
        System.out.println(d.toString());
    }}