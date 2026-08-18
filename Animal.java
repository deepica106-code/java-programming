class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();

        c.eat();
        c.meow();
    }
}