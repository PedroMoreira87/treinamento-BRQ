package p2.p2e04;

public class AlunoDisciplina {

    private int idAluno;
    private int idDisciplina;
    private double notaB1;
    private double notaB2;

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public double getNotaB1() {
        return notaB1;
    }

    public void setNotaB1(double notaB1) {
        this.notaB1 = notaB1;
    }

    public double getNotaB2() {
        return notaB2;
    }

    public void setNotaB2(double notaB2) {
        this.notaB2 = notaB2;
    }

    public AlunoDisciplina(int idAluno, int idDisciplina, double notaB1, double notaB2) {
        this.idAluno = idAluno;
        this.idDisciplina = idDisciplina;
        this.notaB1 = notaB1;
        this.notaB2 = notaB2;
    }

    public double mediaAritmetica() {
        return (notaB1 + notaB2) / 2;
    }

    public double mediaPonderada() {
        return ((notaB1 * 4) + (notaB2 * 6)) / (notaB1 + notaB2);
    }

    public void printMediaAritmetica() {
        System.out.printf("Média Aritmética: %.2f\n" , mediaAritmetica());
    }

    public void printMediaPonderada() {
        System.out.printf("Média Ponderada: %.2f\n" , mediaPonderada());
    }
}