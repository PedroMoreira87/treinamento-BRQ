package p2.p2e05;

public class Relogio {
	private int hora;
	private int minuto;
	private int segundo;

	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public Relogio(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public void adiantar(int seg) {
		int totseg =(hora*3600+minuto*60+segundo+seg)%86400;
		hora = totseg / 3600;
		totseg = totseg % 3600;
		minuto = totseg / 60;
		totseg = totseg % 60;
		segundo = totseg;
	}
	
	public void atrasar(int seg) {
		int totseg =(hora*3600+
				    minuto*60+
				    segundo+86400-seg%86400)%86400;
		hora = totseg / 3600;
		totseg = totseg % 3600;
		minuto = totseg / 60;
		totseg = totseg % 60;
		segundo = totseg;
	}

	public void exibeHorario() {
		System.out.println(hora+":"+minuto+":"+segundo);
	}
}