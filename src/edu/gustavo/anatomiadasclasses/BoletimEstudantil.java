package edu.gustavo.anatomiadasclasses; // ao mover um arquivo java da pasta raiz (src) para dentro de um pacote, é necessário acrescentar esta linha de código
                                        // que se refere ao pacote no qual o código (arquivo java, ou ainda, a Classe está inserida)

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 9;
        if(mediaFinal<6)	
            System.out.println("REPROVADO"); 
        else if(mediaFinal==6)
            System.out.println("PROVA MINERVA"); 
        else
            System.out.println("APROVADO"); 		
    }
}