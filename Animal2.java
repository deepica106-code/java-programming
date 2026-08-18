class Animal2 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        c.eat();
        c.meow();

        d.eat();
        d.bark();
    }
}