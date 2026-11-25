public class DepositoNonValidoExeption extends RuntimeException {
    @Override
    public String toString(){
        return "L'importo che si vuole depositare non deve essere negativo.";
    }
}
