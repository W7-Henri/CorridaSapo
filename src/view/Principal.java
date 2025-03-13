package view;

import controller.CorridaSapo;

public class Principal {
    public static void main(String[] args) {
        int numSapos = 5;
        int distanciaCorrida = 50; // Distância total da corrida
        int maxPulo = 10; // Máximo que um sapo pode pular por vez

        // Criando e iniciando os sapos (Threads)
        for (int i = 1; i <= numSapos; i++) {
            Thread sapo = new CorridaSapo(i, maxPulo, distanciaCorrida);
            sapo.start();
        }
    }
}
