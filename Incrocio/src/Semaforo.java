public class Semaforo {
    String colore;
    boolean accesa;
    public String avanza(){
        if (accesa){
            if (colore.equals("Verde")){colore = "Gialla";
            } else if (colore.equals("Gialla")){colore = "Rosso";
            } else if (colore.equals("Rosso")){colore = "Verde";}
        }
        return colore;
    }
    public char ColoreRidotto(){
        if (colore.equals("Verde")){return 'V';}
        else if (colore.equals("Rosso")){return 'R';}
        return 'G';
    }

}

