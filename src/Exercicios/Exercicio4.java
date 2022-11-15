package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    // Faça um programa que receba 4 notas bimestrais e mostre a média aritmética.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a nota 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Informe a nota 2: ");
        double nota2 = input.nextDouble();

        System.out.println("Informe a nota 3: ");
        double nota3 = input.nextDouble();

        System.out.println("Informe a nota 4: ");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média das notas foram: %n" + media);

        input.close();
    }
}
