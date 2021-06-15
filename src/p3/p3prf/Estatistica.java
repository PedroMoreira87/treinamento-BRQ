package p3.p3prf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Estatistica {

    private double[] valores;

    public double[] getValores() {
        return valores;
    }

    public void setValores(double[] valores) {
        this.valores = valores;
    }

    public Estatistica(double[] valores) {
        this.valores = valores;
    }

    public void ordena() {
        Arrays.sort(valores);
    }

    public double media() {
        double media = 0;
        for (double i : valores) {
            media += i;
        }return media / valores.length;
    }

    public List<Double> moda(double[] array) {
        List<Double> moda = new ArrayList<>();
        int maxCount = 2;
        for(int i=0; i<array.length; i++) {
            int count = 1;
            for(int j = i + 1; j<array.length; j++)
                if(array[i] == array[j]) count++;
            if(count >= maxCount) {
                if(count > maxCount) {
                    moda.clear();
                    maxCount = count;
                }moda.add(array[i]);
            }
        }return moda;
    }

    public double mediana(double[] array, int n) {
        ordena();
        if (n % 2 != 0)
            return (double)array[n / 2];
        return (double)(array[(n - 1) / 2] + array[n / 2]) / 2.0;
    }

    public double variancia() {
        double variancia = 0;
        for (int i = 0; i < valores.length; i++) {
            variancia += Math.pow(valores[i] - media(), 2);
        }return variancia /= valores.length;
    }

    public double desvioPadrao() {
        return Math.sqrt(variancia());
    }

    public void print() {
        for (double valor : valores) {
            System.out.print(valor+" | ");
        }
    }

    public void input() {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        }
    }
}
