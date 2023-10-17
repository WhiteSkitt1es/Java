package SealedInterface;

sealed interface PlantIf permits FruitIF {
    //
}
public sealed interface FruitIF extends PlantIf permits Apple, Pear, Grape {
    String type();
}
final class Apple implements FruitIF {
    @Override
    public String type() {
        return "Яблокок плод дерева";
    }
}
final class Pear implements FruitIF {
    @Override
    public String type() {
        return "Груша плод дерева";
    }
}
final class Grape implements FruitIF {
    @Override
    public String type() {
        return "Виноград плод виноградной лозы";
    }
}
