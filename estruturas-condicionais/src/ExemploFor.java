public class ExemploFor {
    
    public static void main(String[] args) {

        // estrutura de repetição for (inicio / condição / incremento)

        for (int carneirinhos = 0; carneirinhos <=20; carneirinhos ++){
            System.out.println("Contando carneirinhos: " + carneirinhos);
        }

        String alunos [] = {"Jôao", "Marcos Sorvetão", "Jão do balão", "Muleke piranha"};

        for (int i = 0;  i < alunos.length; i++){
            System.out.println("Aluno de numero: " + (i+1) + " Nome: " + alunos[i]);
        }
        System.out.println("Finalizando a chamada");

        // For echea sobre arrays: Uma forma simples e agradavel de interar sobre os arrays

        for (String aluno: alunos){
            System.out.println("O nome do Aluno é: " + aluno);
        }


    }
}
