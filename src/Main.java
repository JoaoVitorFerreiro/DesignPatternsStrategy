public class Main {
    public static void main(String[] args) {
        Aritmetica calculo = new Aritmetica();
        //Geometrica calculo = new Geometrica();

        Disciplina d = new Disciplina(calculo);

        d.setNome("Análise e Desenvolvimento do Sistemas");
        d.setP1(10.0);
        d.setP2(5.0);
        d.CalculaMedia();
        System.out.println(String.format("\nP1: %.2f \nP2: %.2f\nMedia: %.2f\nSituação: %s",
        d.getP1(),d.getP2(),d.getMedia(),d.getSituacao()));
    }
}