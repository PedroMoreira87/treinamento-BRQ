package p3.p3e03;

import java.util.Arrays;
import java.util.Scanner;

public class Turma {

	private int idTurma;
	private int qtdAlunos;
	private double[] notas;

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public int getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public Turma(int idTurma) {
		this.idTurma = idTurma;
	}

	public double mediaTurma() {
		double soma = 0.0; 
		for(double n: this.notas)
		soma += n; 
		return soma/notas.length; 
	}

	public void notasSuperiores() {
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= mediaTurma()) {
				if (i != notas.length - 1){
					System.out.print(notas[i]+", ");
				}else {
					System.out.print(notas[i]);
				}
			}
		}
	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de alunos da Turma "+idTurma+" : ");

		qtdAlunos = sc.nextInt();
		notas = new double [qtdAlunos];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do aluno " + (i + 1) + " : ");
			notas[i] = sc.nextInt();
			System.out.println(Arrays.toString(notas)); // verifica as notas sendo preenchidas no array (somente ilustrativo)
		}
	}

	public void print() {
		System.out.print("A média da Turma "+idTurma+" É de : "+mediaTurma()+"\nE as notas maiores ou iguais a média da turma são: ");
		notasSuperiores();
		System.out.println("\n========================================");
	}
}