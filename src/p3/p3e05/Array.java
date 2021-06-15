package p3.p3e05;

import java.util.Arrays;

public class Array {

    private boolean[] array;

    public boolean[] getArray() {
        return array;
    }

    public void setArray(boolean[] array) {
        this.array = array;
    }

    public Array(boolean[] array) {
        this.array = array;
    }

    public void input() {
        Arrays.fill(array, true);
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d %b | ", i, array[i]);
        }
    }

    void isPrime(boolean[] array) {
        // Check if number is less than equal to 1
        for (int i = 0; i < array.length; i++) {
            if (i <= 1) {
                array[i] = false;
            }
            // Check if number is 2
            else if (i == 2) {
                array[i] = true;
            }
            // Check if n is a multiple of 2
            else if (i % 2 == 0) {
                array[i] = false;
            }
            // If not, then just check the odds
            for (int j = 3; j <= Math.sqrt(i); j += 2) {
                if (i % j == 0) {
                    array[i] = false;
                    break;
                }
            }
        }
    }
}
