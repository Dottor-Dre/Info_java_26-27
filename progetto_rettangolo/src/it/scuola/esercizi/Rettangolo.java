package it.scuola.esercizi;

public class Rettangolo {
    private double x_v1;
    private double y_v1;
    private double x_v2;
    private double y_v2;

    public Rettangolo(double x1,double y1,double x2,double y2){
        x_v1=x1;
        y_v1=y1;
        x_v2=x2;
        y_v2=y2;
    }
    public double getBase(){
        return Math.sqrt(Math.pow(x_v1-x_v2,2));
    }
    public double getAltezza(){
        return Math.sqrt(Math.pow(y_v1-y_v2,2));
    }
    public double getArea(){
        return getBase()*getAltezza();
    }
    public double getPerimetro(){
        return getBase()*2+getAltezza()*2;
    }
}
