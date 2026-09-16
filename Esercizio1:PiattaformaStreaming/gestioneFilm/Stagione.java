package gestioneFilm;

public class Stagione{
    private int nrEpisodi;
    private int nrStagione;
    private String nomeSceneggiatore;
    private String trama;

    // costruttore
    public Stagione(int nrEpisodi, String nomeSceneggiatore, String trama, int nrStagione) {
        this.nrEpisodi = nrEpisodi;
        this.nomeSceneggiatore = nomeSceneggiatore;
        this.trama = trama;
        this.nrStagione = nrStagione;
    }

    // getter e setter
    public int getNrEpisodi() {
        return nrEpisodi;
    }

    public void setNrEpisodi(int nrEpisodi) {
        this.nrEpisodi = nrEpisodi;
    }

    public String getNomeSceneggiatore() {
        return nomeSceneggiatore;
    }

    public void setNomeSceneggiatore(String nomeSceneggiatore) {
        this.nomeSceneggiatore = nomeSceneggiatore;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    public int getNrStagione() {
        return numeroStagione;
    }

    public void setNrStagione(int nrStagione) {
        this.nrStagione = nurStagione;
    }

    @Override
    public String toString() {
        return "Stagione " + numeroStagione + " [Episodi: " + numeroEpisodi + 
               ", Sceneggiatore: " + nomeSceneggiatore + ", Trama: " + trama + "]";
}
