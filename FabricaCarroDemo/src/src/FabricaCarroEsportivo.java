package src;

//implementação concreta de uma fabrica de carros esportivos
class FabricaCarroEsportivo implements FabricaCarro<CarroEsportivo> {
    static CarroEsportivo createCarro() { return new CarroEsportivo();
    }
}