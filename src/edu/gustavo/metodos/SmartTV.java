package edu.gustavo.metodos;

public class SmartTV {

    //definindo os atributos da classe.:
    public int canal = 0;
    public boolean ligada = false;
    public int volume = 0;
  
    
    //metodo ligar.: (throws Exception quer dizer que, caso o usuário tente ligar uma tv ligada, não fará sentido, por isso é necessário 
    //barrar esta ação para evitar processamento indevido)
    public void ligar () {
        try {
            //expressão ternária.: compara ligada é falso? Se for, ligada receberá true, se não, nada acontecerá;
            ligada = ligada == false ? true : null;
        } catch (Exception e) {
            System.out.println("TV já está ligada!");
        }
    }
    public void desligar() {
        try {
            //expressão ternária.: compara ligada é true? Se for, ligada receberá false, se não, nada acontecerá;
            ligada = ligada == true ? false : null;
        } catch (Exception e) {
            System.out.println("TV já está desligada!");
        }
    }

    public void aumentarVolune() {
       volume++;
       if (volume >= 100) {
            volume = 100;
       }
    }

    public void diminuirVolume() {
        volume--;
        if (volume <= 0) {
            volume = 0;
       }
    }

    public void mudarCanalEspecífico (int numeroCanal) {
        canal = numeroCanal;
    }

    public void aumentarCanal() {
        canal++;
        if (canal >= 253) {
            canal = 253;
        }
     }
 
     public void diminuirCanal() {
        canal--;
         if (canal <= 0) {
            canal = 253;
        }
     }

}
