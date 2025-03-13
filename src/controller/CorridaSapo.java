package controller;

import java.util.Random;

public class CorridaSapo extends Thread {
    private static int colocacao = 1; // Controla a posição de chegada dos sapos
    private int idSapo;
    private int maxPulo;
    private int distanciaTotal;

    public CorridaSapo(int idSapo, int maxPulo, int distanciaTotal) {
        this.idSapo = idSapo;
        this.maxPulo = maxPulo;
        this.distanciaTotal = distanciaTotal;
    }

    @Override
    public void run() {
        Random random = new Random();
        int distanciaPercorrida = 0;

        System.out.println("🐸 Sapo " + idSapo + " iniciou a corrida!");

        while (distanciaPercorrida < distanciaTotal) {
            int pulo = random.nextInt(maxPulo + 1); // Gera um pulo aleatório de 0 até maxPulo
            distanciaPercorrida += pulo;

            System.out.println("🐸 Sapo " + idSapo + " pulou " + pulo + " metros. Distância total: " + distanciaPercorrida + "m");

            try {
                Thread.sleep(200); // Simula um tempo de pulo (200ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("🎉 Sapo " + idSapo + " chegou ao fim da corrida! 🏁 Posição: " + colocacao++);
    }
}
