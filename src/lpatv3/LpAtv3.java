package lpatv3;

import java.util.Scanner;

public class LpAtv3 {

    public static void main(String[] args) {

        int ano_nasc, ano_atual, idade_ano, idade_meses, idade_semana, idade_dias, idade_horas;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano de seu nascimento: ");
        ano_nasc = entrada.nextInt();

        System.out.print("Digite o Ano Atual: ");
        ano_atual = entrada.nextInt();

        idade_ano = ano_atual - ano_nasc;

        idade_meses = idade_ano * 12;

        idade_dias = idade_ano * 365;

        idade_semana = idade_dias / 7;

        idade_horas = idade_dias * 24;

        System.out.println("Você tem " + idade_ano + " ANOS de vida.");

        System.out.println("Você tem " + idade_meses + " MESES de vida.");

        System.out.println("Você tem " + idade_dias + " DIAS de vida.");

        System.out.println("Você tem " + idade_semana + " SEMANAS de vida.");

        System.out.println("Você tem " + idade_horas + " HORAS de vida.");
    }

}
