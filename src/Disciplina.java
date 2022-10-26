public class Disciplina{
    double media;
    String nome;
    double P1,P2;
    String situacao;
    ICalcMedia calcMedia;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

     public void CalculaMedia() {
        media = calcMedia.CalculaMedia(P1, P2);
        situacao = calcMedia.Situacao(media);
    }

    Disciplina(ICalcMedia calculo){
        this.calcMedia = calculo;
    }


    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }
}
