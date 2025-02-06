import java.util.Random;

public class ExemploDoWhile {

    public static void main(String[] args) {
        // agora o DO WHILE: executa pelo menos uma vez para depois verificar se a condição é verdadeira

        System.out.println("Discando..");
        do {
            System.out.println("Tocando..");
        } while(tocando());

        System.out.println("Alo!");

        }

        private static boolean tocando(){
            boolean atendeu = new Random().nextInt(3)==1; // define a opçao de valores se cair 1 vai ser true e a retorna o valor e encerra o fluxo DO while 

            System.out.println("Atendeu:  " + atendeu);
            return ! atendeu;
        }
    }

