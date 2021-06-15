package p4.p4e04;

public class Metodos {

    public void metodoA() throws Exception {
        System.out.println("Início método A");
        System.out.println("Retorno método B");
        System.out.println("==============================");
        metodoB();
    }

    public void metodoB() throws Exception {
        System.out.println("Início método B");
        System.out.println("Retorno método C");
        System.out.println("==============================");
        metodoC();
    }

    public void metodoC() throws Exception {
        System.out.println("Início método C");
        System.out.println("Retorno método D");
        System.out.println("==============================");
        metodoD();
    }

    public void metodoD() throws Exception {
        System.out.println("Início método D");
        System.out.println("==============================");
        throw new Exception("Exceção metodo D");
    }
}
