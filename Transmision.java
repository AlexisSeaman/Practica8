package Practica8;

public class Transmision {
    private String tipo;
    private int numMarchas;

    public Transmision(String tipo, int numMarchas) {
        this.tipo = tipo;
        this.numMarchas = numMarchas;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumMarchas() {
        return numMarchas;
    }
}
