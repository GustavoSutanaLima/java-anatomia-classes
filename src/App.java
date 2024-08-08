import edu.gustavo.metodos.SmartTV;

public class App {

    public static void main(String[] args) {
        SmartTV tvLG = new SmartTV(); //instancia o objeto da classe SmartTV chamado tvLG;
        tvLG.canal = 120;             //altera o atributo canal para o valor 120;
        tvLG.volume = 23;          //altera o atributo volume para o valor 23;

        System.out.println(tvLG.ligada); //printa o atributo ligada do objeto tvLG;
                                         //no momento da criação do objeto tvLG o seu atributo ligada é definido como false (nativamente);
                                         //a classe foi definida dessa forma;

        tvLG.ligar(); //usa o método ligar para mudar o estado da variável (atributo) ligada para true;

        System.out.println(tvLG.ligada); //printa o estado;

        tvLG.ligar(); //este método também print no terminal caso se a tv já estiver ligada;
        System.out.println(tvLG.ligada);

        tvLG.desligar();
        System.out.println(tvLG.ligada);
        tvLG.desligar();
        
        tvLG.aumentarVolune();
        System.out.println(tvLG.volume);
        tvLG.aumentarVolune();
        System.out.println(tvLG.volume);
        tvLG.aumentarVolune();
        System.out.println(tvLG.volume);

        for (int i = 0; i < 30; i++) {
            tvLG.diminuirVolume();
        }

        System.out.println(tvLG.volume);

        tvLG.mudarCanalEspecífico(123);

        System.out.println(tvLG.canal);

        tvLG.aumentarCanal();
        System.out.println(tvLG.canal);
        tvLG.aumentarCanal();
        System.out.println(tvLG.canal);
        tvLG.aumentarCanal();
        System.out.println(tvLG.canal);
        tvLG.aumentarCanal();
        System.out.println(tvLG.canal);
        tvLG.diminuirCanal();
        System.out.println(tvLG.canal);


        
    }

    
}
