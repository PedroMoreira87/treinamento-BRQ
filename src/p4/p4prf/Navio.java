package p4.p4prf;

public class Navio {
	protected int numTripulantes;
	protected String nome;

	public Navio(int numTripulantes, String nome) {
		this.numTripulantes = numTripulantes;
		this.nome = nome;
	}

	public int getNumTripulantes() {
		return numTripulantes;
	}

	public String getNome() {
		return nome;
	}

	public void setNumTripulantes(int numTripulantes) {
		this.numTripulantes = numTripulantes;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibirInfoGeral() {
		System.out.println("Nome do Navio......:"+nome);
		System.out.println("Num Tripilantes....:"+numTripulantes);
	}

	@Override
	public String toString() {
		return	"Numero de Tripulantes: " + numTripulantes +
				"\nNome: " + nome;
	}
}
