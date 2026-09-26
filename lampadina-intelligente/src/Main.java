public class Main {
    public static void main(String[] args) {
        LampadinaIntelligente l = new LampadinaIntelligente();
        l.accendi();
        l.get("camera");
        l.set("giallo");
        l.diminusiciIlluminazione();
        System.out.println(l.toString());
    }
}