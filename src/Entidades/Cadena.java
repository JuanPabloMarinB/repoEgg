package Entidades;

public class Cadena {
    private String frase;
    private int longitud;

    private String nuevaFrase;

    private int longitudNuevaFrase;

    public Cadena() {
    }

    public Cadena(String frase, int longitud, String nuevaFrase, int longitudNuevaFrase) {
        this.frase = frase;
        this.longitud = longitud;
        this.nuevaFrase = nuevaFrase;
        this.longitudNuevaFrase = longitudNuevaFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getNuevaFrase() {
        return nuevaFrase;
    }

    public void setNuevaFrase(String nuevaFrase) {
        this.nuevaFrase = nuevaFrase;
    }

    public int getLongitudNuevaFrase() {
        return longitudNuevaFrase;
    }

    public void setLongitudNuevaFrase(int longitudNuevaFrase) {
        this.longitudNuevaFrase = longitudNuevaFrase;
    }
}
