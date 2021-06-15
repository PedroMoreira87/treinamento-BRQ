package p2.p2e05;

public class TestaHorario {
	public static void main(String[] args) {

		Relogio cassio = new Relogio(17,2,25);
		cassio.exibeHorario();
		cassio.adiantar(86400);
		cassio.exibeHorario();
		cassio.atrasar(10);
		cassio.exibeHorario();
	}
}