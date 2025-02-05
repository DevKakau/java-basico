public class Usuario {
    public static void main(String[] args) throws Exception {

        // Criando um objeto da classe SmartTv
        
            SmartTv televisao = new SmartTv();
            televisao.ligarDesligar();
            televisao.aumentarVolume();
            televisao.aumentarVolume();
            televisao.aumentarVolume();
            televisao.aumentarVolume();
            televisao.aumentarVolume();
            televisao.diminuirVolume();
            televisao.ligarDesligar();
            televisao.passarCanal();
            televisao.voltarCanal();
            televisao.escolherCanal(10);
            televisao.ligarDesligar();
            televisao.ligarDesligar();
    
            System.out.println("tv ligada: " + televisao.ligada);
            System.out.println("volume: " + televisao.volume);
            System.out.println("canal: " + televisao.canal);
    
       


    }
}
