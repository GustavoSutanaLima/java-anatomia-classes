public class MinhaClasse { 
    //**ANOTAÇÕES.:**
    //A CONVENÇÃO DE NOME DE CLASSE É LETRAS INICIAS DA PARALAVRA EM MAIÚSCULO SEGUIDA DA PRÓXIMA PALAVRA
    //TAMBÉM EM MAIÚSCULO;

    //O NOME DO ARQUIVO JAVA SEMPRE DEVE SER IGUAL AO NOME DA CLASSE PÚBLICA E ESTE
    //PRECISA ESTAR DENTRO DA PASTA "src";

    //TODA CLASSE PÚBLICA POSSUI UM METODO main QUE É DO TIPO VOID (NÃO RETORNA NADA, APENAS EXECUTA
    //LINHAS DE CÓDIGO);

    //métdo main
    public static void main(String[] args) {
        System.out.println("Olá turma DIO!");

        /* **DECLARAÇÕES DE VARIÁVEIS** 
        */

        double PI = 3.14; //GERALMENTE QUANDO SE USA VARIÁVEIS TODAS EM MAIÚSCULO SIGINFICA QUE ESSE VALOR
                          //NUNCA PODERÁ SER ALTERADO;
        final int DATA_NASCIMENTO = 1995; //OUTRA MANEIRA DE ESCREVER ISSO É USANDO O COMPLEMTNO 'final';

        int númeroTeste = 1; //É possível usar acentuação, embora não seja recomendado;

        númeroTeste = 2;

        final String BR_PORTUGUES = "Brasil";

        double dataDeNascimentoFornecedorDia = 18; //Esse padrão de escrita é chamado de camelCase, no qual;
                                                   //a próxima palavra se inicia em letra Maiúscula, porém
                                                   //a primeira palavra é em letra minúscula;
                                                   //nesse caso, a variável pode sofrer alterações já que 
                                                   //não está toda em maiúscula separado por underline;
                                                   
        /* **ESTRUTURA DE DECALRAÇÃO DE VARIÁVEL** 
            tipo nomeBemDefinido = Atribuição; (em alguns casos pode ser opicional),
            vide exemplo
        */
            int anoDeFabricacao = 1995;

        /* **ESTRUTURA DE DECALRAÇÃO DE MÉTODO** 
            modificador tipo nomeDoMétodo (parâmetros) {
                    xxx
                return xxx};
            vide exemplo
        */             
    }  
    //método somar: soma dois números inteiros e retorna um número inteiro:
    public static int somar (int número1, int número2) {
        return número1 + número2;
    }

    //método nomeCompleto.: retorna o nome e sobrenome concatenados:
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
