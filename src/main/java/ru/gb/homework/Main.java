package ru.gb.homework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.firstMethod();
        main.secondMethod();
    }

    public void firstMethod() {
        int size = 10_000_000;
        float[] floats = new float[size];

        Arrays.fill(floats, 1);

        long start = System.currentTimeMillis();

        for (int i = 0; i < floats.length; i++)
            floats[i] = (float) (floats[i] * Math.sin(0.2f + i / 5f) * Math.cos(0.2f + i / 5f) * Math.cos(0.4f + i / 2f));

        System.out.println("firstMethod = " + (System.currentTimeMillis() - start));
    }

    private void secondMethod() {
        int size = 10_000_000;
        int h = size / 2;
        float[] floats = new float[size];

        Arrays.fill(floats, 1);

        long start = System.currentTimeMillis();

        float[] lFloats = Arrays.copyOfRange(floats, 0, h);
        float[] rFloats = Arrays.copyOfRange(floats, h, size);

        calculate(lFloats);
        calculate(rFloats);

        System.arraycopy(lFloats, 0, floats, 0, h);
        System.arraycopy(rFloats, 0, floats, h, h);

        System.out.println("secondMethod = " + (System.currentTimeMillis() - start));
    }

    private void calculate(float[] floats) {
        new Thread(() -> {
            for (int i = 0; i < floats.length; i++)
                floats[i] = (float) (floats[i] * Math.sin(0.2f + i / 5f) * Math.cos(0.2f + i / 5f) * Math.cos(0.4f + i / 2f));
        }).start();
    }
}
