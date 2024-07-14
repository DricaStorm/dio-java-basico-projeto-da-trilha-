# dio-java-basico-projeto-da-trilha-
dio-java-basico-projeto-da-trilha
classDiagram
    class IPhone {
        + ligar()
        + desligar()
        + reproduzirMusica()
        + fazerChamada()
        + navegar()
    }
    
    interface ReprodutorMusical {
        + reproduzirMusica()
    }
    
    interface AparelhoTelefonico {
        + fazerChamada()
    }
    
    interface NavegadorInternet {
        + navegar()
    }
    
    IPhone --|> ReprodutorMusical
    IPhone --|> AparelhoTelefonico
    IPhone --|> NavegadorInternet

