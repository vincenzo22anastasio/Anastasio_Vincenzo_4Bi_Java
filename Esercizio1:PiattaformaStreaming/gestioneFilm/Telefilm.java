
public class Telefilm {
    private String nome;
    private String genere;
    private boolean inCorso; // true se in corso, false se terminata
    private Stagione[] stagioni;
    private int numStagioniInserite;

    public Telefilm(String nome, String genere, boolean inCorso, Stagione[] stagioni) {
        this.nome = nome;
        this.genere = genere;
        this.inCorso = inCorso;
        this.stagioni = stagioni;
        this.numStagioniInserite = stagioni != null ? stagioni.length : 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public boolean isInCorso() {
        return inCorso;
    }

    public void setInCorso(boolean inCorso) {
        this.inCorso = inCorso;
    }

    public Stagione[] getStagioni() {
        return stagioni;
    }

    public void setStagioni(Stagione[] stagioni) {
        this.stagioni = stagioni;
        this.numStagioniInserite = stagioni != null ? stagioni.length : 0;
    }
}