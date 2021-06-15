package p5.p5e02;

import java.util.Scanner;

public class Midia {

    protected int codigo;
    protected double preco;
    protected String nome;
    Scanner scan = new Scanner(System.in);

    public Midia() {}

    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    public String getDetalhes() {
        return "Codigo: " + codigo +
                "\nPreço: R$" + preco +
                "\nNome: " + nome;
    }

    public void printDados() {
        System.out.println(getTipo());
        System.out.println(getDetalhes());
    }

    public void inserirDados() {
        System.out.print("Digite o código: ");
        this.codigo = scan.nextInt();
        System.out.print("Digite o preço: R$");
        this.preco = scan.nextDouble();
        System.out.print("Digite o nome: ");
        this.nome = scan.next();
    }
}
