public class Incrocio {
    Semaforo Nord;
    Semaforo Sud;
    Semaforo Ovest;
    Semaforo Est;
    private boolean acceso = false;

    public Incrocio(){
        Nord.accesa = false;
        Sud.accesa = false;
        Ovest.accesa = false;
        Est.accesa = false;
    }
    public void accendi(){
        Nord.accesa = true;
        Sud.accesa = true;
        Ovest.accesa = true;
        Est.accesa = true;
        Est.colore = "Verde";
        Ovest.colore = "Verde";
        Nord.colore = "Rosso";
        Sud.colore = "Rosso";
        acceso = true;
    }
    public void spegni(){
        Nord.accesa = false;
        Sud.accesa = false;
        Ovest.accesa = false;
        Est.accesa = false;
        acceso = false;
    }
    public void avanzare(char a){
        if (Nord.avanza() == Ovest.colore || Nord.avanza() == Est.colore ||
                Sud.avanza() == Ovest.colore || Sud.avanza() == Est.colore ||
                Ovest.avanza() == Nord.colore || Ovest.avanza() == Sud.colore||
                Est.avanza() == Nord.colore || Est.avanza() == Sud.colore) {
                    if (a == 'N'){Nord.avanza();}
                    else if (a == 'S'){Sud.avanza();}
                    else if (a == 'O'){Ovest.avanza();}
                    else if (a == 'E'){Est.avanza();}
        }
    }
    public boolean isAcceso(Incrocio s){return acceso;}


    public String getColore(char a){
        if (acceso) {
            if (a == 'N') {
                return Nord.colore;
            } else if (a == 'S') {
                return Sud.colore;
            } else if (a == 'O') {
                return Ovest.colore;
            } else if (a == 'E') {
                return Est.colore;
            }
        }
        return "";
    }
    public char ColoreRidotto(Semaforo s){
        if (s.colore == "Verde"){return 'V';}
        else if (s.colore == "Rosso"){return 'R';}
        return 'G';
    }
    @Override
    public String toString() {
        return "";
    }
}
