package edu.gustavo.tiposdevariaveis;

public class TiposDeVariaveis {
    public static void main(String[] args) {
        //tipos primitivos.:
        //byte, short, int, long, float, double, boolean, char;
        byte minhaIdade = 29;
        short saldoBancario = 20000;
        final int VELOCIDADE_DA_LUZ = 299792458;
        float valorPassagemOnibus = 4.20F;
        boolean aprovado = true;
        char inicialNome = 'g'; //é necessário que o caracter esteja entre aspas simples;

        //NO CASO DE UM TEXTO, USAMOS A CLASSE STRING. EM JAVA, STRING É UMA CLASSE E NÃO UM TIPO PRIMITIVO.

        final String NOME_COMPLETO = "Gustavo Sutana Lima"; //Strings são colocadas entre aspas duplas

        String primeiroNome; // declaração da variável do tipo String com o nome primeiroNome;

        primeiroNome = "Gustavo"; //inicialização da variável primeiroNome (é atribuido um valor à esta variável);

        System.out.println(primeiroNome); //print o nome no terminal;
        




        long valorInteiro = 1234567891011L;
        //variaveis do tipo long são iguais às do tipo int, porém têm um range maior (mais possibilidades de valores), também ocupam mais memorória que a variável int;
        //ELAS PRECISAM DE UM "L" NO FINAL - particularidade da linguagem Java;
        float valorDecimal = 11.23F;
        //o memso acontece com o tipo float, mas nesse caso, coloca-se um "F" no final; 

        short numeroCurto = 1; //tipo short comporta um range maior que o tipo byte (ambos números inteiros)
        int numeroNormal = numeroCurto; //aqui atribuo a variável do tipo short a uma do tipo int;
        short numeroCurto2 = (short) numeroNormal; // aqui estou tentando atribuir uma variável do tipo int, 
                                                   // que comporta um range maior, a uma variável que comporta um range menor.
                                                   // Isso significa que em algum momento o valor da variável pode extrapolar o 
                                                   // range que seu tipo comporta, o que não é permitido.
                                                   // Para "corrigir" esse problema usa algo chamado CASTING
                                                   // O CAST, "coverte" um tipo no outro permitindo a atribuição
                                                   // aqui está sendo um feito um cast para short na variável numeroNormal;
                                                   // PODE HAVER PERCA DE VALORES OU INFORMAÇÕES DA VARIÁVEL;

        /*CONSTANTES*/
        //Constantes são declaradas em java usando-se a palavra chave final antes do tipo da vairável.
        //ALÉM DISSO, também são escritas, por convenção, em CAIXA-ALTA.:

        final double GRAVIDADE_TERRA = 9.81;
        final double CONSTANTE_EULER = 2.72;
        final int DATA_NASCIMENTO_DIA;

        // GRAVIDADE_TERRA = 12; <- ISSO NÃO PODE ACONTECER POIS UM VALOR FINAL JAMAIS PODERÁ SER ALTERADO UMA VEZ ATRIBUIDO.

        DATA_NASCIMENTO_DIA = 19; //<- aqui valor é atribuido um tempo depois da constante ser declarada, o que não tem problema.
                                  // no entanto, esse valor não poderá mais ser modificado;
        //ATENÇÃO: só escrever o nome da constante em caixa-alta NÃO é o suficiente para garantir que seu valor seja sempre
        //o mesmo, é preciso colocar a palavra reservada antes do tipo da constante; 

    }

}
