public class Semaforo {
    String colore;
    boolean accesa;
    public String avanza(){
        if (accesa){
            if (colore == "Verde"){colore = "Gialla";
            } else if (colore == "Gialla"){colore = "Rossa";
            } else if (colore == "Rosso"){colore = "Verde";}
        }
        return colore;
    }
    public char ColoreRidotto(){
        if (colore == "Verde"){return 'V';}
        else if (colore == "Rosso"){return 'R';}
        return 'G';
    }

}

