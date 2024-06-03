package src;

/**
 * { @iHadesJ}
 */

//Classe para Teste
public class FabricaCarroDemo {
    public static void main(String[] args) {
        //Criando uma fabrica de carros Sedan
        FabricaCarro<CarroSedan> FabricaCarroSedan = new FabricaCarroSedan();
        CarroSedan carroSedan = src.FabricaCarroSedan.createCarro();
        carroSedan.start();
        
        // Criando uma fabrica de carros esportivos
        FabricaCarro<CarroEsportivo> CarroEsportivo = new FabricaCarroEsportivo();
        CarroEsportivo carroEsportivo = FabricaCarroEsportivo.createCarro();
        carroEsportivo.start();

    }
}
