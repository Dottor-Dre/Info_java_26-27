package it.scuola.esercizi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;


class Azione{
    private String nome_azione;
    private int livello;
    private LocalDateTime d;
    boolean se_azione=false;
    public Azione(String azione, int liv){
        d = LocalDateTime.now();
        nome_azione = azione;
        livello=liv;
        se_azione=true;
    }

    public String getNome_azione() {
        return nome_azione;
    }

    public int getLivello() {
        return livello;
    }

    public LocalDateTime getData() {
        return d;
    }
    @Override
    public String toString(){
        String s="";
        if (livello==1){
            s="nessun problema";
        } else if (livello==2){
            s="annotazione";
        } else if(livello==3){
            s="evento moderato";
        } else if(livello==4){
            s="evento grave";
        } else {
            s="evento critico";
        }
        return "Descrizione: " + nome_azione + "\n" + d + "\n" + s;
    }
}

public class Logger {
    Azione[] azioni;

    public Logger(int MAX){
        azioni = new Azione[MAX];
    }
    public boolean add(Azione a){
        for (int i = 0; i < azioni.length; i++) {
            if (!azioni[i].se_azione){
                azioni[i]=a;
                return true;
            }
        }
        return false;
    }

    public String get_azione(int indice){
        if (indice >= 0 && indice < azioni.length && !azioni[indice].se_azione){
            return azioni[indice].getNome_azione();
        }
        return null;
    }
    public Azione[]  getByAttenzione(int livello){
        Azione[] a = new Azione[azioni.length];
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            if (azioni[i].getLivello() == livello && azioni[i].se_azione){
                a[temp]=azioni[i];
                temp++;
            }
        }
        return a;
    }

    public int size(){
        int cont=0;
        for (int i = 0; i < azioni.length; i++) {
            if (azioni[i].se_azione){
                cont++;
            }
        }
        return cont;
    }
    public boolean isEmpty(){
        for (int i = 0; i < azioni.length; i++) {
            if (azioni[i].se_azione){
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString(){
        String s="Numero totale azioni: ";
        LocalDate d = LocalDate.now();
        if(isEmpty()){
            s+="0";
        } else{
            s += "Livello 1 : " + getByAttenzione( 1).length;
            s += "\nLivello 2 : " + getByAttenzione(2).length;
            s += "\nLivello 3 : " + getByAttenzione(3).length;
            s += "\nLivello 4 : " + getByAttenzione(4).length;
            s += "\nLivello 5 : " + getByAttenzione(5).length;
            s+="\nle azioni sono state memorizzate a partire dalle ore " + azioni[0].getData() + " UTC";
            s+="\n fino alle ore " +azioni[size()].getData() +" del " + d + " UTC";
        }
        return s;
    }

}