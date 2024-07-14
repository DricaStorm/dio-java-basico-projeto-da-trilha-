public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void ligar() {
        System.out.println("iPhone ligado.");
    }
    
    public void desligar() {
        System.out.println("iPhone desligado.");
    }
    
    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música no iPhone.");
    }
    
    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada telefônica no iPhone.");
    }
    
    @Override
    public void navegar() {
        System.out.println("Navegando na internet no iPhone.");
    }
}
