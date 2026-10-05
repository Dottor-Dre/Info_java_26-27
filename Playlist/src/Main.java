public class Main {
    public static void main(String[] args) {
        Playlist p = new Playlist("CCCC", 20);
        p.play();
        for (int i = 0; i < 10; i++) {
            p.branoSuccessivo();
        }
        System.out.println(p.toString());
    }
}

