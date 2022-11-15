package Exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        // Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês.
        // Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
        // 8% para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
        // Salário bruto.
        // Quanto pagou ao INSS.
        // Quanto pagou ao sindicato.
        // Qual o salário líquido do funcionário.

        Scanner input = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora: ");
        double salarioPorHora = input.nextDouble();

        System.out.println("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadasNoMes = input.nextDouble();

        double calcSalarioMes = salarioPorHora * horasTrabalhadasNoMes;

        double impostoDeRenda = calcSalarioMes * 0.11;
        double inss = calcSalarioMes * 0.08;
        double sindicato = calcSalarioMes * 0.05;
        double descontos = impostoDeRenda + inss + sindicato;

        double salarioFinal = calcSalarioMes - descontos;

        System.out.println("Pagamento:");
        System.out.println("Seu salário bruto foi de: " + calcSalarioMes);
        System.out.println();
        System.out.println("O valor debitado do imposto de renda foi de: " + impostoDeRenda);
        System.out.println();
        System.out.println("O valor debitado do INSS foi de: " + inss);
        System.out.println();
        System.out.println("O Valor debitado do sindicato foi de: " + sindicato);
        System.out.println();
        System.out.println("Seu salário líquido final é de: " + salarioFinal);

        input.close();
    }
}
