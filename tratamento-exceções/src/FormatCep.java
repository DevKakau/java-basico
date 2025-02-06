public class FormatCep {
    
    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatarCep("32323355");
            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
            System.out.println("O cep não está de acorod com as regras de negocio!!");
        }
    }

    static String formatarCep(String cep) throws CepInvalido {
        
        if(cep.length() != 8){
            throw new CepInvalido();
        }

        // simulando um cep formatado

        return "23.234-234";
    }
}
