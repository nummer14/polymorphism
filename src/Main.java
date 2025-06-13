interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bow-wow!");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.makeSound();
    }
}