import java.util.ArrayList;

public class SistemaDomotico {
    private ArrayList<Lampadina> sistema;
    private int nLampadine=0;

    public SistemaDomotico() {
        sistema = new ArrayList<>(100);
    }

    public SistemaDomotico(int MAX) {
        if (MAX < 1) {
            MAX = 100;
        } else {
            sistema = new ArrayList<>(MAX);
        }
    }

    public boolean add(Lampadina l) {
        if(nLampadine == sistema.size()){
            return false;
        }
        for (int i = 0; i < sistema.size(); i++) {
            if(l.getNome() == sistema.get(i).getNome()) {
                return false;
            }
        }
        nLampadine++;
        sistema.add(l);
        return true;
    }

    public Lampadina cerca(String nome){
        for (int i = 0; i < sistema.size(); i++) {
            if(sistema.get(i).getNome() == nome){
                return sistema.get(i);
            }
        }
        return null;
    }

    public boolean rimuovi(String nome){
        int pos = -1;
        for (int i = 0; i < sistema.size(); i++) {
            if(sistema.get(i).getNome() == nome){
                pos = i;
            }
        }
        if(pos == -1){
            return false;
        }
        sistema.remove(pos);
        return true;
    }

    public int getQuanteLampadine(){return nLampadine;}

    public ArrayList<String> getElencoLampadine(){
        ArrayList<String> s = new ArrayList<>(sistema.size());
        for (int i = 0; i < sistema.size(); i++) {
            s.add(sistema.get(i).getNome());
        }
        return s;
    }

    public void accendiLampadine(){
        for (int i = 0; i < sistema.size(); i++) {
            sistema.get(i).accendi();
        }
    }

    public void spegniLampadine(){
        for (int i = 0; i < sistema.size(); i++) {
            sistema.get(i).spegni();
        }
    }

    public int getPotenzaAttuale(){
        int potenzaTot = 0;
        for (int i = 0; i < sistema.size(); i++) {
            potenzaTot += sistema.get(i).getIlluminazione();
        }
        return potenzaTot;
    }

    public int posizioneLampadina(String nome){
        for (int i = 0; i < sistema.size(); i++) {
            if(sistema.get(i).getNome() == nome){
                return i;
            }
        }
        return -1;
    }

    public void cambiaColore (int i, String colore){
        sistema.get(i).setColore(colore);
        }

        public void cambiaIntensita (String nome, int intensita){
            sistema.get(posizioneLampadina(nome)).setIlluminazione(intensita);
        }

    @Override
    public String toString() {
        return "Sistema domotico con " + nLampadine + " lampdine su un massimo di " + sistema.size();
    }
}
