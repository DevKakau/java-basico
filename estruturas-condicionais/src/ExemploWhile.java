import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    
    public static void main(String[] args) {
        
        // While: essa estrutura de repetição executa enquanto a condição for verdadeira
     
        double mesada =  50.0; 

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada){
                valorDoce = mesada; 
            }

            System.out.println("Doce no valor de R$: " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce; 
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces.");
        
    }

    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
