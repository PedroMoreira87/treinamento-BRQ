package p2.p2e03;

public class TestaContaCorrente {
	public static void main(String [] arg) {

		ContaCorrente cc = new ContaCorrente();

		cc.depositar(1500);
		cc.sacar(200);
		cc.sacar(500);

		System.out.println("Saldo..: " + cc.getSaldoCC());
	}
}