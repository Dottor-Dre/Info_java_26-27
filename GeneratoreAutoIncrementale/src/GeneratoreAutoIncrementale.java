public class GeneratoreAutoIncrementale {
    String prefisso;
    int numZeri=0;
    int numero = 0;
    String zeri;
    private int potenza = 10;
    public GeneratoreAutoIncrementale(String pref, int num){
        this.prefisso = pref;
        this.numZeri = num-1;
    }

    public String genera(){
        if (numZeri > 0){
            numero++;
            if (numero == potenza){
                numZeri--;
                potenza *= 10;
            }
            zeri = "";
            for (int i = 0; i < numZeri; i++) {
                zeri += "0";
            }
            return prefisso + zeri + numero;
        }
        return "Codici esauriti";
    }
    @Override
    public String toString(){
        return "Prefisso: " + prefisso + "  Ultimo valore generato:" + numero;
    }
}
