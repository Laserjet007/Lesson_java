package Animal;

public class Animal {
    public void voice() {
        System.out.println("Животное издало какой-то звук");
    }
}
class Dog extends Animal {
}

class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("Кот мяукнул");
    }
}

class AnimalsApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.voice();
        cat.voice();
        dog.voice();
    }
}
