public class Playlist {
    String nome;
    int brano=0;
    String stato;
    private int MAXbrano;
    private boolean stop=false;

    public Playlist(Playlist l){
        this.brano = l.brano;
        this.nome = l.nome;
        this.stato = l.stato;
        this.MAXbrano = l.MAXbrano;
    }
    public Playlist(String name, int N){
        stato = "STOP";
        MAXbrano = N;
        nome = name;
    }
    public String getNome(){return nome;}
    public int getQuantiBrani(){return brano;}
    public void play(){stato = "Play";stop = false;}
    public void pause(){if (stato == "Play") stato = "Pause"; stop = false;}
    public void stop(){
        if (stop){
            brano = 1;
        }
        stop = true;
        stato = "Stop";
    }
    public void branoSuccessivo(){
        brano++;
        if (brano == MAXbrano){
            brano = 1;
        }
    }

    public void branoPrecedente(){
        brano--;
        if (brano == 1){
            brano = MAXbrano;
        }
    }
    @Override
    public String toString(){
        return "Playlist: " + nome + ", " + MAXbrano + " brani, in " + stato + " sul brano " + brano;
    }
}
