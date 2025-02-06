import java.util.Scanner;

public class SistemaMedida {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //utilizando a estruturando condicional Switch Case. 
        System.out.println("Informe a Sigla da sua medida: ex: (P, M, G)");
        String medida = scanner.next().trim().toUpperCase();
        
       switch (medida) {
        case "P":
            System.out.println("Sua medida é PEQUENA");            
            break;
        case "M":
            System.out.println("Sua medida é MÉDIA");
            break;
        case "G":
            System.out.println("Sua medida é GRANDE");
            break; 
        default:
            System.out.println("informe uma opção valida de medida!!");
            break;
       }

        scanner.close();
    }
}
