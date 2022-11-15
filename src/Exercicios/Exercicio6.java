package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        // Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = input.nextDouble();

        double valorGanhoPorHora = 15;

        double salario = horasTrabalhadas * valorGanhoPorHora;

        System.out.println("Seu salário é: " + salario);
        input.close();
    }
}
