public class Angolo {
    private int gradi;
    private int primi;
    private int secondi;

    public Angolo (){

    }
    public Angolo(int g, int p, int s){
        gradi=g;
        primi=p;
        secondi=s;
    }

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
    public Angolo sottraiAngolo(Angolo a){
        Angolo angolo = new Angolo();
        if (this.gradi < a.gradi){
            return angolo;
        }
        if(this.primi<a.primi){
            this.primi+=60;
            this.gradi--;
        }
        if (this.secondi<a.secondi){
            angolo.primi--;
            angolo.secondi+=60;
        }
        angolo.gradi = this.gradi-a.gradi;
        angolo.primi = this.primi-a.primi;
        angolo.secondi = this.secondi-a.secondi;
        return angolo;
    }
    @Override
    public String toString(){
        return this.gradi + "° " + this.primi + "' " + this.secondi + "''";
    }
}
