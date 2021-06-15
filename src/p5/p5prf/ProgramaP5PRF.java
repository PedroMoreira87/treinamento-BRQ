package p5.p5prf;

public class ProgramaP5PRF {

    public static void main(String[] args) {

        FabricaLampada fabricaLampada = new FabricaLampada();
//        FabricaLampada.Incandescente incandescente = fabricaLampada.new Incandescente(); // exemplo de instância de classe aninhada
//        FabricaLampada.Fluorescente fluorescente = fabricaLampada.new Fluorescente(); // exemplo de instância de classe aninhada

        fabricaLampada.construir();
    }
}
