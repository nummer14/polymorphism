class Animal {
    public void makeSound() {
        System.out.println();
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹!");
    }
}

class Duck extends Animal {
    @Override
    public void makeSound() {
        System.out.println("꽥꽥!");
    }
}

class Pig extends Animal {
    @Override
    public void makeSound() {
        System.out.println("꿀꿀!");
    }
}
public class Main {
    public static void main(String[] args) {
    Animal a1 = new Dog();
    Animal a2 = new Cat();
    Animal a3 = new Duck();
    Animal a4 = new Pig();

    a1.makeSound();
    a2.makeSound();
    a3.makeSound();
    a4.makeSound();
    }
}