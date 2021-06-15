package p3.p3e01;

import java.util.Scanner;

public class Principal {
	public static Scanner leitor = new Scanner (System.in);
	
	public static void main(String[] args) {
		Pessoa [] grupo = new Pessoa[3];
	
		grupo[0]= getPessoa();
		grupo[1]= getPessoa();
		grupo[2]= getPessoa();
		//exibindo atributos
		System.out.println(grupo[0]);
		System.out.println(grupo[1]);
		System.out.println(grupo[2]);
		//exibindo altura média
		System.out.printf("\nA média de altura= %.2f \n",  mediaAltura(grupo));
	}
	
	public static Pessoa getPessoa() {
		System.out.println("Dados");
		System.out.print("Id : ");
		int id = Integer.parseInt(leitor.nextLine());
		System.out.print("Nome: ");
		String nome = leitor.nextLine();
		System.out.print("Altura (m): ");
		double altura = Float.parseFloat(leitor.nextLine());
		return new Pessoa(id, nome, altura);
	}
	
	public static double mediaAltura(Pessoa[] p) {
		double soma = 0;
		for(Pessoa a: p) {
			soma += a.getAlturaPessoa();
		}
		return (soma/p.length);
	}
}
