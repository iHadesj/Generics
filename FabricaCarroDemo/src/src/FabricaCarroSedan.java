package src;

//implementação concreta de uma fabrica de carros Sedan
class FabricaCarroSedan implements FabricaCarro<CarroSedan> {
    static CarroSedan createCarro() { return new CarroSedan();
    }
}