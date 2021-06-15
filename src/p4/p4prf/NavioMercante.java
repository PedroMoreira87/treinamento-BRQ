package p4.p4prf;

public class NavioMercante extends Navio {
	private double capacidadeCarga;
	private double carga;
	
	public NavioMercante(int numTripulantes, String nome, double capacidadeCarga, double carga) {
		super(numTripulantes, nome);
		this.capacidadeCarga = capacidadeCarga;
		this.carga = carga;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	public void carregamento(int p1) {
		if (carga > capacidadeCarga)
			System.out.println("Impossível adicionar carga");
		else
			carga += p1;
		super.exibirInfoGeral();
		System.out.println("Volume ocupado.....:"+carga/capacidadeCarga);
	}

	@Override
	public String toString() {
		return "Navio Mercante: \n" +
				super.toString() +
				"\nCapacida de Carga: " + capacidadeCarga +
				"\nCarga: " + carga +
				"\n==============================";
	}
}
