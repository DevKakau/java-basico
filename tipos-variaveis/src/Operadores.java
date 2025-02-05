public class Operadores {
    
    public static void main(String[] args) {
        
        String nomeCompleto  = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);

        // operadores aritimecticos: 
        // +: SOMA, -: SUBTRAÇÃO , *: MULTIPLICAÇÃO, /: DIVISÃO, %: RESTO DA DIVISÃO 

        int soma = 10 + 10;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 10;
        int divisao = 10 / 2;;
        int resto = 10 % 2; 

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);

        // inversão de valores true e false
        // !: NOT -> o que for true vai se tornar false e o que for false vai se tornar true
        boolean verdadeiro = true;
        System.out.println("Verdadeiro: " + verdadeiro);
        
        verdadeiro = !verdadeiro; 
        System.out.println("Verdadeiro: " + verdadeiro);

        //  operador ternario 
        // (condição) ? valor verdadeiro : valor falso

        int a, b; 
        a = 10; 
        b = 10; 

        // uma forma resumida de fazer um if else: so vai funcionar com expressões booleanas, que tem como retorno true ou false
        String resultado = a==b ? "verdadeiro" : "falso"; 

        // com if else ficaria assim 
        // if (a==b)
        //     resultado = "verdadeiro";
        // else 
        //     resultado = "falso";

        System.out.println(resultado);


        // Operadores relacionais
        // ==: igual, !=: diferente, >: maior, <: menor, >=: maior ou igual, <=: menor ou igual: retornam true ou fals.

        int num1, num2;
        num1 = 10;
        num2 = 13; 

        String simNao = num1 == num2 ? "Sim" : "não";
        System.out.println("Os numeros são iguais: " + simNao);

        String simNao2 = num1 != num2 ? "Sim" : "não";
        System.out.println("Os numeros são diferentes: " + simNao2);

        String simNao3 = num1 > num2 ? "Sim" : "não";
        System.out.println("O primeiro numero é maior que o segundo: " + simNao3);

        String simNao4 = num1 < num2 ? "Sim" : "não";
        System.out.println("O primeiro numero é menor que o segundo: " + simNao4);

        String simNao5 = num1 >= num2 ? "Sim" : "não";
        System.out.println("O primeiro numero é maior ou igual ao segundo: " + simNao5);

        String simNao6 = num1 <= num2 ? "Sim" : "não";
        System.out.println("O primeiro numero é menor ou igual ao segundo: " + simNao6);

        // para comparação de Objetos é necessario usar o metodo equals

        String nome  = "Kauã"; 
        String nome1 = new String("Kauã");

        System.out.println(nome == nome1); // false
        System.out.println(nome.equals(nome1)); // true

        // Operadores Lógicos 
        // &&: AND -> as duas condições precisam ser verdadeiras para retornar true. 
        // ||: OR -> uma das condições precisa ser verdadeira para retornar true. 
        // !: NOT -> Inverte o valor de uma expressão booleana. 

        boolean condicao1 = true; 
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        // invertendo ou negando um valor

        //antes de inverter 
        System.out.println(condicao1); // true
        System.out.println(condicao2); // false
        //Depois da inversão 
        System.out.println(!condicao1); // false
        System.out.println(!condicao2); // true


    }
}
