public class Geometrica implements ICalcMedia{
    @Override
    public double CalculaMedia(double P1, double P2) {
        return Math.sqrt(P1*P2);
    }

    @Override
    public String Situacao(double media) {
        if (media > 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
