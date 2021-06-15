package p4.p4e03;

public class Veiculo {

    private int velocidade = 0;
    private int velocidadeMax = 100;

    public int getVelocidade() {
        return this.velocidade;
    }

    public int getVelocidadeMax() {
        return this.velocidadeMax;
    }

    public void acelera(int incremento) throws Exception {

        if(velocidade + incremento > velocidadeMax){
            throw new Exception("A velocidade máxima não pode ser ultrapassada");
        }else {
            velocidade += incremento;
        }
    }

    public void desacelara(int decremento) throws Exception {
        if(velocidade - decremento < 0) {
            throw new Exception("A velocidade não pode ser menor do que 0");
        }else {
            velocidade -= decremento;
        }
    }

    @Override
    public String toString() {
        return "Veiculo: " +
                "\nVelocidade: " + velocidade;
    }
}
