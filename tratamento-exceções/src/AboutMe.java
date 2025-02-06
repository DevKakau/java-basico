import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        // fazendo o tratamento de excerções com try catch
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);

        } catch (InputMismatchException e) { // tratando as exceções, imprimindo uma mensagem 
            System.out.println("A idade e a altura precisam ser valores numericos.");
        } 

        finally {
            scanner.close(); 
        }
        
    }
}
