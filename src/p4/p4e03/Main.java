package p4.p4e03;

public class Main {

    public static void main(String[] args) throws Exception {

        Veiculo veiculo = new Veiculo();

        veiculo.acelera(110);
        veiculo.desacelara(20);
        System.out.println(veiculo);
    }
}
