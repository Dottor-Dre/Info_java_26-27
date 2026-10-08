public class Semaforo {
    String luce;
    boolean accesa;

    public Semaforo(){
        accesa=false;
    }
    public void accendi(){luce="Verde";accesa = true;}
    public void spegni(){accesa=false;}

    public void toggle(){
        if(accesa){
            accesa=false;
        }else{
            accesa=true;}
    }
    public boolean isAccesa(){return accesa;}
    public String getColore(){if(accesa){return luce;}return "";}
    public void avanza(){
        if (accesa){
            if (luce == "Verde"){luce = "Gialla";
            } else if (luce == "Gialla"){luce = "Rossa";
            } else {
                luce = "Verde";
            }
        }
    }
    @Override
    public String toString(){
        if (accesa){
            return "Il semaforo è acceso sul " + luce;
        }
        return "Il semaforo è spento";
    }
}

