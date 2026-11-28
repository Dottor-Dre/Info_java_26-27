import java.util.ArrayList;

public class SistemaDomotico {
    private ArrayList<Lampadina> sistema;
    private int maxLampadine;

    public SistemaDomotico() {
        this.sistema = new ArrayList<>(100);
        this.maxLampadine = 100;
    }

    public SistemaDomotico(int maxLampadine) {
        if (maxLampadine < 1) {
            this.maxLampadine = 100;
        } else {
            this.maxLampadine = maxLampadine;
        }
    }

    public boolean add(Lampadina l) {
        if(sistema.size() >= maxLampadine){
            return false;
        }
        for (int i = 0; i < sistema.size(); i++) {
            if(l.getNome() != null && l.getNome().equals(sistema.get(i).getNome())) {
                return false;
            }
        }
        sistema.add(l);
        return true;
    }

    public Lampadina cerca(String nome){
        for (int i = 0; i < sistema.size(); i++) {
            if(sistema.get(i).getNome() != null && sistema.get(i).getNome().equals(nome)){
                return sistema.get(i);
            }
        }
        return null;
    }

    public boolean rimuovi(String nome){
        int pos = -1;
        for (int i = 0; i < sistema.size(); i++) {
            if(sistema.get(i).getNome() != null && sistema.get(i).getNome().equals(nome)){
                pos = i;
            }
        }
        if(pos == -1){
            return false;
        }
        sistema.remove(pos);
        return true;
    }

    public int getQuanteLampadine(){return sistema.size();}

    public ArrayList<String> getElencoLampadine(){
        ArrayList<String> s = new ArrayList<>(sistema.size());
        for (int i = 0; i < sistema.size(); i++) {
            s.add(sistema.get(i).toString());
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
            if(sistema.get(i).getNome() != null && sistema.get(i).getNome().equals(nome)){
                return i;
            }
        }
        return -1;
    }

    public void cambiaColore (int i, String colore){
        if (i >= 0 && i < sistema.size()) {
            sistema.get(i).setColore(colore);
        }
    }

        public void cambiaIntensita (String nome, int intensita){
            int pos = posizioneLampadina(nome);
            if (pos != -1) {
                sistema.get(pos).setIlluminazione(intensita);
            }
        }

    @Override
    public String toString() {
        return "Sistema domotico con " + sistema.size() + " lampdine su un massimo di " + maxLampadine;
    }
}