public class Main {
    public static void main(String[] args) {
        Semaforo s = new Semaforo();
        s.accendi();
        s.avanza();
        System.out.println(s.getColore());
        System.out.println(s.isAccesa());
        System.out.println(s.toString());
        s.toggle();
        System.out.println(s.toString());
    }
}
