
        // deve ser nomeado como verbo(ação) ex: somar, subtrair, dividir, multiplicar
        // deve ter um retorno, se não tiver retorno, deve ser void
        // deve ter parâmetros, se não tiver parâmetros, deve ser vazio
        // deve ser chamado dentro do método main
        

public class SmartTv {
    boolean ligada;
    int volume; 
    int canal;

    public SmartTv(){
        this.ligada = false; 
        this.volume = 0; 
        this.canal = 0; 
    }

    public void ligarDesligar(){
        if(this.ligada){
            this.ligada = false;
            System.out.println("Desligando a TV");
        }
        else {
            this.ligada = true; 
            System.out.println("Ligando a TV");
        }
    }

    public void aumentarVolume(){
        if(this.ligada){
            this.volume++;
            System.out.println("Aumentando o volume para: " + this.volume);
        }
        else {
            System.out.println("A TV está desligada.");
        }
    }

    public void diminuirVolume(){
        if(this.ligada){
            this.volume --;
            System.out.println("Diminuindo o volume para: " + this.volume);
        }
        else { 
            System.out.println("A TV está desligada. ");
        }
    }

    public void passarCanal(){
        if(this.ligada){
            this.canal++;
            System.out.println("Canal atual: " + this.canal);
        }
        else {
            System.out.println("A TV está desligada.");
        }
    }

    public void voltarCanal(){
        if(this.ligada){
            this.canal --;
            System.out.println("Canal atual: " + this.canal);
        }
        else {
            System.out.println("A TV está desligada.");
        }
    }

    public void escolherCanal(int canal){
        if(this.ligada){
            this.canal = canal;
            System.out.println("Canal atual: " + this.canal);
        }
        else {
            System.out.println("A TV está desligada.");
        }
    }

}
