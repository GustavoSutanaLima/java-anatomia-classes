package edu.gustavo.documentacao;

/** // Barra duplo asterisco: inicia a documentação
 * <h1> Documentacao </h1>
 * Esta classe tem o propósito de exemplificar o conceito de documentação de classe
     * @author Gustavo Sutana Lima
     * @version 1.0
     * @since 08/08/2024
     * 
     **/ //Duplo asterisco barra: encerra a documentação classe

     //a documentaçaão deve ser escrita antes da classe ou método;

public class Documentacao {
    /**
     * Este método irá concatenar duas Strings, 
     * @param atributoStringUm será a primeira string a ser adicionada ao método;
     * @param atributoStringDois será a segunda string a ser adicionada ao método;
     * @return O resultado será atributoStringUm + atributoStringDois ;
     **/


    public static String exemploDocumentacao (String atributoStringUm, String atributoStringDois) {
        return atributoStringUm.concat(" ").concat(atributoStringDois);
    }

}
