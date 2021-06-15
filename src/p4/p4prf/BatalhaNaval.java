package p4.p4prf;

import java.util.ArrayList;
import java.util.Random;
import java.util.Date;

public class BatalhaNaval {

	public static Random r = new Random(new Date().getTime());

	public static void printNavio(ArrayList<Navio> pais) {
		for (Navio i : pais) {
			System.out.println(i);
		}
	}

	public static void BatalhaDoRiachuelo(ArrayList<Navio> a, ArrayList<Navio> b) {
		int cont = 0;
		double blindagem;

		while (a.size() > 0 && b.size() > 0) {

			if(!temNavioDeGuerra(a) && !temNavioDeGuerra(b)) {
				System.out.println("A guerra empatou!");
				break;
			}

			cont ++;

			Navio na = (Navio) a.get(r.nextInt(a.size()));
			Navio nb = (Navio) b.get(r.nextInt(b.size()));

			if(na instanceof NavioMercante && nb instanceof NavioMercante) {
				System.out.println(cont+") Dois navios mercantes");
				continue;
			}

			if(na instanceof NavioMercante && nb instanceof NavioDeGuerra) {
				System.out.println(cont+") Afundou navio mercante time A");
				a.remove(na);
				continue;
			}

			if(nb instanceof NavioMercante && na instanceof NavioDeGuerra) {
				System.out.println(cont+") Afundou navio mercante time B");
				b.remove(nb);
				continue;
			}

			if(na instanceof NavioDeGuerra && nb instanceof NavioDeGuerra) {
				System.out.println(cont+") Batalha de 2 Navios de Guerra");
				NavioDeGuerra ga = (NavioDeGuerra) na;
				NavioDeGuerra gb = (NavioDeGuerra) nb;
				blindagem = ga.getBlindagem()-gb.getAtaque();
				ga.setBlindagem(blindagem);
				blindagem = gb.getBlindagem()-ga.getAtaque();
				gb.setBlindagem(blindagem);
				if(ga.getBlindagem() < 0) {
					System.out.println(cont+") Navio de Guerra time A afundou");
					a.remove(na);
				}
				if(gb.getBlindagem() < 0) {
					System.out.println(cont+") Navio de Guerra time B afundou");
					b.remove(nb);
				}
			}
		}
		if(a.size() == 0)
			System.out.println("O time B ganhou");
		if(b.size() == 0)
			System.out.println("O time A ganhou");
	}

	public static boolean temNavioDeGuerra(ArrayList<Navio> al) {
		boolean tem = false;
		for(int i=0; i<al.size();i++) {
			Navio n = (Navio) al.get(i);
			if(n instanceof NavioDeGuerra) {
				tem = true;
				break;
			}
		}return tem;
	}

	public static void main(String [] args) {
		ArrayList<Navio> paraguay = new ArrayList<>();
		ArrayList<Navio> brasil = new ArrayList<>();

		paraguay.add(new PortaAvioes(1500,"Assuncion",1000, 500,10));
		paraguay.add(new Cruzador(50,"Caboto",500, 200, 20));
		paraguay.add(new Cruzador(50,"Cabeza de Vaca",300, 150, 10));
		paraguay.add(new NavioMercante(10,"Cisplatina",1000,50));
		paraguay.add(new NavioMercante(10,"Prata",500,10));

		brasil.add(new PortaAvioes(1000,"Curitiba",1500, 800,20));
		brasil.add(new Cruzador(60,"Pedro II",250, 250, 15));
		brasil.add(new Cruzador(70,"Tamandaré",350, 350, 30));
		brasil.add(new NavioMercante(10,"Bahia",1500,1000));
		brasil.add(new NavioMercante(10,"Maranhão",500,50));

		
        System.out.println("Frota Brasileira");
		printNavio(brasil);
        System.out.println("Frota Paraguaia");
		printNavio(paraguay);
		System.out.println(paraguay);
		
		BatalhaDoRiachuelo(brasil,paraguay);
	}
}
