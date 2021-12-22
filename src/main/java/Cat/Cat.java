package Cat;

import Animal.Animal;

public class Cat extends Animal {
    @Override
    public void voice() {
        super.voice(); // вызываем метод voice() суперкласса
        System.out.println("Кот мяукнул");
    }

    public void methodFromCatClass() {
    }
}

class CatsApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
    }
}
