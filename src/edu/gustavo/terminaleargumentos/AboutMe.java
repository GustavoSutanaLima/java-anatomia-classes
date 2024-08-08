package edu.gustavo.terminaleargumentos;

public class AboutMe {

    /**
     * <h1> main </h1>
     * O método main da Classe AboutMe tem como um parâmetro um array de Strings chamado args.
     * A posição dos elementos de um array inicia-se em zero;
     * O array de Strings conterá:
     * args[0] receberá o nome
     * args[1] receberá o sobrenome;
     * args[2] receberá o idade;
     * args[3] receberá o altura;
     * @param args Array de Strings
    
     */
    public static void main(String[] args) { 
        //o índice zero do array de String args zero, será o nome;
        String nome = args [0];
        //o índice 1 do array args será o sobrenome;
        String sobrenome = args [1];
        //o índice 2 será a idade Integer.valueOf irá converter a string para um valor numérico;
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        //o índice 3 será a idade Integer.valueOf irá converter a string para um valor numérico;
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
