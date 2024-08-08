package edu.gustavo.operadores;

public class Operadores {
    public static void main(String[] args) {   
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA2"; //operador de adição, quando usando entre strings irá juntar, ou concaternar
                                                    //estas strings.
        System.out.println(nomeCompleto);

        String nomeCompletoDois = "Liguagem Java".concat(" ").concat("é voltada para projetos orientados a objeto!");

        //System.out.println(nomeCompletoDois);
                
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1"; //o opeador soma, quando usando com números irá, logicamente, somá-los. No entanto, 
                                  //quando usando com strings irá concatená-las;
                                  //o resultado aqui será: 31

        concatenacao = 1+"1"+1+1; //no etanto, a partir do momento que o compilador entende que um dos valores é uma string
                                  //o resultado passará a ser uma string, nesse caso não teremos 112 como resultado, mas
                                  //sim, o resultado será 1111;

        concatenacao = "1"+(1+1+1); //uma maneira de resolver este problema é usar parênteses. Tudo dentro dos parênteses será
                                    //executado primeiramente, indepente das operações que estão do lado de fora dele.
                                    //assim o resultado será 13. Soma-se os três númeors 1, ou seja 3. No entanto, o primeiro
                                    //"número" é na verdade uma String, portanto o resultado final será uma String pois é o tipo 
                                    // da variável concatenacao, porém o 3 (resultado da soma) será também interpretado como String;

        int numeroTeste = 10;
        numeroTeste = -numeroTeste;
        System.out.println(numeroTeste);

        boolean resultadoVerdadeiro = true;
        boolean resultadoFalso = !resultadoVerdadeiro; // ! nega a expressão que vem depois dele;

        System.out.println(resultadoVerdadeiro);
        System.out.println(resultadoFalso);

        //incrementação de valores:
        int numeroIncremento = 10;

        numeroIncremento = numeroIncremento + 1; // equivale à expressão : numeroIncremento++;
        //resultado aqui é 11

        numeroIncremento++;
        //resultado aqui é 12

        System.out.println(numeroIncremento);

        ++numeroIncremento;
        //resultado aqui é 13;

        System.out.println(numeroIncremento++);
        //aqui primeiramente será printado o númeroIncremento, depois a operação de incrementação será realizada (++ após vairável)
        //portanto o valor da variável numeroIncremento é 14, porém o nomento do print a soma ainda não havia sido realizada;

        System.out.println(++numeroIncremento);
        //aqui o incremento acontece primeiro, depois o print acontece, portanto tanto o valor exibido como o da variável serão 15.
    
        // OPERADOR TERNÁRIO: é possível montar uma estrutu condicional usando operador ternário "?:", vide exemplo:

        //if else convencional
        int a, b;
        a = 11;
        b = 110;

        if (a > b) {
            System.out.println("O valor A é maior do que o B");
        }
        else if (b > a) {
            System.out.println("O valor B é maior do que o A");
        }
        else {
            System.out.println("Valor A e B são iguais");
        }

       
        
        //if TERNÁRIO

        boolean c = a > b;

        String resultado = a > b ? "O valor de A é maior que o de B - TERNÁRIO" : "O valor de B é maior que o que de A - TERNÁRIO"; //expressão ternária
                                                                                                                                    //resultado recebe a primeira 
                                                                                                                                    //se a expressão for verdadeira
                                                                                                                                    //se for false, retorna a segunda;
        //estrutura da expressão.: <condição a ser verificada> ? <valor se verdadeiro> : <valor se falso>

        System.out.println(resultado);

        int a1 = 12;
        int b1 = 13;

        boolean c1 = a1 != b1; // c1 reberá true se a a1 for diferente de b1;

        int numeroResultado = c1 ? 1 : 0;

        System.out.println(numeroResultado);

        c1 = a1 == b1; // c1 reberá true se a a1 for igual a b1;

        numeroResultado = c1 ? 1 : 0;

        System.out.println(numeroResultado);


        //DICA DE COMPARAÇÃO.:

        //Na comparação variáveis, usar operador "==";

        //Na comparação de Objetos usar método equals();

        String nomeStringDois = "Gustavo";
        String nomeStringTres = new String("Gustavo");

        System.out.println(nomeStringDois ==  nomeStringTres);

        System.out.println(nomeStringDois.equals(nomeStringTres));


        //OPERADORES LOGICOS E (&&) OU (||).:

        boolean s;

        boolean aBoolean = false;
        boolean bBoolean = false;

        //Representando uma porta lógica AND.:
        System.out.println("Resultado por lógica AND:");
        if ( aBoolean == true && bBoolean == true ) {
            System.out.println("O resultado é true");
        }
        else {
            System.out.println("O resultado é false");
        }

        //Representando uma porta lógica OU.:

        System.out.println("Resultado por lógica OU:");
        if ( aBoolean == true || bBoolean == true ) {
            System.out.println("O resultado é true");
        }
        else {
            System.out.println("O resulado é falso");
        }
       
    
        //teste para pull!
    }


}
