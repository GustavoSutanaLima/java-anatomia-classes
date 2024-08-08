package edu.gustavo.terminaleargumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMeDois {
    public static void main() {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //inicia um objeto da classe Scanner chamado scanner que capitura inputs do usuário no terminarl;


        System.out.println("Digite seu nome:");
        String nome = scanner.next(); //faz a leitura da próxima string;

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt(); //faz a leitura da próxima string, converte esta para o tipo int e atribui a variável inteira int;

        System.out.println("Digite dua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }

}
