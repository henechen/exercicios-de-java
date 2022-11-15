package Exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        // Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a temperatura atual em Fahrenheit: ");
        double tempFahrenheit = input.nextDouble();

        double conversao = (tempFahrenheit - 32) * 5/9;

        System.out.printf("A temperatura atual em Celsius é: %.2f", conversao);

        input.close();
    }
}
