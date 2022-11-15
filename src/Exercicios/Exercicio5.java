package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        // Faça um programa que converta metros para centímetros.

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de metros que deseja converter para cm: ");
        double metragem = input.nextDouble();

        double conversaoParaCm = metragem * 100;

        System.out.println(metragem + "m para cm: " + conversaoParaCm);

        input.close();
    }
}
