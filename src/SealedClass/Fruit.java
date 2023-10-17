package SealedClass;

public sealed class Fruit permits Apple, Pear, Grape {
    //
}
final class Apple extends Fruit {
    //
}
final class Pear extends Fruit {
    //
}
final class Grape extends Fruit {

}
/* final class Pineapple extends Fruit {
    // Error
} */
