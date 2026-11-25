public class PrelievoNonValidoExeption extends RuntimeException {
    @Override
    public String toString(){
        return "L'importo che si vuole prelevare deve essere valido.";
    }
}
