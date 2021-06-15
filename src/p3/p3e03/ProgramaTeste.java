package p3.p3e03;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramaTeste {

	public static void main(String[] args) {

		Turma classeA = new Turma(1);
		Turma classeB = new Turma(2);

		classeA.input();
		classeA.print();
		classeB.input();
		classeB.print();

//		*************** Outro modo de fazer *************** UTILIZANDO GET ARRAY ***************
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Digite a quantidade de alunos da Turma "+classeA.getIdTurma()+" : ");
//
//		classeA.setQtdAlunos(sc.nextInt());
//		classeA.setNotas(new double [classeA.getQtdAlunos()]);
//
//		for (int i = 0; i < classeA.getNotas().length; i++) {
//			System.out.print("Digite a nota do aluno " + (i + 1) + " : ");
//			classeA.getNotas()[i] = sc.nextInt(); <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//			System.out.println(Arrays.toString(classeA.getNotas())); // verifica as notas sendo preenchidas no array (somente ilustrativo)
//		}
//		System.out.print("A média da Turma "+classeA.getIdTurma()+" É de : "+classeA.mediaTurma()+"\nE as notas maiores ou iguais a média da turma são: ");
//		classeA.notasSuperiores();
//		System.out.println("\n========================================");
	}
}
