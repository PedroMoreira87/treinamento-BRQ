package p2.p2e04;

public class Main {
    public static void main(String[] args) {

        AlunoDisciplina aluno01 = new AlunoDisciplina(1, 1, 5, 9);
        AlunoDisciplina aluno02 = new AlunoDisciplina(2, 1, 6, 6);

        System.out.println("Aluno 1:");
        aluno01.printMediaAritmetica();
        aluno01.printMediaPonderada();
        System.out.println("========================================");
        System.out.println("Aluno 2:");
        aluno02.printMediaAritmetica();
        aluno02.printMediaPonderada();
    }
}
