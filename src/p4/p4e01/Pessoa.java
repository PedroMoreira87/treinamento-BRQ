package p4.p4e01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Date dataNascimento;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Pessoa(String nome, String cpf, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double tirarCopias(int qtd) {
        return qtd * 0.10;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nCpf: " + cpf +
                "\nData de nascimento: " + sdf.format(dataNascimento);
    }
}
