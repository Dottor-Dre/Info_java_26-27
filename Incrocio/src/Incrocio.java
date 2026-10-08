public class Incrocio {
    Semaforo Nord = new Semaforo();
    Semaforo Sud = new Semaforo();
    Semaforo Ovest = new Semaforo();
    Semaforo Est = new Semaforo();
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
            if (a == 'N') {
                if (!Nord.colore.equals("Verde") || (!Ovest.colore.equals("Verde") && !Est.colore.equals("Verde"))) {
                    Nord.avanza();
                }
            }
            else if (a == 'S') {
                if (!Sud.colore.equals("Verde") || (!Ovest.colore.equals("Verde") && !Est.colore.equals("Verde"))) {
                    Sud.avanza();
                }
            }
            else if (a == 'O') {
                if (!Ovest.colore.equals("Verde") || (!Nord.colore.equals("Verde") && !Sud.colore.equals("Verde"))) {
                    Ovest.avanza();
                }
            }
            else if (a == 'E') {
                if (!Est.colore.equals("Verde") || (!Nord.colore.equals("Verde") && !Sud.colore.equals("Verde"))) {
                    Est.avanza();
                }
            }
        }


    public boolean isAcceso(){return acceso;}


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

    @Override
    public String toString() {
        String s = "      |   N   |"
                +"\n      |       |"
                +"\n      | "+Nord.ColoreRidotto()+"     |"
                +"\n-------       -------"
                +"\n              "+Ovest.ColoreRidotto()
                +"\nE                   O"
                +"\n      "+Est.ColoreRidotto()
                +"\n-------       -------"
                +"\n      |     "+Sud.ColoreRidotto()+" |"
                +"\n      |       |"
                +"\n      |   S   |";
        return s;
    }
}
