package p3.p3e01;

public class Pessoa {
	private int idPessoa;
	private String nomePessoa;
	private Double alturaPessoa;
	//m�todos set/get
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public Double getAlturaPessoa() {
		return alturaPessoa;
	}
	public void setAlturaPessoa(Double alturaPessoa) {
		this.alturaPessoa = alturaPessoa;
	}
	//métodos construtores
	public Pessoa(int idPessoa, String nomePessoa, Double alturaPessoa) {
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.alturaPessoa = alturaPessoa;
	}
	public Pessoa() {

	}
	//método toString
	@Override
	public String toString() {
		return "\nPessoa:\nId = " + this.getIdPessoa() + "\nNome = " + this.getNomePessoa() + "\nAltura = " + this.getAlturaPessoa() + "\n";
	}
}
