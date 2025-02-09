package padroes;

public class FestaAniversario {

    public static void main(String[] args) {
        Namorada namor = new Namorada(); 
        Porteiro portei = new Porteiro(); 
       
        portei.registrarobservador(namor);
    
        portei.monitorar();
    }
}
