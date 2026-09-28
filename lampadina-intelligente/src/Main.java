public class Main {
    public static void main(String[] args) {
        LampadinaIntelligente l = new LampadinaIntelligente();
        l.accendi();
        l.setNome("camera");
        l.setColore("giallo");
        l.diminusiciIlluminazione();
        System.out.println(l.toString());
    }
}