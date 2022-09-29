package tasks.task_7;

import java.util.Random;

public class ShellSort {
    private final int ARRAY_LEN = 16;
    private final int RAND_BORDER = 100;

    private double[] array;

    public ShellSort() {
        array = new double[ARRAY_LEN];
        Random rand = new Random();

        for (int i = 0; i < array.length; ++i) {
            array[i] = rand.nextInt(0, RAND_BORDER);
        }
    }

    public void sort() {
        int h = 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (int outer = h; outer < array.length; outer++) {
                double tmp = array[outer];
                int inner = outer;
                while (inner > h - 1 && array[inner - h] > tmp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = tmp;
            }
            h = (h - 1) / 3;
        }
    }

    public void print() {
        for (double val : array) {
            System.out.printf("%.2f  ", val);
        }
        System.out.println();
    }
}
