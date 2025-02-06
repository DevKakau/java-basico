public class NotaEscolar {
    public static void main(String[] args) throws Exception {

        // declarando variaveis de nota 
        int nota1 = 10; 
        int nota2 = 7; 
        String situacao = " ";
        double media = (nota1 + nota2) / 2;

        // vamos criar uma estrutura condicional 

        // obs: se a estrutura condicional tiver mais de uma linha, deve se criar um bloco com {}
        if(media >= 7) {

            situacao = "Aprovado"; 
            System.out.println("O Aluno está: " + situacao);

        } else if (media  >=5 &&  media <=6 ){

            situacao = "Recuperação"; 
            System.out.println("O Aluno está: " + situacao);

        } else {

            situacao = "Reprovado"; 
            System.out.println("O Aluno está: " + situacao);
        }


        // Operadores ternarios
        int nota4 = 7; 
        String estado = nota4 >= 7 ? "Aprovado" : nota4 >=5 && nota4 <=6 ? "Recuperação" : "Reprovado"; // operador ternario representando if,  else-if and else. 
        System.out.println("Resultado da Aprovação através da ultima nota: " + estado);

        System.out.println("A média final do aluno é: " + media);

    }
}
