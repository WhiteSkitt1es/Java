public class Cat {
    /*
     * 1. Продумайте структуру класса Кот.
     * Какие поля и методы будут актуальны для приложения, которое является
     * a) информационной системой ветеринарной клиники
     * б) архивом выставки котов
     * в) информационной системой Театра кошек Ю. Д. Куклачёва
     * Можно записать в текстовом виде, не обязательно реализовывать в iava
     */

    private String name;
    private String owner;
    private String breed;
    private int age;

    public Cat(String name, String owner, String breed, int age) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Имя : " + name + "\n" + "Хозяин : " + owner + "\n" + "Порода : " + breed + "\n" + "Возраст : " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return name.equals(cat.name) && owner.equals(cat.owner) && breed.equals(cat.breed);
    }

    @Override
    public int hashCode() {
        return 2 * name.hashCode() + 3 * owner.hashCode() + 5 * breed.hashCode() + 7 * age;
    }
}
