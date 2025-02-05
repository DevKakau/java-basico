public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        // tipos de dados primitivos: 
        // int, double, float, char, boolean, byte, short, long 

        // declaração de variavel 
        // tipo / nome / valor 
        int idade = 10; 
        double altura = 1.75; 
        double peso = 74.5; 
        char sexo = 'M'; 

        System.out.println("Idade: " + idade + " altura: " + altura 
        + " peso: " + peso + " sexo: " + sexo);
        // constantes: Variaveis que o valor não será alterado
        // Utiliza a palavra reservada final e a nomeclatura das variaveis em maiusculo

        // esses valores abaixos não podem ser alterados no decorrer do codigo. 
        final double PI = 3.14;
        final int ANONASCIMENTO = 2006;

        System.out.println("Valor de PI: " + PI + " Ano de nascimento: " + ANONASCIMENTO);

        //No java String é uma classe: é um conjunto de caracteres, e não um tipo primitivo
        // seu valor é imutavel após a criação e existe alguns metodos para manipulação de strings 
        // como o metodo length() que retorna o tamanho da string

        // a duas formas de declararar uma string 
        String nome = "João"; 
        String sobrenome = new String("Silva"); 
        System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome);


    }
}
