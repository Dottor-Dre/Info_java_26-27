public class Main {
    public static void main(String[] args) {
        GeneratoreAutoIncrementale g = new GeneratoreAutoIncrementale("ABC", 3);
        for (int i = 0; i < 1000; i++) {
            System.out.println(g.genera());
        }
        System.out.println(g.toString());
    }
}
