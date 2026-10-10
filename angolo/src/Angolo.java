public class Angolo {
    private int gradi;
    private int primi;
    private int secondi;

    public Angolo(){}

    public Angolo sommaAngolo(Angolo a){
        Angolo angolo = new Angolo();
        angolo.secondi = a.secondi+this.secondi;
        if (secondi >= 60){
            angolo.secondi -= 60;
            angolo.primi ++;
        }
        angolo.primi += a.primi+this.primi;
        if (angolo.primi >= 60){
            angolo.primi-=60;
            angolo.gradi++;
        }
        angolo.gradi+=a.gradi+this.gradi;
        if (angolo.gradi > 360){
            angolo.gradi=angolo.gradi-360;
        }
        return angolo;
    }
}
